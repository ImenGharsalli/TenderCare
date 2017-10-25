import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-care-takers',
  templateUrl: './care-takers.component.html',
  styleUrls: ['./care-takers.component.css']
})
export class CareTakersComponent implements OnInit {
 heroForm: FormGroup;
   constructor(private fb: FormBuilder) { // <--- inject FormBuilder
    this.createForm();
  }

  ngOnInit() {
  }
createForm() {
    this.heroForm = this.fb.group({
      function: [''],
      townStatePostalCode: ['' ],
    });
  }
}
