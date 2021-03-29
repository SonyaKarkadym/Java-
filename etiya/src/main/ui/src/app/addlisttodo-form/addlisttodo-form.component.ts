import { Component, OnInit } from '@angular/core';
import {Listtodo} from "../listtodo";
import {ActivatedRoute, Router} from "@angular/router";
import {ListtodoServiceService} from "../listtodo-service.service";

@Component({
  selector: 'app-addlisttodo-form',
  templateUrl: './addlisttodo-form.component.html',
  styleUrls: ['./addlisttodo-form.component.css']
})
export class AddlisttodoFormComponent {

  listtodo: Listtodo = {
    id: 0,
    title: "",
    createdAt: Date.now().toString(),
    updatedAt: Date.now().toString()
  };

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private listtodoService: ListtodoServiceService) {

  }

  onSubmit() {
    this.listtodoService.add(this.listtodo).subscribe(result => this.gotoListToDoList());
  }

  gotoListToDoList() {
    this.router.navigate(['/listtodo']);
  }

}
