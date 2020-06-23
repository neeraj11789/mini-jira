package com.jira.mini.service.impl;

import com.jira.mini.model.Dependency;
import com.jira.mini.model.Epic;
import com.jira.mini.service.CardService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryCardServiceImpl implements CardService {

	private List<Dependency> dependencies = new ArrayList<>();
	private Map<String, Epic> epicMap = new HashMap<>();

	/**
	 * @param epic
	 */
	@Override
	public void createEpic(Epic epic) {
		epicMap.putIfAbsent(epic.getId(), epic);
	}

	@Override
	public void createStory() {

	}

	@Override
	public void createTask() {

	}

	@Override
	public void createSubTask() {

	}

	@Override
	public void addDependency() {

	}
}
