package Model;

//Appointment model for storing data of appointment with setter and getter methods (POJO) class.
public class AppointmentModel {

	private int AId;
	private int VId;
	private int EId;
	private String Appointment_Date;
	private String Status;

	public int getAId() {
		return AId;
	}

	public void setAId(int aId) {
		AId = aId;
	}

	public int getVId() {
		return VId;
	}

	public void setVId(int vId) {
		VId = vId;
	}

	public int getEId() {
		return EId;
	}

	public void setEId(int eId) {
		EId = eId;
	}

	public String getAppointment_Date() {
		return Appointment_Date;
	}

	public void setAppointment_Date(String appointment_Date) {
		Appointment_Date = appointment_Date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
