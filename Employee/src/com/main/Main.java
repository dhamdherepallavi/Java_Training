/**
 * @author Pallavi Dhamdhere (51958349)
 */

package com.main;

import java.util.Scanner;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;


public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee(01,"Pallavi",25000);
		Employee employee2 = new Employee(02,"Abhishek",30000);
		Employee employee3 = new Employee(03,"Akshay",35000);
		Employee employee4 = new Employee(04,"Amol",40000);
		Employee employee5 = new Employee(05,"Snehal",45000);
		
		Employee[ ] employees = new Employee[5];
		
		employees[0]=employee1;
		employees[1]=employee2;
		employees[2]=employee3;
		employees[3]=employee4;
		employees[4]=employee5;
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
	
		EmployeeService employeeService =new EmployeeServiceImpl();
		 Employee ans =employeeService.searchById(employees, id);
		if(ans != null)
		{
			System.out.println(ans.getEmpID());
			System.out.println(ans.getName());
			System.out.println(ans.getSalary());
		}
		Employee[] result= employeeService.searchByName(employees,"Abhishek");
				if(result.length>0){
				for(int i=0;i<result.length;i++)
				{
					System.out.println(ans.getEmpID());
					System.out.println(ans.getName());
					System.out.println(ans.getSalary());
					break;
				}
				}
	}
	
	
	

}
