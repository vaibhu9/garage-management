package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.AdminModel;
import Model.EmployeeModel;

public class EmployeeRepositoryImpl extends DBConfig implements EmployeeRepository {
	
	List<EmployeeModel> list = new ArrayList<EmployeeModel>();
	
	private int EId;

	private int generateEmployeeId() {
		try {
			stmt = conn.prepareStatement("select max(EId) from Employee");
			rs = stmt.executeQuery();
			if (rs.next()) {
				EId = rs.getInt(1);
			}
		} catch (Exception ex) {
			System.out.println("Error in generateEmployeeId is " + ex);
			return 0;
		}
		return ++EId;
	}

	@Override
	public boolean verifyEmployee(String username, String password) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select *from Employee where Username=? and Password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs=stmt.executeQuery();
			return (rs.next())?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in verifyEmployee is "+ex);
			return false;
		}
	}
	

	@Override
	public boolean verifyEmployee(int eId, String oldpassword) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select *from Employee where EId=? and Password=?");
			stmt.setInt(1, eId);
			stmt.setString(2, oldpassword);
			rs=stmt.executeQuery();
			return (rs.next())?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in verifyEmployee is "+ex);
			return false;
		}
	}

	@Override
	public boolean isEmployeePresent(String username) {
		try {
			stmt = conn.prepareStatement("select *from Employee where Username=?");
			stmt.setString(1, username);
			rs = stmt.executeQuery();
			return (rs.next()) ? true : false;
		} catch (Exception ex) {
			System.out.println("Error in isEmployeePresent is " + ex);
			return false;
		}
	}

	@Override
	public boolean isAddEmployee(EmployeeModel employeeModel) {
		try {
			int EId = this.generateEmployeeId();
			if (EId != 0) {
				stmt = conn.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?)");
				stmt.setInt(1, EId);
				stmt.setString(2, employeeModel.getFirstName());
				stmt.setString(3, employeeModel.getLastName());
				stmt.setString(4, employeeModel.getContact());
				stmt.setString(5, employeeModel.getEmail());
				stmt.setString(6, employeeModel.getAddress());
				stmt.setString(7, employeeModel.getUsername());
				stmt.setString(8, employeeModel.getPassword());
				int value = stmt.executeUpdate();

				return (value > 0) ? true : false;
			} else {
				return false;
			}
		} catch (Exception ex) {
			System.out.println("Error in isAddEmployee is " + ex);
			return false;
		}
	}

	@Override
	public List<EmployeeModel> getAllEmployee() {
		try {
			stmt = conn.prepareStatement("select *from Employee");
			rs = stmt.executeQuery();
			while (rs.next()) {
				EmployeeModel employeeModel = new EmployeeModel();
				employeeModel.setEId(rs.getInt(1));
				employeeModel.setFirstName(rs.getString(2));
				employeeModel.setLastName(rs.getString(3));
				employeeModel.setContact(rs.getString(4));
				employeeModel.setEmail(rs.getString(5));
				employeeModel.setAddress(rs.getString(6));
				employeeModel.setUsername(rs.getString(7));
				employeeModel.setPassword(rs.getString(8));
				list.add(employeeModel);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error in getAllEmployee is " + ex);
			return null;
		}
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
		try {
			stmt = conn.prepareStatement("select EId from Employee where Username=? and Password=?");
			stmt.setString(1, Username);
			stmt.setString(2, Password);
			rs = stmt.executeQuery();
			return (rs.next()) ? rs.getInt(1) : 0;
		} catch (Exception ex) {
			System.out.println("Error in getEmployeeId is " + ex);
			return 0;
		}
	}

	@Override
	public boolean isUpdateEmployeeDetails(EmployeeModel employeeModel) {
		try {
			stmt = conn.prepareStatement("update Employee set firstname=?,lastname=?,contact=?,email=?,address=?,username=?,password=? where EId=?");
			stmt.setString(1, employeeModel.getFirstName());
			stmt.setString(2, employeeModel.getLastName());
			stmt.setString(3, employeeModel.getContact());
			stmt.setString(4, employeeModel.getEmail());
			stmt.setString(5, employeeModel.getAddress());
			stmt.setString(6, employeeModel.getUsername());
			stmt.setString(7, employeeModel.getPassword());
			stmt.setInt(8, employeeModel.getEId());
			int value = stmt.executeUpdate();
			return (value > 0) ? true : false;

		} catch (Exception ex) {
			System.out.println("Error in isUpdateEmployeeDetails is " + ex);
			return false;
		}
	}

	@Override
	public boolean isDeleteEmployeeDetails(int EId) {
		try {
			stmt = conn.prepareStatement("delete from Employee where Eid=?");
			stmt.setInt(1, EId);
			int value = stmt.executeUpdate();
			return (value > 0) ? true : false;
		} catch (Exception ex) {
			System.out.println("Error in isDeleteEmployeeDetails is " + ex);
			return false;
		}
	}

	@Override
	public int getFreeEmployeeId() {
		try {
			stmt=conn.prepareStatement("select EId from Employee where EId NOT IN(select EId from Appointment where status='Pending')");
			rs=stmt.executeQuery();
			return (rs.next())?rs.getInt(1):0;
		}
		catch(Exception ex) {
			System.out.println("Error in getFreeEmployeeId is "+ex);
			return 0;
		}
	}

	@Override
	public String getEmployeeNameByEId(int eId) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select firstname,lastname from employee where EId=?");
			stmt.setInt(1, eId);
			rs=stmt.executeQuery();
			return (rs.next())?rs.getString(1)+" "+rs.getString(2):null;
		}
		catch(Exception ex) {
			System.out.println("Error in getEmployeeNameByEId is "+ex);
			return null;
		}
	}

}
