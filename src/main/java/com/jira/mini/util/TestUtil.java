package com.jira.mini.util;

import com.jira.mini.model.*;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDateTime;

public class TestUtil {
	public static final String ORG = "Halodoc";

	public static final Sprint SPRINT1 = new Sprint("Sprint1",
			LocalDateTime.now(),
			LocalDateTime.now().plusWeeks(2),
			"no descrption");

	public static final Sprint SPRINT2 = new Sprint("Sprint2",
			LocalDateTime.now().plusWeeks(2),
			LocalDateTime.now().plusWeeks(4),
			"no descrption");

	private static final Project PROJECT1 = new Project("Project-1");
	private static final Project PROJECT2 = new Project("Project-2");

	private static final Team IHS_BACKEND = new Team("IHS", Vertical.BACKEND);
	private static final Team IHS_WEB = new Team("IHS", Vertical.WEB);
	private static final Team IHS_IOS = new Team("IHS", Vertical.IOS);
	private static final Team IHS_ANDROID = new Team("IHS", Vertical.ANDROID);
	private static final Team IHS_DEVOPS = new Team("IHS", Vertical.DEVOPS);

	private static final Team DOP_BACKEND = new Team("DOP", Vertical.BACKEND);
	private static final Team DOP_WEB = new Team("DOP", Vertical.WEB);
	private static final Team DOP_IOS = new Team("DOP", Vertical.IOS);
	private static final Team DOP_ANDROID = new Team("DOP", Vertical.ANDROID);
	private static final Team DOP_DEVOPS = new Team("DOP", Vertical.DEVOPS);

	private static final User neeraj = new User("neeraj", DOP_BACKEND);
	private static final User shubhendu = new User("shubhendu", DOP_WEB);
	private static final User maroti = new User("maroti", DOP_ANDROID);
	private static final User sardana = new User("sardana", DOP_IOS);
	private static final User nagesh = new User("nagesh", DOP_DEVOPS);

	private static final User prashant = new User("prashant", IHS_BACKEND);
	private static final User sanchari = new User("sanchari", IHS_WEB);
	private static final User sunil = new User("sunil", IHS_ANDROID);

	public static Epic createEpicHMS(String title){
		Epic epic = new Epic(title);
		epic.setOrg(ORG);
		epic.setProject(PROJECT1);
		epic.addSprint(SPRINT1);
		epic.setAssignee(nagesh);
		epic.setStoryPoints(12);
		return epic;
	}

	public static Epic createEpicIS(String title){
		Epic epic = new Epic(title);
		epic.setOrg(ORG);
		epic.setProject(PROJECT2);
		epic.addSprint(SPRINT1);
		epic.setAssignee(prashant);
		epic.setStoryPoints(60);
		return epic;
	}

	public static Story createStoryHMSBackend(String title){
		Story story = new Story(title);
		story.setEpic(createEpicIS(Util.HMS));
		story.setTeam(IHS_BACKEND);
		story.setAssignee(neeraj);
		story.setStoryPoints(12);
		return story;
	}

	public static Story createStoryHMSAndroid(String title){
		Story story = new Story(title);
		story.setEpic(createEpicIS(Util.HMS));
		story.setTeam(IHS_BACKEND);
		story.setAssignee(maroti);
		story.setStoryPoints(10);
		return story;
	}

	public static Story createStoryHMSIOS(String title){
		Story story = new Story(title);
		story.setEpic(createEpicIS(Util.HMS));
		story.setTeam(IHS_BACKEND);
		story.setAssignee(sardana);
		story.setStoryPoints(15);
		return story;
	}


	public static Task createTaskTCDBackendIHS(String title){
		Task task = new Task(title);
		task.setStory(createStoryHMSBackend(Util.HMS_BE));
		task.setAssignee(neeraj);
		task.setStoryPoints(4);
		return task;
	}

	public static Task createTaskAPIContractBackendIHS(String title){
		Task task = new Task(title);
		task.setStory(createStoryHMSBackend(Util.HMS_BE));
		task.setAssignee(neeraj);
		task.setStoryPoints(2);
		return task;
	}

	public static Task createTaskImplBackendIHS(String title){
		Task task = new Task(title);
		task.setStory(createStoryHMSBackend(Util.HMS_BE));
		task.setAssignee(neeraj);
		task.setStoryPoints(3);
		return task;
	}

	public static Task createTaskQABackendIHS(String title){
		Task task = new Task(title);
		task.setStory(createStoryHMSBackend(Util.HMS_BE));
		task.setAssignee(shubhendu);
		task.setStoryPoints(6);
		return task;
	}


}
