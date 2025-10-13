package de.tum.cit.aet.artemis.exam.dto.examevent;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A DTO for the {@link de.tum.cit.aet.artemis.exam.domain.event.ExamStartEvent} entity.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ExamStartEventDTO(Long id, Instant createdDate, boolean courseWide) implements ExamLiveEventBaseDTO {

}
