import { Component, OnInit } from '@angular/core';
import { Contatto } from './contatto';

@Component({
  selector: 'app-campi',
  templateUrl: './campi.component.html',
  styleUrls: ['./campi.component.css']
})
export class CampiComponent implements OnInit {
  contatto:Contatto;

  constructor() { }

  ngOnInit(): void {
  }
  
}
