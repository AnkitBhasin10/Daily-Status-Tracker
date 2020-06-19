import { UserStatus } from './../Model/UserStatus';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MainBodyServiceService {

  private url = 'http://localhost:9000/status';

  constructor(private http: HttpClient) { }

  saveStatusData(userStatus: UserStatus) {
    console.log(userStatus);
    return this.http.post(this.url + '/saveStatus', {
      date: userStatus.date,
      status: userStatus.status
    });
  }

  fetchStatusData(userId: string) {
    return this.http.post(this.url + '/getUserStatusData', {
      userId
    });
  }
}

