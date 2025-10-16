package de.tum.cit.aet.artemis.exam.domain.event;

import java.time.ZonedDateTime;

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

    @Column(name = "startDate")
    private ZonedDateTime startDate;

    public boolean getCourseWide() {
        return courseWide;
    }

    public void setCourseWide(boolean courseWide) {
        this.courseWide = courseWide;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public ExamStartEventDTO asDTO() {
        return new ExamStartEventDTO(this.getId(), this.getCreatedDate(), startDate, courseWide);
    }
}
