/**
 * @author Pallavi Dhamdhere (51958349)
 */

package com.service;

import com.model.User;

public interface UserService {

	public abstract User readByUserIdAndPasswordService(User user);

}
