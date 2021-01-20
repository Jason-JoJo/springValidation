package com.example.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class User {

	@Size(min=2)
	@NotEmpty
	private String userId;
	@NotEmpty
	private String userPin;
}
