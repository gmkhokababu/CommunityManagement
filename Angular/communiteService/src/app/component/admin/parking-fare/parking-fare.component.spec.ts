import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParkingFareComponent } from './parking-fare.component';

describe('ParkingFareComponent', () => {
  let component: ParkingFareComponent;
  let fixture: ComponentFixture<ParkingFareComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParkingFareComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ParkingFareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
