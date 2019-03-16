package com.luohuan.comporition.app.notify.task;

import lombok.Value;
import com.luohuan.comporition.app.domain.task.events.TaskEvent;

@Value
public class TaskEventNotification {
	
	private String type;
	
	private TaskEvent data;
}
