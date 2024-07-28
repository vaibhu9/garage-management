package Service;

import java.util.List;

import Model.CustomerModel;
import Repository.CustomerRepository;
import Repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerRepository customerRepo=new CustomerRepositoryImpl();

	@Override
	public int isAddCustomer(CustomerModel cModel) {
		// TODO Auto-generated method stub
		if(customerRepo.isCustomerPresent(cModel)) {
			return -1;
		}
		else {
			return (customerRepo.isAddCustomer(cModel))?1:0;
		}
		
	}

	@Override
	public List<CustomerModel> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.getAllCustomer();
	}

	@Override
	public int getCustomerId(String FirstName, String LastName, String Contact) {
		// TODO Auto-generated method stub
		return customerRepo.getCustomerId(FirstName, LastName, Contact);
	}

	@Override
	public boolean isUpdateCustomer(CustomerModel cModel1) {
		// TODO Auto-generated method stub
		return customerRepo.isUpdateCustomer(cModel1);
	}

	@Override
	public boolean isDeleteCustomerDetails(int cId) {
		// TODO Auto-generated method stub
		return customerRepo.isDeleteCustomerDetails(cId);
	}

	@Override
	public String getCustomerNameByCId(int CId) {
		// TODO Auto-generated method stub
		return customerRepo.getCustomerNameByCId(CId);
	}


}
