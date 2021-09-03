/**
 * @author Pallavi Dhamdhere (51958349)
 */

package com.dao;

import com.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User readByUserIdAndPassword(User user) {
		if (user.getUserId() == 111111 && user.getPassword().equals("Pallavi@123")) {
			user.setUserName("Pallavi");
		}
		if (user.getUserId() == 222222 && user.getPassword().equals("Abhishek@123")) {
			user.setUserName("Abhishek");
		}
		return user;		
	}

}
