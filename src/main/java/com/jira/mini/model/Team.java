package com.jira.mini.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Team extends Entity{

	private String name;

	private Vertical vertical;
}
