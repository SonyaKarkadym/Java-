import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddlisttodoFormComponent } from './addlisttodo-form.component';

describe('AddlisttodoFormComponent', () => {
  let component: AddlisttodoFormComponent;
  let fixture: ComponentFixture<AddlisttodoFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddlisttodoFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddlisttodoFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
