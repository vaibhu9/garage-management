package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.VehicleModel;

public class VehicleRepositoryImpl extends DBConfig implements VehicleRepository{
	
	List<VehicleModel> list=new ArrayList<VehicleModel>();
	
	private int VId;
	
	private int genrateVehicleId() {
		try {
			stmt=conn.prepareStatement("select max(VId) from vehicle");
			rs=stmt.executeQuery();
			VId=(rs.next())?rs.getInt(1):0;
		}
		catch(Exception ex) {
			System.out.println("Error in generateVehicleId is "+ex);
			return 0;
		}
		return ++VId;
	}

	@Override
	public boolean isDeleteVehicleDetails(int vId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUpdateVehicleDetails(VehicleModel vehicleModel) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("update vehicle set CId=?,Model=?,Year=? where Vehicle_Number=?");
			stmt.setInt(1, vehicleModel.getCId());
			stmt.setString(2, vehicleModel.getModel());
			stmt.setInt(3, vehicleModel.getYear());
			stmt.setString(4, vehicleModel.getVehicle_Number());
			int value=stmt.executeUpdate();
			return (value>0)?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in isUpdateVehicleDetails is "+ex);
			return false;
		}
	}

	@Override
	public boolean isAddVehicle(VehicleModel vModel) {
		try {
			int VId=this.genrateVehicleId();
			stmt=conn.prepareStatement("insert into vehicle values (?,?,?,?,?)");
			stmt.setInt(1, VId);
			stmt.setInt(2, vModel.getCId());
			stmt.setString(3, vModel.getVehicle_Number());
			stmt.setString(4, vModel.getModel());
			stmt.setInt(5, vModel.getYear());
			int value=stmt.executeUpdate();
			return (value>0)?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in isAddVehicle is "+ex);
			return false;
		}
	}

	@Override
	public List<VehicleModel> getAllVehicle() {
		try {
			stmt=conn.prepareStatement("select *from vehicle");
			rs=stmt.executeQuery();
			while(rs.next()) {
				VehicleModel vehicleModel=new VehicleModel();
				vehicleModel.setVId(rs.getInt(1));
				vehicleModel.setCId(rs.getInt(2));
				vehicleModel.setVehicle_Number(rs.getString(3));
				vehicleModel.setModel(rs.getString(4));
				vehicleModel.setYear(rs.getInt(5));
				list.add(vehicleModel);
			}
			return (list.size()>0)?list:null;
		}
		catch(Exception ex) {
			System.out.println("Error in getAllVehicle is "+ex);
			return null;
		}
	}

	@Override
	public boolean isVehiclePresent(VehicleModel vModel) {
		try {
			stmt=conn.prepareStatement("select *from vehicle where Vehicle_Number=?");
			stmt.setString(1, vModel.getVehicle_Number());
			rs=stmt.executeQuery();
			return (rs.next())?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in isVehiclePresent is "+ex);
			return false;
		}
	}

	@Override
	public int getVehicleId(String vehicle_Number) {
		try {
			stmt=conn.prepareStatement("select VId from vehicle where Vehicle_Number=?");
			stmt.setString(1, vehicle_Number);
			rs=stmt.executeQuery();
			return (rs.next())?rs.getInt(1):0;
		}
		catch(Exception ex) {
			System.out.println("Error in getVehicleId is "+ex);
			return 0;
		}
	}

	@Override
	public int getCustomerIdByVId(int vId) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select CId from vehicle where VId=?");
			stmt.setInt(1, vId);
			rs=stmt.executeQuery();
			return (rs.next())?rs.getInt(1):0;
		}
		catch(Exception ex) {
			System.out.println("Error in getCustomerIdByVId is "+ex);
			return 0;
		}
	}

	@Override
	public String getVehicleNumberByVId(int vId) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select Vehicle_Number from vehicle where VId=?");
			stmt.setInt(1, vId);
			rs=stmt.executeQuery();
			return (rs.next())?rs.getString(1):null;
		}
		catch(Exception ex) {
			System.out.println("Error in getVehicleNumberByVId is "+ex);
			return null;
		}
	}

}
