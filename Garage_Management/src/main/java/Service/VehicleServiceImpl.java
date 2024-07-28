package Service;

import java.util.List;

import Model.VehicleModel;
import Repository.VehicleRepository;
import Repository.VehicleRepositoryImpl;


public class VehicleServiceImpl implements VehicleService{
	
	VehicleRepository vehicleRepo = new VehicleRepositoryImpl();

	@Override
	public boolean isDeleteVehicleDetails(int vId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUpdateVehicleDetails(VehicleModel vehicleModel) {
		// TODO Auto-generated method stub
		return vehicleRepo.isUpdateVehicleDetails(vehicleModel);
	}

	@Override
	public int isAddVehicle(VehicleModel vModel) {
		// TODO Auto-generated method stub
		if(vehicleRepo.isVehiclePresent(vModel)) {
			return -1;
		}
		else {
			return (vehicleRepo.isAddVehicle(vModel))?1:0;
		}
		
	}

	@Override
	public List<VehicleModel> getAllVehicle() {
		// TODO Auto-generated method stub
		return vehicleRepo.getAllVehicle();
	}

	@Override
	public boolean isVehiclePresent(VehicleModel vehicleModel) {
		// TODO Auto-generated method stub
		return vehicleRepo.isVehiclePresent(vehicleModel);
	}

	@Override
	public int getVehicleId(String vehicle_Number) {
		// TODO Auto-generated method stub
		return vehicleRepo.getVehicleId(vehicle_Number);
	}

	@Override
	public int getCustomerIdByVId(int VId) {
		// TODO Auto-generated method stub
		return vehicleRepo.getCustomerIdByVId(VId);
	}

	@Override
	public String getVehicleNumberByVId(int VId) {
		// TODO Auto-generated method stub
		return vehicleRepo.getVehicleNumberByVId(VId);
	}

}
