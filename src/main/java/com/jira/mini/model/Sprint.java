package com.jira.mini.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
public class Sprint extends Entity{

	private String name;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private String description;
}
