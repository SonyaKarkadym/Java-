import {Component, Input, OnInit} from '@angular/core';
import {Listtodo} from "../listtodo";
import {ListtodoServiceService} from "../listtodo-service.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-listtodo',
  templateUrl: './listtodo.component.html',
  styleUrls: ['./listtodo.component.css']
})
export class ListtodoComponent implements OnInit {

  @Input()listtodos!: Listtodo[];

  constructor(private listtodoService: ListtodoServiceService,
              private router: Router) {
  }

  ngOnInit() {
    this.listtodoService.findAll().subscribe(data => {
      this.listtodos = data;
    });
  }

  onListToDoDelete(id: number){
    this.listtodoService.delete(id).subscribe(data => {
      this.router.navigate(['/listtodo']);
    });
  }

}
