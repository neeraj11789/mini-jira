package com.jira.mini.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Task extends Card{

	private Story story;

	private List<Dependency> dependencies = new ArrayList<>();

	public Task(String title) {
		super(title);
	}

	public Dependency createDependency(Task dependentTask){
		Dependency dependency = new Dependency(story.getId(), dependentTask.getId(), DependencyType.DEPENDS_ON);
		return dependency;
	}
}
