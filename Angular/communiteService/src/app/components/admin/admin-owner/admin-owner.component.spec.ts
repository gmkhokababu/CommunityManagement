import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminOwnerComponent } from './admin-owner.component';

describe('AdminOwnerComponent', () => {
  let component: AdminOwnerComponent;
  let fixture: ComponentFixture<AdminOwnerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminOwnerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminOwnerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
