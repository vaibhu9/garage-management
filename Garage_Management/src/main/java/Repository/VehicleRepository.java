package Repository;

import java.util.List;

import Model.VehicleModel;

public interface VehicleRepository {
	
	boolean isDeleteVehicleDetails(int vId);

	boolean isUpdateVehicleDetails(VehicleModel vehicleModel);

	boolean isAddVehicle(VehicleModel vModel);

	List<VehicleModel> getAllVehicle();

	boolean isVehiclePresent(VehicleModel vModel);

	int getVehicleId(String vehicle_Number);

	int getCustomerIdByVId(int vId);

	String getVehicleNumberByVId(int vId);

}
