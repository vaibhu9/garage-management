package Service;

import java.util.List;

import Model.CustomerModel;

public interface CustomerService {

	int isAddCustomer(CustomerModel cModel);

	List<CustomerModel> getAllCustomer();

	int getCustomerId(String FisrtName, String LastName, String Contact);

	boolean isUpdateCustomer(CustomerModel cModel1);

	boolean isDeleteCustomerDetails(int cId);
	
	String getCustomerNameByCId(int CId);


}
