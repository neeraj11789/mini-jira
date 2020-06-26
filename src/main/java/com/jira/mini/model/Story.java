package com.jira.mini.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Story extends Card{

	@Getter @Setter
	private Epic epic;

	@Getter @Setter
	private Team team;

	public Story(String title) {
		super(title);
	}
}