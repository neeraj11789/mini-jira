package com.jira.mini.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SubTask extends Card{

	private Task task;

	public SubTask(String title) {
		super(title);
	}
}
