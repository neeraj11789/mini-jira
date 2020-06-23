package com.jira.mini.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Entity {

	protected String id = UUID.randomUUID().toString();
}
