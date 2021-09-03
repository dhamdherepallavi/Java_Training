/**
 * @author Pallavi Dhamdhere (51958349)
 */
package com.main;

import java.util.Scanner;

import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

public class UserMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your User ID : ");
		int id = input.nextInt();

		System.out.println("Enter your Password : ");

		String pwd = input.next();

		UserService userService = new UserServiceImpl();
		User user = new User();

		user.setUserId(id);

		user.setPassword(pwd);

		User ans = userService.readByUserIdAndPasswordService(user);
		if (ans != null) {

			System.out.println();
			System.out.println("WELCOME " + ans.getUserName());
		} else {
			System.out.println("No such User Please check userId and password");
		}

	}

}
