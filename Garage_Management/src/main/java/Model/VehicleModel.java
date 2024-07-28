package Model;

//Vehicle model for storing data of vehicle with setter and getter methods (POJO) class.
public class VehicleModel {
	private int VId;
	private int CId;
	private String Vehicle_Number;
	private String Model;
	private int Year;
	
	public VehicleModel() {
		
	}

	public VehicleModel(String Vehicle_Number, String Model, int Year) {
		this.Vehicle_Number=Vehicle_Number;
		this.Model=Model;
		this.Year=Year;
	}

	
	public VehicleModel(int CId, String Vehicle_Number, String Model, int Year) {
		this.CId=CId;
		this.Vehicle_Number=Vehicle_Number;
		this.Model=Model;
		this.Year=Year;
	}

	public int getVId() {
		return VId;
	}

	public void setVId(int vId) {
		VId = vId;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getVehicle_Number() {
		return Vehicle_Number;
	}

	public void setVehicle_Number(String vehicle_Number) {
		Vehicle_Number = vehicle_Number;
	}

}
