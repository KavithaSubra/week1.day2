package week1.day2;

public class EmployeeInfo {
	
	public void getEmployeeDetails(String empName, int empId )
	{
		System.out.println(empId + " " + empName);
	}
	
	public void printCompanyAddress()
	{
		System.out.println("Chennai");
	}
	
	
	public String getCompanyAddress()
	{
		System.out.println("I am giving company address");
		return "CBE";
	}
	
public static void main(String[] args) {
	EmployeeInfo ei = new EmployeeInfo();
	//ei.printCompanyAddress();
	//System.out.println(ei.getCompanyAddress());
    //String companyAddress = ei.getCompanyAddress();
    //System.out.println(companyAddress);
    ei.getEmployeeDetails("Kavi", 12);
	
}
}
