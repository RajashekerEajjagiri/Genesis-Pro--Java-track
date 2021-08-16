import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class Company{
	private String comName;
	private String emp;
	private String teaml;
	
	Company(String comName,String emp,String teaml){
		this.comName=comName;
		this.emp=emp;
		this.teaml=teaml;
	}
	public void getinfo() {
		
		String[] e = this.emp.split(",");
		List<String> list= Arrays.asList(e);
		if(list.contains(teaml)) {
			System.out.println("Company Name : "+this.comName);
			System.out.println("Employees : "+this.emp);
			System.out.println("Team Lead : "+this.teaml);
		}
		else {
			System.out.println("Invalid Team Lead Name");
		}
		
	}
}

class CompanyMain{
	CompanyMain(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Company Name");
		String comName = sc.nextLine();
		System.out.println("Enter the Employees name with comma seperated");
		String emp = sc.nextLine();
		System.out.println("Enter the TeamLeader name");
		String teaml = sc.nextLine();
		Company c = new Company(comName,emp,teaml);
		c.getinfo();
	}
}
public class Day2task5{
	public static void main(String[] args) {
		new CompanyMain();
}
}
