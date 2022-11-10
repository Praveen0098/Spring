package com.two.Pravpjtwo.Sv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
public class ServiceClass {

	@Autowired
	Environment env;
	
	@Value("${username}")
	private String usernames;

	@Value("${password}")
	private String passwords;

	public String UserLogin(String name, String password) {
		env.getProperty("username");
		if (name != null && password != null) {
			if (name.equals(usernames)) {
				if (password.equals(passwords)) {
					return "succesfull login";
				} else {
					return "enter correct password";

				}

			} else {
				return "Enter valid Username";
			}

		} else {
			return "Values cannot be null";
		}
}
}

