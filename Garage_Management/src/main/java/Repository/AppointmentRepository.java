package Repository;

import java.util.List;

import Model.AppointmentModel;

public interface AppointmentRepository {

	boolean isCreateAppointment(AppointmentModel appointementModel);

	public List<AppointmentModel> getAllAppointment();

}
