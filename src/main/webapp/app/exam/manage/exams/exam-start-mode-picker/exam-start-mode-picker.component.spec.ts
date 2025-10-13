import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExamStartModePickerComponent } from './exam-start-mode-picker.component';

describe('ExamStartModePickerComponent', () => {
    let component: ExamStartModePickerComponent;
    let fixture: ComponentFixture<ExamStartModePickerComponent>;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [ExamStartModePickerComponent],
        }).compileComponents();

        fixture = TestBed.createComponent(ExamStartModePickerComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
