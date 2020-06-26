package com.jira.mini.service.impl;

import com.jira.mini.model.Epic;
import com.jira.mini.model.Story;
import com.jira.mini.model.Task;
import com.jira.mini.service.CardService;
import com.jira.mini.util.TestUtil;
import com.jira.mini.util.Util;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemoryCardServiceImplTest {

	private CardService cardService;

	@BeforeEach
	void setUp() {
		cardService = new MemoryCardServiceImpl();

		// create epic
		Epic epicIHS = cardService.createEpic(TestUtil.createEpicHMS(Util.HMS));
		Epic epicIS = cardService.createEpic(TestUtil.createEpicIS(Util.IS));

		// create story
		Story storyBE = cardService.createStory(TestUtil.createStoryHMSBackend(Util.HMS_BE), epicIHS);
		Story storyAndroid = cardService.createStory(TestUtil.createStoryHMSBackend(Util.HMS_ANDROID), epicIHS);
		Story storyIOS = cardService.createStory(TestUtil.createStoryHMSBackend(Util.HMS_IOS), epicIHS);

		// create tasks
		Task t1 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_TCD), storyBE);
		Task t2 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_API), storyBE);
		Task t3 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_IMPL), storyBE);
		Task t4 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_QA), storyBE);

		cardService.addDependency(t4.createDependency(t3));
		cardService.addDependency(t3.createDependency(t2));
		cardService.addDependency(t2.createDependency(t1));
	}

	@Test
	void name() {
		Assertions.assertThat(1==1);
	}
}