package com.jira.mini.model;

import com.jira.mini.util.Util;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Epic extends Card {

	private List<Sprint> sprints = new ArrayList<>();

	private Project project;

	private String org;

	public Epic(String title) {
		super(title);
	}

	public void addSprint(Sprint sprint){
		sprints.add(sprint);
	}
}
