package com.jira.mini.service.impl;

import com.jira.mini.model.Story;
import com.jira.mini.model.Task;
import com.jira.mini.service.CardService;
import com.jira.mini.util.TestUtil;
import com.jira.mini.util.Util;
import org.junit.jupiter.api.BeforeEach;

class MemoryCardServiceImplTest {

	private CardService cardService;

	@BeforeEach
	void setUp() {
		cardService = new MemoryCardServiceImpl();

		// create epic
		cardService.createEpic(TestUtil.createEpicHMS(Util.HMS));
		cardService.createEpic(TestUtil.createEpicIS(Util.IS));

		// create story
		Story storyBE = cardService.createStory(TestUtil.createStoryHMSBackend(Util.HMS_BE), TestUtil.createEpicHMS(Util.HMS));
		Story storyAndroid = cardService.createStory(TestUtil.createStoryHMSBackend(Util.HMS_ANDROID), TestUtil.createEpicHMS(Util.HMS));
		Story storyIOS = cardService.createStory(TestUtil.createStoryHMSBackend(Util.HMS_IOS), TestUtil.createEpicHMS(Util.HMS));

		// create tasks
		Task t1 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_TCD), storyBE);
		Task t3 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_API), storyBE);
		Task t2 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_IMPL), storyBE);
		Task t4 = cardService.createTask(TestUtil.createTaskTCDBackendIHS(Util.HMS_BE_QA), storyBE);
	}

}