import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { CalendarRangeShowcaseComponent } from './app.component';
import { NbLayoutModule, NbCardModule, NbCalendarModule, NbThemeModule, NbCalendarRangeModule } from '@nebular/theme';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    CalendarRangeShowcaseComponent,
    
  ],
  imports: [
    BrowserModule,
    NbThemeModule.forRoot(),
    NbCalendarModule,
    NbCalendarRangeModule,
    NbCardModule,
    FormsModule,
    NbLayoutModule,
    
  ],
  providers: [],
  bootstrap: [CalendarRangeShowcaseComponent]
})
export class AppModule { }
