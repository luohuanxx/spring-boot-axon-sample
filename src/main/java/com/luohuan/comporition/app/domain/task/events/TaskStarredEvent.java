package com.luohuan.comporition.app.domain.task.events;

import lombok.Value;

/**
 * @author albert
 */
@Value
public class TaskStarredEvent implements TaskEvent {

	private final String id;
}
