import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import 'rxjs/add/operator/map';

@Injectable()
export class CareTakersService {

  constructor(private http : Http) { 
     console.log('CareTakersService Initialized...');
  }
 getCareTakers():Observable<any>{
    return this.http.get('http://localhost:8080/careTakers').map(res => res.json());
  }
}
