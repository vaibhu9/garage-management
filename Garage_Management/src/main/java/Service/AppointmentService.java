package Service;

import java.util.List;

import Model.AppointmentModel;
import Model.CustomerModel;
import Model.VehicleModel;

public interface AppointmentService {

	boolean isBookAppointment(CustomerModel customerModel, VehicleModel vehicleModel, String Date);
	
	public List<AppointmentModel> getAllAppointment();

}
