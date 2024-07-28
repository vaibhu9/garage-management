package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.CustomerModel;

public class CustomerRepositoryImpl extends DBConfig implements CustomerRepository{
	
	List<CustomerModel>list=new ArrayList<CustomerModel>();
	
	private int CId;

	private int generateCustomerId() {
		try {
			stmt = conn.prepareStatement("select max(CId) from Customer");
			rs = stmt.executeQuery();
			if (rs.next()) {
				CId = rs.getInt(1);
			}
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return 0;
		}
		return ++CId;
	}

	@Override
	public boolean isCustomerPresent(CustomerModel cModel) {
		try {
			stmt = conn.prepareStatement("select *from Customer where Email=? or Contact=?");
			stmt.setString(1, cModel.getEmail());
			stmt.setString(2, cModel.getContact());
			rs = stmt.executeQuery();
			return (rs.next()) ? true : false;
		} catch (Exception ex) {
			System.out.println("Error in isCustomerPresent is " + ex);
			return false;
		}
	}
	
	@Override
	public boolean isAddCustomer(CustomerModel cModel) {
		try {
			int CId = this.generateCustomerId();
			if (CId != 0) {
				stmt = conn.prepareStatement("insert into Customer values(?,?,?,?,?,?)");
				stmt.setInt(1, CId);
				stmt.setString(2, cModel.getFirstName());
				stmt.setString(3, cModel.getLastName());
				stmt.setString(4, cModel.getEmail());
				stmt.setString(5, cModel.getContact());
				stmt.setString(6, cModel.getAddress());
				int value = stmt.executeUpdate();
				return (value > 0) ? true : false;
			}
			else {
				return false;
			}
		} catch (Exception ex) {
			System.out.println("Error in isAddCustomer is " + ex);
			return false;
		}
	}

	@Override
	public List<CustomerModel> getAllCustomer() {
		try {
			stmt=conn.prepareStatement("select *from Customer");
			rs=stmt.executeQuery();
			while(rs.next()) {
				CustomerModel cModel=new CustomerModel();
				cModel.setCId(rs.getInt(1));
				cModel.setFirstName(rs.getString(2));
				cModel.setLastName(rs.getString(3));
				cModel.setEmail(rs.getString(4));
				cModel.setContact(rs.getString(5));
				cModel.setAddress(rs.getString(6));
				list.add(cModel);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
			return null;
		}
	}

	@Override
	public int getCustomerId(String FirstName, String LastName, String Contact) {
		try {
			stmt = conn.prepareStatement("select CId from Customer where FirstName=? and LastName=? and Contact=?");
			stmt.setString(1, FirstName);
			stmt.setString(2, LastName);
			stmt.setString(3, Contact);
			rs = stmt.executeQuery();
			return (rs.next()) ? rs.getInt(1) : 0;
		} catch (Exception ex) {
			System.out.println("Error in getCustomerId is " + ex);
			return 0;
		}
	}

	@Override
	public boolean isUpdateCustomer(CustomerModel cModel1) {
		try {
			stmt=conn.prepareStatement("update customer set email=?,contact=?,address=? where cid=?");
			stmt.setString(1, cModel1.getEmail());
			stmt.setString(2, cModel1.getContact());
			stmt.setString(3, cModel1.getAddress());
			stmt.setInt(4, cModel1.getCId());
			int value=stmt.executeUpdate();
			return (value>0)?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public boolean isDeleteCustomerDetails(int cId) {
		try {
			stmt=conn.prepareStatement("delete from customer where cid=?");
			stmt.setInt(1, cId);
			int value=stmt.executeUpdate();
			return (value>0)?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public String getCustomerNameByCId(int cId) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select firstname,lastname from customer where cid=?");
			stmt.setInt(1, cId);
			rs=stmt.executeQuery();
			return (rs.next())?rs.getString(1)+" "+rs.getString(2):null;
		}
		catch(Exception ex) {
			System.out.println("Error in getCustomerNameByCId is "+ex);
			return null;
		}
	}


}
