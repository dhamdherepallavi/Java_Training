/**
 * @author Pallavi Dhamdhere (51958349)
 */
package com.dao;

import com.model.User;

public interface LoginDao {

	public abstract User readByUserIdAndPassword(User user);

}
