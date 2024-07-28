package Helper;
import java.sql.*;
import java.util.*;
public class Table_Creation_Application {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
//		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
//		DriverManager.registerDriver(d);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/garagemanagement","root","Vaibhav");
		Scanner s=new Scanner(System.in);
		int choice;
		if(conn!=null) {
			do {
				System.out.println("\n\n\nCase 1: Admin table.");
				System.out.println("Case 2: Employee table.");
				System.out.println("Case 3: Customer table.");
				System.out.println("Case 4: Vehicle table.");
				System.out.println("Case 5: Appointment table");
				System.out.println("Case 6: WorkOrder table.");
				System.out.println("Case 7: Inventory table.");
				System.out.println("Case 9: To Exit.");
				System.out.println("");
				System.out.println("Enter your choice.");
				choice=s.nextInt();
				
				switch(choice) {
				case 1:
					PreparedStatement pstmt=conn.prepareStatement("create table Admin(Ad_Id int(5)primary key, FirstName varchar(90)not null, LastName varchar(90)not null, Email varchar(90)not null unique, Username varchar(90)not null unique, Password varchar(90)not null)");
					int value=pstmt.executeUpdate();
					if(value==0) {
						System.out.println("Admin table created successfully.");
					}
					else {
						System.out.println("Table is not created.");
					}
					break;
				case 2:
					pstmt=conn.prepareStatement("create table Employee(EId int(5)primary key, FirstName varchar(90)not null, LastName varchar(90)not null, Email varchar(90)not null unique, Username varchar(90)not null unique, Password varchar(90)not null)");
					value=pstmt.executeUpdate();
					if(value==0) {
						System.out.println("Employee table created successfully.");
					}
					else {
						System.out.println("Table is not created.");
					}
					break;
				case 3:
					pstmt=conn.prepareStatement("create table Customer(CId int(5)primary key, FirstName varchar(90)not null, LastName varchar(90)not null, Email varchar(90)not null unique, Contact varchar(90)not null unique, Address varchar(90)not null)");
					value=pstmt.executeUpdate();
					if(value==0) {
						System.out.println("Customer table created successfully.");
					}
					else {
						System.out.println("Table is not created.");
					}
					break;
				case 4:
					pstmt=conn.prepareStatement("create table Vehicle(VId int(5)primary key, CId int(5),foreign key(CId)references Customer(CId) on delete cascade on update cascade, Vehicle_Number varchar(90)not null unique, Model varchar(90)not null, Year int(5)not null)");
					value=pstmt.executeUpdate();
					if(value==0) {
						System.out.println("Vehicle table created successfully.");
					}
					else {
						System.out.println("Table is not created.");
					}
					break;
				case 5:
					pstmt=conn.prepareStatement("create table Appointment(AId int(5)primary key, VId int(5),foreign key(VId)references Vehicle(VId) on delete cascade on update cascade, EId int(5),foreign key(EId)references Employee(EId) on delete cascade on update cascade, Appointment_Date DATE not null, Status varchar(90)default 'Pending')");
					value=pstmt.executeUpdate();
					if(value==0) {
						System.out.println("Appointment table created successfully.");
					}
					else {
						System.out.println("Table is not created.");
					}
					break;
				case 6:
					pstmt=conn.prepareStatement("create table WorkOrder(WId int(5)primary key, AId int(5),foreign key(AId)references Appointment(AId) on delete cascade on update cascade, Service_Description varchar(250)not null, Changed_Parts varchar(250)not null, Labour_Cost int(5) default 200, Total_Cost int(5)default 200)");
					value=pstmt.executeUpdate();
					if(value==0) {
						System.out.println("WorkOrder table created successfully.");
					}
					else {
						System.out.println("Table is not created.");
					}
					break;
				case 7:
					pstmt=conn.prepareStatement("create table Inventory(PId int(5)primary key, Part_Name varchar(90)not null unique, Price int(5)not null, Quantity int(5)not null)");
					value=pstmt.executeUpdate();
					if(value==0) {
						System.out.println("Inventory table created successfully.");
					}
					else {
						System.out.println("Table is not created.");
					}
					break;
				case 9:System.exit(0);
					break;
				default: System.out.println("You have entered wrong choice...");
				}
			}while(true);
		}
		else {
			System.out.println("Database is not connected...");
		}

	}

}
