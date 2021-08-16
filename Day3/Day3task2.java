import java.util.Scanner;
import java.util.*;
class HotelRoom
{
    private String hotelName;
    private int numberOfSqFeet;
    private Boolean hasTV;
    private Boolean hasWifi;
     
     public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
     {
         this.hotelName=hotelName;
         this.numberOfSqFeet=numberOfSqFeet;
         this.hasTV=hasTV;
         this.hasWifi=hasWifi;
     } 
        public void calculateTariff(int numberOfSqFeet,int val)
        {
            
        }
        public int getRatePerSqFeet()
        {
            return 0;
        }
    }     
        class DeluxRoom extends HotelRoom
        {
            private int rpsqft;
            int cs=10;
            
            DeluxRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
            {
                super(hotelName,numberOfSqFeet,hasTV,hasWifi);
                
            }
            public void calculateTariff(int numberOfSqFeet,int cs)
            {
                int val=numberOfSqFeet*cs;
                System.out.println("Room Tariff per Day is :"  +val);
            }
            public int getRatePerSqFeet(Boolean hasWifi)
            {
                if(hasWifi==true)
                {
                    return this.cs+2;
                }
                else 
                return this.cs;
            }
        }

    class DeluxeSeaViewRoom extends DeluxRoom
    {
        private int  rpsqft;
        private int cs=12;
        
        DeluxeSeaViewRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
        {
            super(hotelName,numberOfSqFeet,hasTV,hasWifi);
            
        }
        public void calculateTariff(int numberOfSqFeet,int  cs)
        {
          int val=numberOfSqFeet*cs;
          System.out.println("Room Tarif per Day is:" +val);
        }
        public int getRatePerSqFeet(Boolean hasWifi)
        {
            if(hasWifi==true)
             return this.cs+2;
            else 
                return this.cs;  
            
        }
    }
    
    class SuiteRoom extends HotelRoom
    {
     private int rpsqft;
     int cs=15;
     SuiteRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
     {
         super(hotelName,numberOfSqFeet,hasTV,hasWifi);
         
     }
     public void calculateTariff(int numberOfSqFeet,int cs)
     {
         int val=numberOfSqFeet*cs;
         System.out.println("Room Tariff per Day is:" +val);
         
     }
     public int getRatePerSqFeet(Boolean hasWifi)
     {
         if(hasWifi==true)
           return this.cs+2;
          else
            return this.cs;
     }
}

class Day3task2
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Hotel Tariff Calculator");
	   System.out.println("1.Delux Room\n2.Delux AC Room \n3.Suite AC Room");
	   System.out.println("Select Your Room Type:");
	   int n=sc.nextInt();
	   System.out.println("Enter Hotel Name:");
	   sc.nextLine();
	   String hotelName=sc.nextLine();
	   System.out.println("Room Sq Feet Area:");
	   int numberOfSqFeet=sc.nextInt();
	   System.out.println("Room Has TV(yes/no):");
	   sc.nextLine();
	   String s=sc.nextLine();
	   Boolean hasTV;
	   if(s.equals("yes"))
	        hasTV=true;
	   else 
	        hasTV=false;
	        
	   System.out.println("Room Has Wifi(yes/no):");
	   String wifi=sc.nextLine();
	   Boolean hasWifi;
	   if(wifi.equals("yes"))
	     hasWifi=true;
	    else
	     hasWifi=false;
	     
	       if(n==1){
	       
	                      DeluxRoom d=new DeluxRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
	                      int rpsqft=d.getRatePerSqFeet(hasWifi);
	                      d.calculateTariff(numberOfSqFeet,rpsqft);
	                      
	               }
	                    
	       else if(n==2){
	                      DeluxeSeaViewRoom ds=new DeluxeSeaViewRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
	                      int rpsqft=ds.getRatePerSqFeet(hasWifi);
	                      ds.calculateTariff(numberOfSqFeet,rpsqft);
	                      
	       }
	                    
	       else{
	                      SuiteRoom sr=new SuiteRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
	                      int rpsqft=sr.getRatePerSqFeet(hasWifi);
	                      sr.calculateTariff(numberOfSqFeet,rpsqft);
	                      
	       }
	   
	   
	}   
}
