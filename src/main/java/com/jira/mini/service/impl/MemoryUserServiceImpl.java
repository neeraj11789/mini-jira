package com.jira.mini.service.impl;

import com.jira.mini.model.User;
import com.jira.mini.service.UserService;
import com.jira.mini.util.Util;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserServiceImpl implements UserService {

	private Map<String, User> map = new HashMap<>();

	/**
	 * @param user
	 */
	@Override
	public void create(@NonNull User user) {
		map.putIfAbsent(user.getName(), user);
	}

	/**
	 * @param user
	 */
	@Override
	public void delete(@NonNull User user) {
		if(!map.containsKey(user.getName())) {
			throw new IllegalArgumentException(Util.INVALID_USER_DELETION);
		}
		map.remove(user.getName());
	}

	/**
	 * @param name
	 * @return
	 */
	@Override
	public User findByName(@NonNull String name) {
		if(!map.containsKey(name)) {
			throw new IllegalArgumentException(Util.INVALID_USER_DELETION);
		}
		return map.get(name);
	}
}
