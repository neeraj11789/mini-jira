package com.jira.mini.service;

import com.jira.mini.model.*;

public interface CardService {

	Epic createEpic(Epic epic);

	Story createStory(Story story, Epic epic);

	Task createTask(Task task, Story story);

	SubTask createSubTask(SubTask subTask, Task task);

	void addDependency(Dependency dependency);
}
