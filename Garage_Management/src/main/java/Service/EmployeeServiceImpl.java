package Service;

import java.util.List;

import Model.EmployeeModel;
import Repository.EmployeeRepository;
import Repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepository employeeRepo=new EmployeeRepositoryImpl();

	@Override
	public int isAddEmployee(EmployeeModel employeeModel) {
		if (employeeRepo.isEmployeePresent(employeeModel.getUsername())) {
			return -1;
		} else {
			return (employeeRepo.isAddEmployee(employeeModel)) ? 1 : 0;
		}
	}
	
	@Override
	public boolean verifyEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return employeeRepo.verifyEmployee(username, password);
	}


	@Override
	public boolean verifyEmployee(int eId, String oldpassword) {
		// TODO Auto-generated method stub
		return employeeRepo.verifyEmployee(eId, oldpassword);
	}

	@Override
	public List<EmployeeModel> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.getAllEmployee();
	}

	@Override
	public EmployeeModel getEmployeeDetails(int EId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeModel getEmployeeDetails(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEmployeeId(String Username, String Password) {
		// TODO Auto-generated method stub
		return employeeRepo.getEmployeeId(Username, Password);
	}

	@Override
	public boolean isUpdateEmployeeDetails(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return employeeRepo.isUpdateEmployeeDetails(employeeModel);
	}

	@Override
	public boolean isDeleteEmployeeDetails(int EId) {
		// TODO Auto-generated method stub
		return employeeRepo.isDeleteEmployeeDetails(EId);
	}

	@Override
	public int getFreeEmployeeId() {
		// TODO Auto-generated method stub
		return employeeRepo.getFreeEmployeeId();
	}

	@Override
	public String getEmployeeNameByEId(int EId) {
		// TODO Auto-generated method stub
		return employeeRepo.getEmployeeNameByEId(EId);
	}


}
