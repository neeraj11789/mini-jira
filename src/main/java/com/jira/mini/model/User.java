package com.jira.mini.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class User extends Entity{

	private String name;

	private Team team;

}
