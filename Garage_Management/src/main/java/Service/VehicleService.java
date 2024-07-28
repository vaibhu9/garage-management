package Service;

import java.util.List;

import Model.VehicleModel;

public interface VehicleService {

	boolean isDeleteVehicleDetails(int vId);

	boolean isUpdateVehicleDetails(VehicleModel vehicleModel);

	int isAddVehicle(VehicleModel vModel);

	List<VehicleModel> getAllVehicle();

	boolean isVehiclePresent(VehicleModel vehicleModel);

	int getVehicleId(String vehicle_Number);
	
	String getVehicleNumberByVId(int VId);
	
	int getCustomerIdByVId(int VId);

}
