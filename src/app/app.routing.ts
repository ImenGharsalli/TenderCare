
import {ModuleWithProviders} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

import {StartComponent} from './sign-up/start/start.component';
import {JobsComponent} from './jobs/jobs.component';
import {CreateJobsComponent} from './jobs/create-jobs/create-jobs.component';
import {CareTakersComponent} from './care-takers/care-takers.component';
import {CreateCareTakersComponent} from './care-takers/create-care-takers/create-care-takers.component';


const appRoutes: Routes = [
    {
        path: 'jobs',
        component: JobsComponent
    },
     {
        path: 'start',
        component: StartComponent
    },
     {
        path: 'createJobs',
        component: CreateJobsComponent
     },
     {
        path: 'careTakers',
        component: CareTakersComponent
    },
     {
        path: 'createCareTakers',
        component: CreateCareTakersComponent
    }
];
export const routing: ModuleWithProviders=RouterModule.forRoot(appRoutes);  