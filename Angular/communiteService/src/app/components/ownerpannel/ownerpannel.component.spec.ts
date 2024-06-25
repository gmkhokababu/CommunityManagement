import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OwnerpannelComponent } from './ownerpannel.component';

describe('OwnerpannelComponent', () => {
  let component: OwnerpannelComponent;
  let fixture: ComponentFixture<OwnerpannelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OwnerpannelComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OwnerpannelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
