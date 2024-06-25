import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminOwnerNavComponent } from './admin-owner-nav.component';

describe('AdminOwnerNavComponent', () => {
  let component: AdminOwnerNavComponent;
  let fixture: ComponentFixture<AdminOwnerNavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminOwnerNavComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminOwnerNavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
