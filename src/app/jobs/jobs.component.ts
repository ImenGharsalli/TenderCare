import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { JobsService } from '../jobs.service';

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.css']
})
export class JobsComponent implements OnInit {
    p: number = 1;
  jobs: Job[];
 heroForm: FormGroup;
   constructor(private jobsService: JobsService, private fb: FormBuilder) { // <--- inject FormBuilder
    this.createForm();
   this.jobsService.getJobs().subscribe(jobs => {
      this.jobs = jobs;
    });
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
interface Job {
  jobFunction: string;
  description: string;
  location: string;
  postDate: Date;
  expirationDate: Date;
  estimatedBudget: Float32Array;
  userid: string;
  userFirstName: string;
  userLastName: string;
  imageId: string;
}