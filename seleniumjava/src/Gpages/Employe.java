package Gpages;

public class Employe {
	
	String Name;
	int age;
	String Designation;
	int Salary;
	
	
	public Employe(String Name) {
		this.Name = Name;
	}
	
	public void empage(int empage) {
		age = empage;
	}
	
	public void empdesig(String empdesig) {
		Designation = empdesig;
	}
	
	public void empsal(int empsal) {
		Salary = empsal;
	}
	
	public void printemp() {
		System.out.println("Employee Name :" +Name);
		System.out.println(" Employee age : " +age);
		System.out.println("Employee desig : " +Designation);
		System.out.println("Emloyee Salary : " +Salary);
		
	}
	
	
}
