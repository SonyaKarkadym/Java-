import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListtodoComponent } from './listtodo/listtodo.component';
import { HttpClientModule } from '@angular/common/http';
import {ListtodoServiceService} from "./listtodo-service.service";
import { AddlisttodoFormComponent } from './addlisttodo-form/addlisttodo-form.component';
import {FormsModule} from "@angular/forms";
import {EditlisttodoFormComponent} from "./editlisttodo-form/editlisttodo-form.component";

@NgModule({
  declarations: [
    AppComponent,
    ListtodoComponent,
    AddlisttodoFormComponent,
    EditlisttodoFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ListtodoServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
