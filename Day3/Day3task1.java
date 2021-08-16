import java.util.Scanner.*;
import java.util.*;

class Vehicle
{
    private String make;
    private String vehicleNumber;
    private String fuelType;
    private int fuelCapacity;
    private int cc;
    
    public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
    {
            this.make=make;
            this.vehicleNumber=vehicleNumber;
            this.fuelCapacity=fuelCapacity;
            this.fuelType=fuelType;
            this.cc=cc;
    }
         public void displayMake()
         {
            System.out.println("Vehicle Make information : "+this.make); 
         }
    
        public void displayBasicinfo()
        {
            
            System.out.println("***Basic Information ***");
            System.out.println("VehicleNumber:" +vehicleNumber);
            System.out.println("FuelCapacity:" +fuelCapacity);
            System.out.println("fuelType:"  +fuelType);
            System.out.println("Engine CC:"  +cc);
        }
        
        public void displayDetailinfo()
        {
        
            
        }
        
    
    
}

class TwoWheeler extends Vehicle
{
 private  Boolean ks;  
 
  TwoWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,Boolean ks )
 {
    super(make,vehicleNumber,fuelType,fuelCapacity,cc);
    this.ks=ks;
 }
    String val;
    public void displayDetailinfo()
    {
    if(this.ks==true)
    {
        val="YES";
    }
    else
        val="NO";
     System.out.println("***Detail Information***");   
     System.out.println("Kick Start Availble:" +val);
    }
}

class FourWheeler extends Vehicle
{
    private String as;
    private int nd;
    
    FourWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,String as,int nd)
    {
        super(make,vehicleNumber,fuelType,fuelCapacity,cc);
        this.as=as;
        this.nd=nd;
        
    }
   public void displayDetailinfo()
    {
        System.out.println("");
        System.out.println("*** Detail Information***");
        System.out.println("Audio System:"  +this.as);
        System.out.println("Number Of Doors:"  +this.nd);
    }
    
}

public class Day3task1
{
	public static void main(String[] args) {
	    
	   Scanner sc=new Scanner(System.in);
	   
	  	System.out.println("1.TwoWheeler");
	  	System.out.println("2.FourWheeler");
	  	
	  	System.out.println("Enter your Vehicle Type:");
	  	int n=sc.nextInt();
	  	sc.nextLine();
	  	System.out.println("Enter Vehicle Make:");
	  	String make=sc.next();
	  	System.out.println("Enter your vehicleNumber:");
	  	sc.nextLine();
	  	String vehicleNumber=sc.nextLine();
	  	System.out.println("Enter your fuelType: 1.Petrol/n 2.Desiel");
	  	int fuelType=sc.nextInt();
	  	String fuel;
	  	if(fuelType==1)
	  	{
	  	    fuel="Petrol";
	  	}
	  	else
	  	   fuel="Diesel";
	  	System.out.println("Enter your fuelCapacity:");
	  	int fuelCapacity=sc.nextInt();
	  	System.out.println("Enter Engine:");
	  	int cc=sc.nextInt();
	  	
	  	if(n==2)
	  	{
	  	    System.out.println("Enter Audio System:");
	  	    sc.nextLine();
	  	    String as=sc.nextLine();
	  	    System.out.println("Enter Number of Doors:");
	  	    int nd=sc.nextInt();
	  	    System.out.println("");
	  	    System.out.println("***" +make +"***");
	  	    FourWheeler fw=new FourWheeler(make,vehicleNumber,fuel,fuelCapacity,cc,as,nd);
	  	    fw.displayMake();
	  	    fw.displayBasicinfo();
	  	    fw.displayDetailinfo();
	  	}
	  	else{
	  	    System.out.println("Kick Start Availble(yes/no):");
	  	    sc.nextLine();
	  	    String k=sc.nextLine();
	  	    Boolean ks;
	  	    if(k.equals("yes"))
	  	    {
	  	      ks=true;  
	  	    }
	  	    else 
	  	     ks=false;
	  	     System.out.println("***"+make +"***");
	  	     TwoWheeler tw=new TwoWheeler(make,vehicleNumber,fuel,fuelCapacity,cc,ks);
	  	     tw.displayMake();
	  	     tw.displayBasicinfo();
	  	     tw.displayDetailinfo();
	  	    }
	  	
	  	
	}
}
