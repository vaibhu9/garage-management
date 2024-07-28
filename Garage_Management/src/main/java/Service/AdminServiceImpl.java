package Service;

import java.util.List;
import Repository.AdminRepository;
import Repository.AdminRepositoryImpl;
import Model.AdminModel;

public class AdminServiceImpl implements AdminService {

	AdminRepository adminRepo = new AdminRepositoryImpl();

	@Override
	public boolean verifyAdmin(String username, String password) {
		// TODO Auto-generated method stub
		return adminRepo.verifyAdmin(username, password);
	}
	
	@Override
	public boolean verifyAdmin(int ad_Id, String oldpassword) {
		// TODO Auto-generated method stub
		return adminRepo.verifyAdmin(ad_Id, oldpassword);
	}

	@Override
	public int isAddAdmin(AdminModel adminModel) {
		// TODO Auto-generated method stub
		if (adminRepo.isAdminPresent(adminModel.getUsername())) {
			return -1;
		} else {
			return (adminRepo.isAddAdmin(adminModel)) ? 1 : 0;
		}
	}

	@Override
	public List<AdminModel> getAllAdmin() {
		// TODO Auto-generated method stub
		return adminRepo.getAllAdmin();
	}

	@Override
	public int getAdminId(String Username, String Password) {
		// TODO Auto-generated method stub
		return adminRepo.getAdminId(Username, Password);
	}

	@Override
	public boolean isUpdateAdminDetails(AdminModel adminModel) {
		// TODO Auto-generated method stub
		return adminRepo.isUpdateAdminDetails(adminModel);
	}

	@Override
	public boolean isDeleteAdminDetails(int Ad_Id) {
		// TODO Auto-generated method stub
		return adminRepo.isDeleteAdminDetails(Ad_Id);
	}

	

}
