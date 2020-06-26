package com.jira.mini.service.impl;

import com.jira.mini.model.*;
import com.jira.mini.service.CardService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryCardServiceImpl implements CardService {

	private List<Dependency> dependencies = new ArrayList<>();
	private Map<String, Epic> epicMap = new HashMap<>();
	private Map<String, Story> storyMap = new HashMap<>();
	private Map<String, Task> taskMap = new HashMap<>();
	private Map<String, SubTask> subtaskMap = new HashMap<>();


	@Override
	public Epic createEpic(Epic epic) {
		epicMap.putIfAbsent(epic.getId(), epic);
		Dependency dependency = new Dependency(epic.getId(), null, DependencyType.CHILD_OF);
		addDependency(dependency);
		return epic;
	}

	@Override
	public Story createStory(Story story, Epic epic) {
		storyMap.putIfAbsent(story.getId(), story);
		Dependency dependency = new Dependency(story.getId(), epic.getId(), DependencyType.CHILD_OF);
		addDependency(dependency);
		return story;
	}

	@Override
	public Task createTask(Task task, Story story) {
		taskMap.putIfAbsent(task.getId(), task);
		Dependency dependency = new Dependency(task.getId(), story.getId(), DependencyType.CHILD_OF);
		addDependency(dependency);
		return task;
	}

	@Override
	public SubTask createSubTask(SubTask subTask, Task task) {
		return subTask;
	}

	@Override
	public void addDependency(Dependency dependency) {
		/**
		 * @todo
		 * Currently only adding new dependencies and not editing
		 */
		dependencies.add(dependency);
	}
}
