package com.jira.mini.model;

import com.jira.mini.util.Util;

import java.util.List;

public class Epic extends Card {

	private List<Sprint> sprints;

	private Project project;

	private String org = Util.ORG;

	public Epic(String title) {
		super(title);
	}
}
