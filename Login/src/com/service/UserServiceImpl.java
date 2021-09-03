/**
 * @author Pallavi Dhamdhere (51958349)
 */

package com.service;

import com.dao.LoginDao;
import com.dao.LoginDaoImpl;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public User readByUserIdAndPasswordService(User user) {
		User userDummy = null;
		int userId= String.valueOf(user.getUserId()).length();
		int password= String.valueOf(user.getPassword()).length();
		if (user != null && userId>5 && password>5) {
			LoginDao loginDao = new LoginDaoImpl();
			userDummy = loginDao.readByUserIdAndPassword(user);
		}

		return userDummy;
	}

}
