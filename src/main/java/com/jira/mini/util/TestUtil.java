package com.jira.mini.util;

import com.jira.mini.model.*;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDateTime;

public class TestUtil {
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
}
