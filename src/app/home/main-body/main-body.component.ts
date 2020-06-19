import { CommonService } from './../../service/common.service';
import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { MainBodyServiceService } from 'src/app/service/main-body-service.service';
import { DatePipe } from '@angular/common';

@Component({
  selector: "app-main-body",
  templateUrl: "./main-body.component.html",
  styleUrls: ["./main-body.component.css"]
})
export class MainBodyComponent implements OnInit {
  statusForm: FormGroup;
  items: FormArray;
  date: Date;
  status: string;
  userId: string;

  constructor(private fb: FormBuilder, private userStatusService: MainBodyServiceService, private datePipe: DatePipe,
    private commonService: CommonService) { }

  ngOnInit() {

    this.commonService.userData.subscribe(id => {
      this.userId = id;
    });

    this.statusForm = this.fb.group({
      items: this.fb.array([
        this.fb.group({
          date: new FormControl(""),
          status: new FormControl("")
        })
      ])
    });
  }

  createStatusForm() {
    const newStatusForm = this.fb.group({
      date: new FormControl(""),
      status: new FormControl("")
    });

    this.DailyStatusForm.push(newStatusForm);
  }

  get DailyStatusForm() {
    return this.statusForm.get("items") as FormArray;
  }

  deleteStatusForm(i: number) {
    if (this.DailyStatusForm.length > 1) {
      this.DailyStatusForm.removeAt(i);
    }
  }

  onSave() {
    this.DailyStatusForm.controls.map(data => {
      this.date = data.value.date;
      this.status = data.value.status;
      this.userStatusService.saveStatusData({
        date: this.date,
        status: this.status,
        userId: this.userId
      }).subscribe(res => {

      });
    });
  }
}
