import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrintAgreementBillComponent } from './print-agreement-bill.component';

describe('PrintAgreementBillComponent', () => {
  let component: PrintAgreementBillComponent;
  let fixture: ComponentFixture<PrintAgreementBillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrintAgreementBillComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrintAgreementBillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
