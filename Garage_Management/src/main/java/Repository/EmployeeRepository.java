package Repository;

import java.util.List;

import Model.EmployeeModel;

public interface EmployeeRepository {
	
	boolean verifyEmployee(String username,String password);

	boolean verifyEmployee(int eId, String oldpassword);

	boolean isEmployeePresent(String username); 

	public boolean isAddEmployee(EmployeeModel employeeModel); 
	
	public List<EmployeeModel> getAllEmployee();
	

	public EmployeeModel getEmployeeDetails(int EId); 

	public EmployeeModel getEmployeeDetails(String firstName, String lastName);

	public int getEmployeeId(String Username, String Password);

	public boolean isUpdateEmployeeDetails(EmployeeModel employeeModel); 

	public boolean isDeleteEmployeeDetails(int EId);

	int getFreeEmployeeId();

	String getEmployeeNameByEId(int eId);




}
