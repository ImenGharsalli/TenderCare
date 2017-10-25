import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CareTakersComponent } from './care-takers.component';
import { CreateCareTakersComponent } from './create-care-takers/create-care-takers.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [CareTakersComponent, CreateCareTakersComponent]
})
export class CareTakersModule { }
