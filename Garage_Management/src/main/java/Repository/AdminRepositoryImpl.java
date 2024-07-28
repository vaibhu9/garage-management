package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.AdminModel;

public class AdminRepositoryImpl extends DBConfig implements AdminRepository {

	List<AdminModel> list = new ArrayList<AdminModel>();

	private int Ad_Id;

	private int generateAdminId() {
		try {
			stmt = conn.prepareStatement("select max(Ad_Id) from Admin");
			rs = stmt.executeQuery();
			if (rs.next()) {
				Ad_Id = rs.getInt(1);
			}
		} catch (Exception ex) {
			System.out.println("Error in generateAdminId is " + ex);
			return 0;
		}
		return ++Ad_Id;
	}

	public boolean isAdminPresent(String username) {
		try {
			stmt = conn.prepareStatement("select *from Admin where Username=?");
			stmt.setString(1, username);
			rs = stmt.executeQuery();
			return (rs.next()) ? true : false;
		} catch (Exception ex) {
			System.out.println("Error in isAdminPresent is " + ex);
			return false;
		}
	}

	public boolean isAddAdmin(AdminModel adminModel) {

		try {
			int Ad_Id = this.generateAdminId();
			if (Ad_Id != 0) {
				stmt = conn.prepareStatement("insert into Admin values(?,?,?,?,?,?,?)");
				stmt.setInt(1, Ad_Id);
				stmt.setString(2, adminModel.getFirstName());
				stmt.setString(3, adminModel.getLastName());
				stmt.setString(4, adminModel.getEmail());
				stmt.setString(5, adminModel.getContact());
				stmt.setString(6, adminModel.getUsername());
				stmt.setString(7, adminModel.getPassword());
				int value = stmt.executeUpdate();

				return (value > 0) ? true : false;
			} else {
				return false;
			}
		} catch (Exception ex) {
			System.out.println("Error in isAddAdmin is " + ex);
			return false;
		}
	}

	public boolean verifyAdmin(String username, String password) {
		try {
			stmt = conn.prepareStatement("select *from Admin where Username=? and Password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			return (rs.next()) ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}

	}

	@Override
	public boolean verifyAdmin(int ad_Id, String oldpassword) {
		try {
			stmt = conn.prepareStatement("select *from Admin where Ad_Id=? and Password=?");
			stmt.setInt(1, ad_Id);
			stmt.setString(2, oldpassword);
			rs = stmt.executeQuery();
			return (rs.next()) ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
	}

	@Override
	public List<AdminModel> getAllAdmin() {
		try {
			stmt = conn.prepareStatement("select *from Admin");
			rs = stmt.executeQuery();
			while (rs.next()) {
				AdminModel adminModel = new AdminModel();
				adminModel.setAd_Id(rs.getInt(1));
				adminModel.setFirstName(rs.getString(2));
				adminModel.setLastName(rs.getString(3));
				adminModel.setEmail(rs.getString(4));
				adminModel.setContact(rs.getString(5));
				adminModel.setUsername(rs.getString(6));
				adminModel.setPassword(rs.getString(7));
				list.add(adminModel);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return null;
		}
	}

	@Override
	public int getAdminId(String Username, String Password) {
		try {
			stmt = conn.prepareStatement("select Ad_Id from Admin where Username=? and Password=?");
			stmt.setString(1, Username);
			stmt.setString(2, Password);
			rs = stmt.executeQuery();
			return (rs.next()) ? rs.getInt(1) : 0;
		} catch (Exception ex) {
			System.out.println("Error in getAdminId is " + ex);
			return 0;
		}
	}

	@Override
	public boolean isUpdateAdminDetails(AdminModel adminModel) {
		try {
			stmt = conn.prepareStatement("update Admin set firstname=?,lastname=?,email=?,contact=?,username=?,password=? where Ad_Id=?");
			stmt.setString(1, adminModel.getFirstName());
			stmt.setString(2, adminModel.getLastName());
			stmt.setString(3, adminModel.getEmail());
			stmt.setString(4, adminModel.getContact());
			stmt.setString(5, adminModel.getUsername());
			stmt.setString(6, adminModel.getPassword());
			stmt.setInt(7, adminModel.getAd_Id());
			int value = stmt.executeUpdate();
			return (value > 0) ? true : false;

		} catch (Exception ex) {
			System.out.println("Error in isUpdateAdminDetails is " + ex);
			return false;
		}
	}

	@Override
	public boolean isDeleteAdminDetails(int Ad_Id) {
		try {
			stmt = conn.prepareStatement("delete from Admin where Ad_id=?");
			stmt.setInt(1, Ad_Id);
			int value = stmt.executeUpdate();
			return (value > 0) ? true : false;
		} catch (Exception ex) {
			System.out.println("Error in isDeleteAdminDetails is " + ex);
			return false;
		}
	}


}
