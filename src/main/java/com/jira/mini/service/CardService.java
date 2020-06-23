package com.jira.mini.service;

import com.jira.mini.model.Card;
import com.jira.mini.model.Epic;
import com.jira.mini.model.Story;

public interface CardService {

	void createEpic(Epic epic);

	void createStory();

	void createTask();

	void createSubTask();

	void addDependency();
}
