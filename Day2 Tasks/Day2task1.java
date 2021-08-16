import java.util.Scanner;
public class Day2task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First name:");
		String fn = sc.nextLine();
		System.out.println("Enter your Last name");
		String ln = sc.nextLine();
		
		String fir = fn.substring(0, 1);
		String rema = fn.substring(1);
		
		fir = fir.toUpperCase();
		rema = rema.toLowerCase();
		String full = fir + rema; 
		
		String secd=ln.toUpperCase();
		
		System.out.println(full+" " + secd);
				

	}

}
