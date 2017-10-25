import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CareTakersComponent } from './care-takers.component';

describe('CareTakersComponent', () => {
  let component: CareTakersComponent;
  let fixture: ComponentFixture<CareTakersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CareTakersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CareTakersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
