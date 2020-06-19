import { UserLogin } from 'src/app/Model/UserLogin';
import { Injectable, EventEmitter } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginAndRegisterServiceService {

  userData = new EventEmitter();

  private url = 'http://localhost:9000';

  constructor(private http: HttpClient) { }

  postUserLogin(email: string) {

    return this.http.post<UserLogin>(this.url + '/login', {
      email
    });
  }
}
