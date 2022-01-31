package com.app.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
	private static final long serialVersionUID = -445869574046330846L;
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String role;

}
