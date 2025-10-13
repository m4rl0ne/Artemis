import { Component } from '@angular/core';
import { TranslateDirective } from 'app/shared/language/translate.directive';
import { NgClass } from '@angular/common';

@Component({
    selector: 'jhi-exam-start-mode-picker',
    imports: [TranslateDirective, NgClass],
    templateUrl: './exam-start-mode-picker.component.html',
    styleUrl: './exam-start-mode-picker.component.scss',
})
export class ExamStartModePickerComponent {
    // exam = input.required<Exam>();
    // disableInput = input.required<boolean>();

    isDynamicStart: boolean = true;

    // what does this do
    // examModeChanged = output();

    /**
     * Sets the start mode between dynamic / fixed
     * @param startMode
     */
    setDynamicStart(startMode: boolean) {
        // TODO
        this.isDynamicStart = startMode;
    }
}
