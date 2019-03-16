package com.luohuan.comporition.app.domain.task.commands;

import lombok.Value;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * @author albert
 */
@Value
public class CompleteTaskCommand {

	@TargetAggregateIdentifier
	private final String id;
}