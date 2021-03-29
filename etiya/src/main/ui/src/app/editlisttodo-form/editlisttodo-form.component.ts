import {Component, Input, OnInit} from '@angular/core';
import {Listtodo} from "../listtodo";
import {ActivatedRoute, Router} from "@angular/router";
import {ListtodoServiceService} from "../listtodo-service.service";

@Component({
  selector: 'app-editlisttodo-form',
  templateUrl: './editlisttodo-form.component.html',
  styleUrls: ['./editlisttodo-form.component.css']
})
export class EditlisttodoFormComponent implements OnInit{

  @Input() listtodo: Listtodo;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private listtodoService: ListtodoServiceService) {

  }

  ngOnInit() {
  }

  onSubmit() {
    this.listtodoService.edit(this.listtodo).subscribe(result => this.gotoListToDoList());
  }

  gotoListToDoList() {
    this.router.navigate(['/listtodo']);
  }

}
