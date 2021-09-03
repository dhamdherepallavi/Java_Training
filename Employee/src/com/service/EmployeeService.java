/**
 * @author Pallavi Dhamdhere (51958349)
 */

package com.service;

import com.model.Employee;

public interface EmployeeService {

	
	public abstract Employee searchById(Employee[ ] empArray,int empID);

	public abstract Employee[] searchByName(Employee[ ] empArray,String name);
}
