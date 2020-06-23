package com.jira.mini.model;

import lombok.Data;

@Data
public class Task extends Card{

	private Story story;
}
