package com.jira.mini.model;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter @Setter
public class Dependency {

	private static final AtomicInteger count = new AtomicInteger(0);

	@NonNull
	private int id;

	@NonNull
	private String node1;

	private String node2;

	@NonNull
	private DependencyType type = DependencyType.CHILD_OF;

	public Dependency(String node1, String node2, DependencyType type) {
		this.node1 = node1;
		this.node2 = node2;
		this.type = type;
		id = count.getAndIncrement();
	}
}
