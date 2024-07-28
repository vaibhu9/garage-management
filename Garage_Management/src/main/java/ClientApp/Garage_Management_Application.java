package ClientApp;

import java.util.*;

import Model.AdminModel;
import Model.CustomerModel;
import Model.EmployeeModel;
import Model.VehicleModel;
import Service.AdminService;
import Service.AdminServiceImpl;
import Service.EmployeeService;
import Service.EmployeeServiceImpl;
import Service.CustomerService;
import Service.CustomerServiceImpl;
import Service.VehicleService;
import Service.VehicleServiceImpl;

public class Garage_Management_Application {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AdminService adminService = new AdminServiceImpl();
		EmployeeService employeeService = new EmployeeServiceImpl();
		CustomerService customerService = new CustomerServiceImpl();
		VehicleService vehicleService = new VehicleServiceImpl();

		System.out.println("Enter username");
		String username = s.nextLine();
		System.out.println("Enter password");
		String password = s.nextLine();
		boolean b = adminService.verifyAdmin(username, password);
		if (b) {
			System.out.println(
					"\n#############  Login Successfully  #############\n\n#############     WELCOME USER     #############\n");
			do {
				System.out.println("\n\nCase 1 : Admin Operations");
				System.out.println("Case 2 : Employee Operations");
				System.out.println("Case 3 : Customer Operations");
				System.out.println("Case 4 : Vehicle Operations");
				System.out.println("Case 5 : Appointment Operations");
				System.out.println("Case 6 : Bills (WorkOrder) Operations");
				System.out.println("Case 7 : Inventory (Spare Part Stock) Operations");

				System.out.println("Case 9 : To Exit");
				System.out.println("\nEnter case number to proceed...");
				int choice = s.nextInt();

				switch (choice) {
				case 1:
					int ch = 0;
					do {
						System.out.println("\n\nCase 1: Add Admin");
						System.out.println("Case 2: View Admin Details");
						System.out.println("Case 3: Update Admin Details");
						System.out.println("Case 4: Delete Admin Details");
						System.out.println("Case 8: Go back to home page");
						System.out.println("Enter case number to proceed...");
						ch = s.nextInt();
						switch (ch) {
						case 1:
							System.out.println("Enter FirstName");
							s.nextLine();
							String FirstName = s.nextLine();
							System.out.println("Enter LastName");
							String LastName = s.nextLine();
							System.out.println("Enter Email");
							String Email = s.nextLine();
							System.out.println("Enter Contact");
							String Contact=s.nextLine();
							System.out.println("Enter Username");
							String Username = s.nextLine();
							System.out.println("Enter Pssword");
							String Password = s.nextLine();
							System.out.println("Enter Confirm Password");
							String ConfirmPassword = s.nextLine();
							if (Password.equals(ConfirmPassword)) {
								AdminModel adminModel = new AdminModel();
								adminModel.setFirstName(FirstName);
								adminModel.setLastName(LastName);
								adminModel.setEmail(Email);
								adminModel.setContact(Contact);
								adminModel.setUsername(Username);
								adminModel.setPassword(Password);
								int result = adminService.isAddAdmin(adminModel);
								System.out.println((result == 1) ? "Admin added successfully."
										: (result == -1) ? "Admin is already present."
												: "Sorry... Admin is not added.");
							} else {
								System.out.println("Sorry... Your Confirm Password is not match with Password");
							}
							break;

						case 2:
							List<AdminModel> list = adminService.getAllAdmin();
							System.out.println("List of Admin");
							System.out.println(
									"================================================================================\nAd_Id\tFirst Name\tLast Name\tEmail Id\t\tUsername\n================================================================================");
							if(list!=null) {
								for (AdminModel adminModel1 : list) {
									System.out.println(adminModel1.getAd_Id() + "\t" + adminModel1.getFirstName() + "\t\t"
											+ adminModel1.getLastName() + "\t\t" + adminModel1.getEmail() + "\t"
											+ adminModel1.getUsername());
								}
								list.clear();
							}
							else {
								System.out.println("There is no admin present in database.");
							}
							System.out.println(
									"================================================================================");
							break;

						case 3:
							System.out.println("Enter username");
							s.nextLine();
							Username = s.nextLine();
							System.out.println("Enter password");
							Password = s.nextLine();
							int Ad_Id = adminService.getAdminId(Username, Password);
							if (Ad_Id != 0) {
								System.out.println("Enter FirstName");
								FirstName=s.nextLine();
								System.out.println("Enter LastName");
								LastName=s.nextLine();
								System.out.println("Enter new email");
								Email = s.nextLine();
								System.out.println("Enter Contact");
								Contact=s.nextLine();
								System.out.println("Enter new username");
								Username = s.nextLine();
								System.out.println("Enter new password");
								Password = s.nextLine();
								System.out.println("Enter confirm new password");
								ConfirmPassword = s.nextLine();
								if (Password.equals(ConfirmPassword)) {
									AdminModel adminModel = new AdminModel();
									adminModel.setAd_Id(Ad_Id);
									adminModel.setUsername(Username);
									adminModel.setPassword(Password);
									adminModel.setEmail(Email);
									b = adminService.isUpdateAdminDetails(adminModel);
									System.out.println((b) ? "Admin Details updated."
											: "Sorry... due to some problem admin details not updated.");
								} else {
									System.out.println("Sorry... Your Confirm Password is not match with new Password");
								}
							} else {
								System.out.println("Sorry... username or password is incorrect.");
							}
							break;

						case 4:
							System.out.println("Enter Admin Ad_Id");
							Ad_Id = s.nextInt();
							b = adminService.isDeleteAdminDetails(Ad_Id);
							System.out.println(
									(b) ? "Admin details deleted" : "Sorry... You have entered incorrect admin Ad_Id");

							break;

						case 8:
							break;// to exit from admin panel and go to home page
						default:
							System.out.println("Sorry... You have entered wrong choice.");
						}
					} while (ch != 8);
					break;
					
				case 2:
					do {
						System.out.println("\n\nCase 1: Add Employee");
						System.out.println("Case 2: View Employee Details");
						System.out.println("Case 3: Update Employee Details");
						System.out.println("Case 4: Delete Employee Details");
						System.out.println("Case 8: Go back to home page");
						System.out.println("Enter case number to proceed...");
						ch = s.nextInt();
						switch (ch) {
						case 1:
							System.out.println("Enter FirstName");
							s.nextLine();
							String FirstName = s.nextLine();
							System.out.println("Enter LastName");
							String LastName = s.nextLine();
							System.out.println("Enter Email");
							String Email = s.nextLine();
							System.out.println("Enter Contact");
							String Contact=s.nextLine();
							System.out.println("Enter Address");
							String Address=s.nextLine();
							System.out.println("Enter Username");
							String Username = s.nextLine();
							System.out.println("Enter Pssword");
							String Password = s.nextLine();
							System.out.println("Enter Confirm Password");
							String ConfirmPassword = s.nextLine();
							if (Password.equals(ConfirmPassword)) {
								EmployeeModel employeeModel = new EmployeeModel();
								employeeModel.setFirstName(FirstName);
								employeeModel.setLastName(LastName);
								employeeModel.setEmail(Email);
								employeeModel.setContact(Contact);
								employeeModel.setAddress(Address);
								employeeModel.setUsername(Username);
								employeeModel.setPassword(Password);
								int result = employeeService.isAddEmployee(employeeModel);
								System.out.println((result == 1) ? "Employee added successfully."
										: (result == -1) ? "Employee is already present."
												: "Sorry... Employee is not added.");
							} else {
								System.out.println("Sorry... Your Confirm Password is not match with Password");
							}
							break;

						case 2:
							List<EmployeeModel> list = employeeService.getAllEmployee();
							System.out.println("List of Employee");
							System.out.println(
									"======================================================================================================================\nEId\tFirst Name\tLast Name\tEmail Id\t\tContact\t\tAddress\t\tUsername\n======================================================================================================================");
							if(list!=null) {
								for (EmployeeModel employeeModel1 : list) {
									System.out.println(employeeModel1.getEId() + "\t" + employeeModel1.getFirstName() + "\t\t"
											+ employeeModel1.getLastName() + "\t\t" + employeeModel1.getEmail() + "\t" + employeeModel1.getContact() + "\t" + employeeModel1.getAddress() + "\t"
											+ employeeModel1.getUsername());
								}
								list.clear();
							}
							else {
								System.out.println("There is no Employee present in database.");
							}
							System.out.println(
									"======================================================================================================================");
							break;

						case 3:
							System.out.println("Enter username");
							s.nextLine();
							Username = s.nextLine();
							System.out.println("Enter password");
							Password = s.nextLine();
							int EId = employeeService.getEmployeeId(Username, Password);
							if (EId != 0) {
								System.out.println("Enter FirstName");
								s.nextLine();
								FirstName = s.nextLine();
								System.out.println("Enter LastName");
								LastName = s.nextLine();
								System.out.println("Enter Email");
								Email = s.nextLine();
								System.out.println("Enter Contact");
								Contact=s.nextLine();
								System.out.println("Enter Address");
								Address=s.nextLine();
								System.out.println("Enter new username");
								Username = s.nextLine();
								System.out.println("Enter new password");
								Password = s.nextLine();
								System.out.println("Enter confirm new password");
								ConfirmPassword = s.nextLine();
								System.out.println("Enter new email");
								Email = s.nextLine();
								if (Password.equals(ConfirmPassword)) {
									EmployeeModel employeeModel = new EmployeeModel();
									employeeModel.setEId(EId);
									employeeModel.setFirstName(FirstName);
									employeeModel.setLastName(LastName);
									employeeModel.setEmail(Email);
									employeeModel.setContact(Contact);
									employeeModel.setAddress(Address);
									employeeModel.setUsername(Username);
									employeeModel.setPassword(Password);
									employeeModel.setEmail(Email);
									b = employeeService.isUpdateEmployeeDetails(employeeModel);
									System.out.println((b) ? "Employee Details updated."
											: "Sorry... due to some problem Employee details not updated.");
								} else {
									System.out.println("Sorry... Your Confirm Password is not match with new Password.");
								}
							} else {
								System.out.println("Sorry... username or password is incorrect.");
							}
							break;

						case 4:
							System.out.println("Enter Employee EId");
							EId = s.nextInt();
							b = employeeService.isDeleteEmployeeDetails(EId);
							System.out.println(
									(b) ? "Employee details deleted." : "Sorry... You have entered incorrect employee EId.");

							break;

						case 8:
							break;// to exit from employee panel and go to home page
						default:
							System.out.println("Sorry... You have entered wrong choice.");
						}
					} while (ch != 8);
					break;
					
				case 3:
					do {
						System.out.println("\n\nCase 1: Add Customer");
						System.out.println("Case 2: View Customer Details");
						System.out.println("Case 3: Update Customer Details");
						System.out.println("Case 4: Delete Customer Details");
						System.out.println("Case 8: Go to home page");
						System.out.println("Enter your choice");
						ch=s.nextInt();
						switch(ch) {
						case 1:
							System.out.println("Enter First Name");
							s.nextLine();
							String FirstName = s.nextLine();
							System.out.println("Enter Last Name");
							String LastName = s.nextLine();
							System.out.println("Enter Email");
							String Email = s.nextLine();
							System.out.println("Enter Contact Number 10 digits only");
							String Contact = s.nextLine();
							System.out.println("Enter Address");
							String Address = s.nextLine();
							CustomerModel cModel = new CustomerModel(FirstName, LastName, Email, Contact, Address);
							int result = customerService.isAddCustomer(cModel);
							System.out.println((result == 1) ? "Customer is added successfully"
									: (result == -1) ? "Customer is already present" : "Customer is not added");
							break;
							
						case 2:
								List<CustomerModel> list = customerService.getAllCustomer();
									System.out.println("List of Customers");
									System.out.println("============================================================================================\nCId\tFirst Name\tLast Name\tEmail Id\t\tContact\t\tAddress\n============================================================================================");
									if(list!=null) {
										for (CustomerModel cModel1 : list) {
											System.out.println(cModel1.getCId() + "\t" + cModel1.getFirstName() + "\t" + cModel1.getLastName()+"\t"+cModel1.getEmail()+"\t"+cModel1.getContact()+"\t"+cModel1.getAddress());
										}
										list.clear();
									}
									else {
										System.out.println("There is no customer present in database.");
									}
									System.out.println("============================================================================================");
								
							break;
							
						case 3:
							System.out.println("Enter Customer FirstName");
							s.nextLine();
							FirstName=s.nextLine();
							System.out.println("Enter Customer LastName");
							LastName=s.nextLine();
							System.out.println("Enter Contact");
							Contact=s.nextLine();
							int CId=customerService.getCustomerId(FirstName, LastName, Contact);
							if(CId!=0) {
								System.out.println("Enter New Email");
								Email=s.nextLine();
								System.out.println("Enter new contact");
								Contact=s.nextLine();
								System.out.println("Enter new address");
								Address=s.nextLine();
								CustomerModel cModel1=new CustomerModel();
								cModel1.setCId(CId);
								cModel1.setEmail(Email);
								cModel1.setContact(Contact);
								cModel1.setAddress(Address);
								b=customerService.isUpdateCustomer(cModel1);
								System.out.println((b)?"Customer details updated":"Sorry... Customer not in the database");
								
							}
							else {
								System.out.println("Sorry... Customer not present with this name and contact");
							}
							break;
							
						case 4:
							System.out.println("Enter customer CId to delete details");
							CId=s.nextInt();
							b=customerService.isDeleteCustomerDetails(CId);
							System.out.println((b)?"Customer details deleted":"Sorry... You have entered incorrect CId");
							break;
							
						case 8:// To exit from customer panel
							break;
							
						default: System.out.println("You have entered wrong choice");
						}
					}while(ch!=8);
					break;
					
				case 4:
					do {
						System.out.println("\n\nCase 1: Add Vehicle Details");
						System.out.println("Case 2: View Vehicle Details");
						System.out.println("Case 3: Update Vehicle Details");
						System.out.println("Case 4: Delete Vehicle Details");
						System.out.println("Case 8: Go to home page");
						System.out.println("Enter your choice");
						ch=s.nextInt();
						switch(ch) {
						case 1:
							System.out.println("Enter Customer FirstName");
							s.nextLine();
							String FirstName = s.nextLine();
							System.out.println("Enter Customer LastName");
							String LastName=s.nextLine();
							System.out.println("Enter Customer Contact");
							String Contact = s.nextLine();
							int CId = customerService.getCustomerId(FirstName, LastName, Contact);
							System.out.println("Enter Vehicle Number");
							String Vehicle_Number = s.nextLine();
							System.out.println("Enter Vehicle Model");
							String Model = s.nextLine();
							System.out.println("Enter Vehicle Year");
							int Year = s.nextInt();
							VehicleModel vModel = new VehicleModel(CId, Vehicle_Number, Model, Year);
							int result = vehicleService.isAddVehicle(vModel);
							System.out.println((result == 1) ? "Vehicle is added successfully"
									: (result == -1) ? "Vehicle is already present" : "Vehicle is not added");
							break;
							
						case 2:
							
									List<VehicleModel> list = vehicleService.getAllVehicle();
									System.out.println("List of Vehicle");
									System.out.println("=============================================================\nVId\tCId\tVehicle_Number\tModel\t\tYear\n=============================================================");
									if(list!=null) {
										for (VehicleModel vModel1 : list) {
											System.out.println(vModel1.getVId()+"\t"+vModel1.getCId()+"\t"+vModel1.getVehicle_Number()+"\t"+vModel1.getModel()+"\t\t"+vModel1.getYear());
										}
										list.clear();
									}
									else {
										System.out.println("There is no vehicle details present in database.");
									}
									System.out.println("=============================================================");
									break;
							
						case 3:
							System.out.println("Enter Vehicle_Number");
							s.nextLine();
							Vehicle_Number=s.nextLine();
							VehicleModel vehicleModel=new VehicleModel();
							vehicleModel.setVehicle_Number(Vehicle_Number);
							if(vehicleService.isVehiclePresent(vehicleModel)) {
								System.out.println("Enter Customer First name");
								FirstName=s.nextLine();
								System.out.println("Enter Customer Last name");
								LastName=s.nextLine();
								System.out.println("Enter Customer Contact");
								Contact=s.nextLine();
								CId=customerService.getCustomerId(FirstName, LastName, Contact);
								System.out.println("Enter model name");
								Model=s.nextLine();
								System.out.println("Enter model year.");
								Year=s.nextInt();
								vehicleModel.setCId(CId);
								vehicleModel.setModel(Model);
								vehicleModel.setYear(Year);
								b=vehicleService.isUpdateVehicleDetails(vehicleModel);
								System.out.println((b)?"Vehicle details updated":"Sorry... vehicle details not updated.");
							}
							else {
								System.out.println("Sorry... this vehicle number did not match in database. please enter correct vehicle number.");
							}
							break;
							
						case 4:
							System.out.println("Enter vehicle VId which you want to delete");
							int VId=s.nextInt();
							b=vehicleService.isDeleteVehicleDetails(VId);
							System.out.println((b)?"Vehicle details deleted.":"Sorry... due to some problem vehicle details not deleted.");
							break;
							
						case 8:// To exit from vehicle panel
							break;
							
						default: System.out.println("You have entered wrong choice");
						}
					}while(ch!=8);
					break;

				case 9:
					System.exit(0);

				default:
					System.out.println("Sorry... You have entered wrong choice.");
				}
			} while (true);
		} else {
			System.out.println("\n##########   Login Failed   ##########\n\nUsername or Password is incorrect\n");
		}
	}
}