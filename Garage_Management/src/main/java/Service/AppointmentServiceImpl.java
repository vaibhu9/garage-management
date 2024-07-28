package Service;

import Model.CustomerModel;

import java.util.List;

import Model.AppointmentModel;
import Repository.AppointmentRepository;
import Repository.AppointmentRepositoryImpl;
import Model.VehicleModel;

public class AppointmentServiceImpl implements AppointmentService{
	
	CustomerService customerService=new CustomerServiceImpl();
	VehicleService vehicleService=new VehicleServiceImpl();
	EmployeeService employeeService=new EmployeeServiceImpl();
	AppointmentRepository appointmentRepo=new AppointmentRepositoryImpl();

	@Override
	public boolean isBookAppointment(CustomerModel customerModel, VehicleModel vehicleModel,String Date) {
		// TODO Auto-generated method stub
		
		int value=customerService.isAddCustomer(customerModel);
		
		if(value>0||value==-1) {
			int CId=customerService.getCustomerId(customerModel.getFirstName(), customerModel.getLastName(), customerModel.getContact());
			vehicleModel.setCId(CId);
			value=vehicleService.isAddVehicle(vehicleModel);
			if(value>0||value==-1) {
				int VId=vehicleService.getVehicleId(vehicleModel.getVehicle_Number());
				int EId=employeeService.getFreeEmployeeId();
				if(VId>0&&EId>0) {
					AppointmentModel appointmentModel=new AppointmentModel();
					appointmentModel.setVId(VId);
					appointmentModel.setEId(EId);
					appointmentModel.setAppointment_Date(Date);
					return appointmentRepo.isCreateAppointment(appointmentModel);
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}

	@Override
	public List<AppointmentModel> getAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentRepo.getAllAppointment();
	}

}
