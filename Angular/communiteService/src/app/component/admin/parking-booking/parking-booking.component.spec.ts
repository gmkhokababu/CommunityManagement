import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParkingBookingComponent } from './parking-booking.component';

describe('ParkingBookingComponent', () => {
  let component: ParkingBookingComponent;
  let fixture: ComponentFixture<ParkingBookingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParkingBookingComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ParkingBookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
