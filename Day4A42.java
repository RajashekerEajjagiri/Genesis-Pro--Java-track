import java.util.*;

class outer{
	static class inner{
		inner(){
			System.out.println(" This is Inside static inner class");
		}
	}
}

public class Day4A42 {

	public static void main(String[] args) {
		outer.inner o = new outer.inner();
	}

}
