import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListtodoComponent} from "./listtodo/listtodo.component";
import {AddlisttodoFormComponent} from "./addlisttodo-form/addlisttodo-form.component";
import {EditlisttodoFormComponent} from "./editlisttodo-form/editlisttodo-form.component";

const routes: Routes = [
  { path: 'listtodo', component: ListtodoComponent },
  { path: 'addlisttodo', component: AddlisttodoFormComponent },
  { path: 'editlisttodo', component: EditlisttodoFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
