import { TestBed, async } from '@angular/core/testing';
import { CalendarRangeShowcaseComponent } from './app.component';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        CalendarRangeShowcaseComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(CalendarRangeShowcaseComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'dashboardCalendar'`, () => {
    const fixture = TestBed.createComponent(CalendarRangeShowcaseComponent);
    const app = fixture.componentInstance;
    // expect(app.title).toEqual('dashboardCalendar');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(CalendarRangeShowcaseComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('dashboardCalendar app is running!');
  });
});
