package com.vector.beans;

import java.util.HashMap;

//dependent class
public class UserService {

	PasswordService pwdService;
	HashMap<String, User> userMap = new HashMap<>();

	// Setter method
	public void setPwdService(PasswordService pwdService) {
		this.pwdService = pwdService;
	}

	public void saveUser(String username, String password) {

		// encode the password
		String encodedPassword = pwdService.encodePasword(password);
		System.out.println("In saveUser() method ....");
		System.out.println("password : " + password);
		System.out.println("encoded password : " + encodedPassword);

		// create User class object
		User user = new User(username, encodedPassword);

		// store the User object in HashMap collection
		userMap.put(username, user);

		System.out.println("User is saved ");

	}

	public void fetchUser(String username) {

		// fetch the user from the HashMap collection
		User user = userMap.get(username);
		if (user != null) {
			String password = pwdService.decodePassword(user.getPassword());
			System.out.println("Username : " + username);
			System.out.println("Password : " + password);
		} else {
			System.out.println(username + " doesn't exist ");
		}

	}
}
