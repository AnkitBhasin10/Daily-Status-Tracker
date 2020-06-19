import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  userData = new BehaviorSubject<any>(null);

  constructor() { }

  loginSuccess(id: string) {
    console.log(id);
    this.userData.next(id);
  }
}
