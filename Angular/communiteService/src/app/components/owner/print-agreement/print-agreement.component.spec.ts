import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrintAgreementComponent } from './print-agreement.component';

describe('PrintAgreementComponent', () => {
  let component: PrintAgreementComponent;
  let fixture: ComponentFixture<PrintAgreementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrintAgreementComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrintAgreementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
