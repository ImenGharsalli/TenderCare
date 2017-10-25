import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateCareTakersComponent } from './create-care-takers.component';

describe('CreateCareTakersComponent', () => {
  let component: CreateCareTakersComponent;
  let fixture: ComponentFixture<CreateCareTakersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateCareTakersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateCareTakersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
