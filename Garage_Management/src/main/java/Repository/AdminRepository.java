package Repository;

import java.util.List;

import Model.AdminModel;

public interface AdminRepository {

	boolean isAddAdmin(AdminModel adminModel);

	boolean isAdminPresent(String username);

	boolean verifyAdmin(String username, String password);
	
	public boolean verifyAdmin(int ad_Id, String oldpassword);

	public List<AdminModel> getAllAdmin();

	public int getAdminId(String Username, String Password);

	public boolean isUpdateAdminDetails(AdminModel adminModel);

	public boolean isDeleteAdminDetails(int Ad_Id);

}
