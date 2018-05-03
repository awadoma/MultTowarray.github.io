//151 incapsulation
public class Employee {
   private int _empNum;
   private String _empName;
   private String _empBdate;
   private String _empAdress;
   private String _empisActive;
   public String empName;
   
   public void setEmpNum(int empNum) {
		_empNum = empNum;
		
	}
   public int getEmpNum() {
	   return _empNum;
   }
   public void setEmpName(String empName) {
		_empName = empName;
   }
   public String getEmpName() {
	   if(empName == null)
	   return _empName;
	   else
		   return empName;
   }
   public void setEmpBdate(String empBdate) {
		_empBdate = empBdate;
  }
   public String getEmpBdate() {
	   return _empBdate;
   }
   public void setEmpAdresse(String empAdresse) {
		_empAdress = empAdresse;
 }
   public String getEmpAdresse() {
	   return _empAdress;
   }
   public void setEmpIsActive(String empIsActive) {
	   _empisActive = empIsActive;
}
   public String getEmpIsActive() {
	   return _empisActive;
   }
	
	public void printInfo() {
		System.out.println("Emp Number:" +_empNum);
		if(empName == null)
		System.out.println("Emp Name :" +_empName);
		else
			System.out.println("Emp Name :" +empName);
			
		System.out.println("Emp Birth date :" +_empBdate);
		System.out.println("Emp Adresse :" +_empAdress);
		System.out.println("Emp is Active :" +_empisActive);
		
		
	}
	
	
}
