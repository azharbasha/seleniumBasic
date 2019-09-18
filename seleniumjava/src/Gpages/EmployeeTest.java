package Gpages;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employe empone = new Employe("Tom");
		Employe emptwo = new Employe("Hary");
		
		empone.empage(25);
		empone.empdesig("Se");
		empone.empsal(25000);
		empone.printemp();
		
		emptwo.empage(28);
		emptwo.empdesig("SQA");
		emptwo.empsal(35000);
		emptwo.printemp();
		
	}

}
