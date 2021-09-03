/**
 * @author Pallavi Dhamdhere (51958349)
 */

package com.service;

import com.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee searchById(Employee[] empArray, int empID) {

		Employee tempEmpl = null;
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i].getEmpID() == empID) {
			
				tempEmpl = empArray[i];
				break;
			} 
		}

		return tempEmpl;
	}

	@Override
	public Employee[] searchByName(Employee[] empArray, String name) {

		Employee[] emplArr = new Employee[empArray.length];

		for (int i = 0; i < emplArr.length; i++) {
			if (empArray[i].getName().equals(name)) {
				emplArr[i] = empArray[i];
				break;
			} else {
							}
		}

		return emplArr;
	}

}
