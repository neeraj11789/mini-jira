package com.jira.mini.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Card extends Entity{

	protected String title;

	private int storyPoints;

	private User assignee;

	private Status status = Status.TODO;

	public Card(String title) {
		this.title = title;
	}
}
