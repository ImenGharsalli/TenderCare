import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-create-care-takers',
  templateUrl: './create-care-takers.component.html',
  styleUrls: ['./create-care-takers.component.css']
})
export class CreateCareTakersComponent {
    showHobbies: boolean;
    heroForm: FormGroup; // <--- heroForm is of type FormGroup

 constructor(private fb: FormBuilder) { // <--- inject FormBuilder
    this.showHobbies=false;
    this.createForm();
  }


toggleHobbies(){
    if (this.showHobbies==true){
            this.showHobbies=false;
    }
    else{
            this.showHobbies=true;
    }
}

  myControl: FormControl = new FormControl();

  options = [
    'One',
    'Two',
    'Three'
   ];

createForm() {
    this.heroForm = this.fb.group({
      jobFunction: ['', Validators.required ],
      address: ['', Validators.required ],
      cityStateZip: ['',  Validators.required],
      expirationDate: ['', Validators.required ],
      description: ['', Validators.required ],
    });
  }
}