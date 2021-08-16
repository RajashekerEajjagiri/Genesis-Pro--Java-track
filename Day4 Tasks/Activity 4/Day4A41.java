import java.util.*;

class outer{
	public void inner() {
	                   
		class inner{
			inner(){
			System.out.println("*** This is Inner method class ***");
			}
		}
		new inner();
			
	}
}

public class Day4A41{

	public static void main(String[] args) {
		
		outer o=new outer();
		o.inner();
		

	}

}
