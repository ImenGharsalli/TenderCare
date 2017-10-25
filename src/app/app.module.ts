import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { routing } from './app.routing';
import { AppComponent } from './app.component';
import {NgxPaginationModule} from 'ngx-pagination'; // <-- import the module
import { AngularFontAwesomeModule } from 'angular-font-awesome/angular-font-awesome';

import { CloudinaryModule } from '@cloudinary/angular-4.x';
import {SharedModule} from './shared/shared.module';
import * as  Cloudinary from 'cloudinary-core';
import { StartComponent } from './sign-up/start/start.component';
import { JobsComponent } from './jobs/jobs.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CreateJobsComponent } from './jobs/create-jobs/create-jobs.component';
import {CareTakersComponent} from './care-takers/care-takers.component';
import {CreateCareTakersComponent} from './care-takers/create-care-takers/create-care-takers.component';

@NgModule({
  declarations: [
    AppComponent,
    StartComponent,
    JobsComponent,
    CreateJobsComponent,
    CareTakersComponent,
    CreateCareTakersComponent
  ],
  imports: [NgbModule.forRoot(),
  BrowserModule,
  NgxPaginationModule,
  FormsModule,
  routing,
  HttpModule,
  ReactiveFormsModule,
  SharedModule,
  AngularFontAwesomeModule,
  CloudinaryModule.forRoot(Cloudinary, { cloud_name: 'igcloud'})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
