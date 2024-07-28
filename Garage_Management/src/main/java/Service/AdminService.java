package Service;

import java.util.List;

import Model.AdminModel;

public interface AdminService {

	public boolean verifyAdmin(String username, String password);

	public boolean verifyAdmin(int ad_Id, String oldpassword);
	
	public int isAddAdmin(AdminModel adminModel);

	public List<AdminModel> getAllAdmin();

	public int getAdminId(String Username, String Password);

	public boolean isUpdateAdminDetails(AdminModel adminModel);

	public boolean isDeleteAdminDetails(int Ad_Id);


}
