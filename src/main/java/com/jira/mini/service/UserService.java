package com.jira.mini.service;

import com.jira.mini.model.User;

public interface UserService {

	void create(User user);

	void delete(User user);

	User findByName(String name);
}
