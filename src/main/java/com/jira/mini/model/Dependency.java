package com.jira.mini.model;

import lombok.Data;

@Data
public class Dependency {

	private String node1;

	private String node2;

	private DependencyType type;
}
