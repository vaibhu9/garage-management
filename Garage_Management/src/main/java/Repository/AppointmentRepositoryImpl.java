package Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Model.AdminModel;
import Model.AppointmentModel;

public class AppointmentRepositoryImpl extends DBConfig implements AppointmentRepository{
	
	List<AppointmentModel> list=new ArrayList<AppointmentModel>();
	
	private int AId;
	
	private int generateAppointmentId() {
		try {
			stmt=conn.prepareStatement("select max(AId) from Appointment");
			rs=stmt.executeQuery();
			AId=(rs.next())?rs.getInt(1):0;
		}
		catch(Exception ex) {
			System.out.println("Error in generateAppointmentId is "+ex);
			return -1;
		}
		return ++AId;
	}

	@Override
	public boolean isCreateAppointment(AppointmentModel appointmentModel) {
		// TODO Auto-generated method stub
		try {
			AId=this.generateAppointmentId();
			if(AId>0) {
				stmt=conn.prepareStatement("insert into Appointment (AId,VId,EId,Appointment_Date) values(?,?,?,?)");
				stmt.setInt(1, AId);
				stmt.setInt(2, appointmentModel.getVId());
				stmt.setInt(3, appointmentModel.getEId());
				stmt.setDate(4, Date.valueOf(appointmentModel.getAppointment_Date()));
				int value=stmt.executeUpdate();
				return (value>0)?true:false;
			}else {
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Error in isCreateAppointment is "+ex);
			return false;
		}
	}

	@Override
	public List<AppointmentModel> getAllAppointment() {
		try {
			stmt = conn.prepareStatement("select *from Appointment");
			rs = stmt.executeQuery();
			while (rs.next()) {
				AppointmentModel appointmentModel=new AppointmentModel();
				appointmentModel.setAId(rs.getInt(1));
				appointmentModel.setVId(rs.getInt(2));
				appointmentModel.setEId(rs.getInt(3));
				appointmentModel.setAppointment_Date(rs.getDate(4).toString());
				appointmentModel.setStatus(rs.getString(5));
				list.add(appointmentModel);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error in getAllAppointment is " + ex);
			return null;
		}
		
	}

}
