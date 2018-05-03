
public class mysetAndGet {

	public static void main(String[] args) {
		Employee emp = new Employee();
		 emp.setEmpNum(12);
		emp.setEmpName(" Awad");
		emp.setEmpBdate(" 1986");
		emp.setEmpAdresse(" Paris");
		emp.setEmpIsActive(" true");
		 System.out.println(emp.getEmpName());
		// emp.empName ="Omer Ibrahim";
		 emp.printInfo();
		 //class personn
		 Personn p = new Personn();
		 p.set_salary(1000.0);
		 System.out.println(p.get_salary());
	}
}
