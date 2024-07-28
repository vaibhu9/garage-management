package Service;

import java.util.List;

import Model.EmployeeModel;

public interface EmployeeService {
	
	boolean verifyEmployee(String username,String password);

	public int isAddEmployee(EmployeeModel employeeModel); 
	
	public List<EmployeeModel> getAllEmployee();
	

	public boolean isUpdateEmployeeDetails(EmployeeModel employeeModel); 

	public boolean isDeleteEmployeeDetails(int EId); 
	
	public EmployeeModel getEmployeeDetails(int EId); 

	public EmployeeModel getEmployeeDetails(String firstName, String lastName);

	public int getEmployeeId(String Username, String Password);

	boolean verifyEmployee(int eId, String oldpassword);

	int getFreeEmployeeId();
	
	String getEmployeeNameByEId(int EId);


}
