import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
@Component({
  selector: 'app-start',
  templateUrl: './start.component.html',
  styleUrls: ['./start.component.css']
})
export class StartComponent implements OnInit {

   isLinear = false;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;

  constructor(private _formBuilder: FormBuilder) { }

  ngOnInit() {
    this.firstFormGroup = this._formBuilder.group({
      gender: ['', Validators.required],
      userAddress: ['', Validators.required],
      userCityStateZip: ['', Validators.required],
      telephone: ['', Validators.required]
    });
    this.secondFormGroup = this._formBuilder.group({
       jobFunction: ['', Validators.required],
       jobAddress: ['', Validators.required],
       jobCityStateZip : ['', Validators.required],
       expirationDate: ['', Validators.required],
       description: ['', Validators.required],
    });
  }
}