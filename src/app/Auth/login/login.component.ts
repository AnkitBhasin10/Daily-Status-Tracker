import { CommonService } from './../../service/common.service';
import { LoginAndRegisterServiceService } from './../../service/login-and-register-service.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userLoginDetails = {
    email: '',
    password: ''
  };

  constructor(private router: Router, private userLoginService: LoginAndRegisterServiceService, private commonService: CommonService) { }

  ngOnInit() { }

  submit(e: NgForm) {
    this.userLoginService.postUserLogin(e.value.email).subscribe(data => {
      if (data !== null) {
        if (e.value.email === data.email && e.value.password === data.password) {
          this.commonService.loginSuccess(data.userId);
          this.router.navigate(['home']);
        } else {
          console.log('Credentials do not match');
        }
      }
      if (data === null) {
        console.log('no data found');
      }

    });
  }

  reset(e: NgForm) {
    console.log(e);
    e.reset();
  }
}
