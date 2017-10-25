import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-create-jobs',
  templateUrl: './create-jobs.component.html',
  styleUrls: ['./create-jobs.component.css']
})
export class CreateJobsComponent {
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

createForm() {
    this.heroForm = this.fb.group({
      jobFunction: ['', Validators.required ],
      address: ['', Validators.required ],
      cityStateZip: ['',  Validators.required],
      expirationDate: ['', Validators.required ],
      description: ['', Validators.required ]
    });
  }
}