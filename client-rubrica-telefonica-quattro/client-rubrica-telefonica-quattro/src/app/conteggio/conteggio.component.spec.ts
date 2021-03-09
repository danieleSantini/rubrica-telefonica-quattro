import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConteggioComponent } from './conteggio.component';

describe('ConteggioComponent', () => {
  let component: ConteggioComponent;
  let fixture: ComponentFixture<ConteggioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConteggioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConteggioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
