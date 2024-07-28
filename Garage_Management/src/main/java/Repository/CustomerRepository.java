package Repository;

import java.util.List;

import Model.CustomerModel;

public interface CustomerRepository {

	boolean isCustomerPresent(CustomerModel cModel);
	
	boolean isAddCustomer(CustomerModel cModel);

	List<CustomerModel> getAllCustomer();

	int getCustomerId(String FirstName, String LastName, String Contact);

	boolean isUpdateCustomer(CustomerModel cModel1);

	boolean isDeleteCustomerDetails(int cId);

	String getCustomerNameByCId(int cId);



}
