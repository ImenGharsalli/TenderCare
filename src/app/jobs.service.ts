import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import 'rxjs/add/operator/map';

@Injectable()
export class JobsService {

  constructor(private http : Http) { 
     console.log('JobsService Initialized...');
  }
 getJobs():Observable<any>{
    return this.http.get('http://localhost:8080/allJobs').map(res => res.json());
  }
}
