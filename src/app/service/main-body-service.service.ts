import { UserStatus, UserStatusDataModel, MonthlyData } from './../Model/UserStatus';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MainBodyServiceService {

  private url = 'http://localhost:9000/status';

  constructor(private http: HttpClient) { }

  saveStatusData(id: string, data: MonthlyData[]) {
    console.log(data);
    return this.http.post(this.url + '/saveStatus', {
      userId: id,
      monthly: data
    });
  }

  fetchStatusData(userId: string) {
    return this.http.post(this.url + '/getUserStatusData', {
      userId
    });
  }
}

//key[0].toLocaleString('default', { month: 'long' }) + ' ' + (new Date().getFullYear()).toString()