import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Listtodo} from "./listtodo";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ListtodoServiceService {
  private readonly listToDoUrl: string;

  constructor(private http: HttpClient) {
    this.listToDoUrl = 'http://localhost:8080/ListToDo';
  }

  public findAll(): Observable<Listtodo[]> {
    return this.http.get<Listtodo[]>(this.listToDoUrl);
  }

  public add(listToDo: Listtodo) {
    return this.http.post<Listtodo>(this.listToDoUrl + "/create", listToDo);
  }

  public edit(listToDo: Listtodo) {
    return this.http.put<Listtodo>(this.listToDoUrl + "/update", listToDo);
  }

  public delete(id: number) {
    let params = new HttpParams();
    params = params.append('id', String(id));
    return this.http.delete<number>(this.listToDoUrl + "/delete", {params});
  }
}
