package com.jira.mini.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Story extends Card{

	private Epic epic;

	private Team team;

	private List<Dependency> dependencies;

	public Story(String title, Epic epic, Team team) {
		super(title);
		this.epic = epic;
		this.team = team;
	}
}