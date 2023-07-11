package com.poly.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class students {
	String name;
	Double marks;
	Boolean gender;
	String email;
}
