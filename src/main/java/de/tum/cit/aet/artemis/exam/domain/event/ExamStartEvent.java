package de.tum.cit.aet.artemis.exam.domain.event;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import de.tum.cit.aet.artemis.exam.dto.examevent.ExamStartEventDTO;

/**
 * An exam wide event to start the exam
 */
@Entity
@DiscriminatorValue(value = "S")
public class ExamStartEvent extends ExamLiveEvent {

    /**
     * The text content of the announcement.
     */
    @Column(name = "courseWide")
    private boolean courseWide;

    public boolean getCourseWide() {
        return courseWide;
    }

    public void setCourseWide(boolean courseWide) {
        this.courseWide = courseWide;
    }

    @Override
    public ExamStartEventDTO asDTO() {
        return new ExamStartEventDTO(this.getId(), this.getCreatedDate(), courseWide);
    }
}
