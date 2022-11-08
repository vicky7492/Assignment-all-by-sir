import java.util.Scanner;  
class Airline_Booking {  
     String Pass_Details;  
     String source;  
     String destination; 
     long age;  
	 String Address;
    Scanner sc = new Scanner(System.in);  
  
    public void Booking_Details() {  
        System.out.print("Enter Passenger  Passenger Name - ");  
        Pass_Details = sc.next();  
        System.out.print("Enter Source -");  
        destination = sc.next();  
        System.out.print("Enter  Destination - ");  
        source = sc.next();  
        System.out.print("Enter Age -  ");  
        age = sc.nextLong();  
		System.out.print("Enter the Address-  ");  
        Address = sc.next();  
    }  
	
    
    public void showPassengerDetails() {  
        System.out.println(" Passenger Name - " + Pass_Details);  
        System.out.println("Source -  " + destination);  
        System.out.println("Destination - " + source);  
        System.out.println("Age - " + age); 
        System.out.println("Address - " + Address); 		
    }  
    
    public void Payment() {  
        long amt;  
        System.out.println("Enter the amount to Payment: ");  
        amt = sc.nextLong();  
        age = age + amt;  
    }  
     
    public void flight_Details() {  
        long amt;  
        System.out.println("Enter the flight_Details ");  
        amt = sc.nextLong();  
        if (age >= amt) {  
            age = age - amt;  
            System.out.println("flight_Details: " + age);  
        } else {  
            System.out.println("Your age is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
      
    public boolean search(String ac_no) {  
        if (Pass_Details.equals(ac_no)) {  
            showPassengerDetails();  
            return (true);  
        }  
        return (false);  
    }  
}  
public class Ticket_Booking {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
         
        System.out.print("How many number of Passenger to Travel  - ");  
        int n = sc.nextInt();  
        Airline_Booking C[] = new Airline_Booking[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new Airline_Booking();  
            C[i].Booking_Details();  
        }  
        
        int ch;  
        do {  
            System.out.println("\n ***Flight_Booking  System Application***");  
            System.out.println("1.Display all Passenger Details -\n2.Search by Name\n3.Go to The Payment \n4.Flight Details\n5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showPassengerDetails();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Passenger Name - ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Passenger Name doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Payment Method Open -   ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].Payment();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("\n 1. Indigo \n 2. Air India \n 3. SpiceJet Airways \n 4. Jet Airways  ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].flight_Details();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Payment doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("Thanku for the visit .......");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }  