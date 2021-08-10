import java.util.Scanner;

class Employee{
	private String name;
	private String address;
	private String mobile;
	Employee(String name,String address,String mobile){
		this.name=name;
		this.address=address;
		this.mobile=mobile;
	}
	public void getinfo() {
		System.out.println();
		System.out.println("Employee Details");
		System.out.println("Name : "+ this.name);
		System.out.println("Address : "+this.address);
		System.out.println("Mobile : "+this.mobile);
	}
}
class EmployeeMain{
	EmployeeMain(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.nextLine();
		System.out.println("Enter your address:");
		String address = sc.nextLine();	
		System.out.println("Enter your mobile:");
		String mobile = sc.nextLine();
		
		Employee e = new Employee(name,address,mobile);
		
		e.getinfo();
	}
	
	
	
}

public class Day2task2 {
	public static void main(String[] args) {
		new EmployeeMain();
		
	}

}
