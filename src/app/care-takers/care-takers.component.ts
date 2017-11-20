import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CareTakersService } from '../care-takers.service';

@Component({
  selector: 'app-care-takers',
  templateUrl: './care-takers.component.html',
  styleUrls: ['./care-takers.component.css']
})
export class CareTakersComponent implements OnInit {
    p: number = 1;
    careTakers: CareTaker[];
    careTakerForm: FormGroup;
   constructor(private careTakersService: CareTakersService, private fb: FormBuilder) { // <--- inject FormBuilder
    this.createForm();
   this.careTakersService.getCareTakers().subscribe(careTakers => {
      this.careTakers = careTakers;
    });
   }

  ngOnInit() {
  }
createForm() {
    this.careTakerForm = this.fb.group({
      function: [''],
      townStatePostalCode: ['' ],
    });
  }
}
interface CareTaker {
  jobFunction: string;
  description: string;
  location: string;
  estimatedBudget: Float32Array;
  userid: string;
  userFirstName: string;
  userLastName: string;
  imageId: string;
}