import { Component, input, output } from '@angular/core';
import { Exam } from 'app/exam/shared/entities/exam.model';
import { TranslateDirective } from 'app/shared/language/translate.directive';
import { NgClass } from '@angular/common';

@Component({
    selector: 'jhi-exam-start-mode-picker',
    imports: [TranslateDirective, NgClass],
    templateUrl: './exam-start-mode-picker.component.html',
    styleUrl: './exam-start-mode-picker.component.scss',
})
export class ExamStartModePickerComponent {
    exam = input.required<Exam>();

    hasDynamicStartChanged = output();

    /**
     * Sets the start mode between dynamic / fixed and emit changes
     * @param hasDynamicStart
     */
    setDynamicStart(hasDynamicStart: boolean) {
        // TODO
        this.exam().hasDynamicStart = hasDynamicStart;
        this.hasDynamicStartChanged.emit();
    }
}
