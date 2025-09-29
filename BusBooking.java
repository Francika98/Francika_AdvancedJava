import java.util.*;

public class BusBooking {
    public static void main(String[] args) {
        // Bus booking system code can be implemented here
        HashMap<Integer, String> bookings = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of users to book tickets:");
        int users = sc.nextInt();
        boolean flag=true;
        sc.nextLine();
        for (int i = 0; i < users; i++) {
            System.out.println("Enter the number of seats to be booked by user "+(i+1)+":");
            int totalSeatCount = sc.nextInt();
            int count = 0;
            while(flag) {

                System.out.println("Enter seat number to book(1-50):");
                int seatNumber = sc.nextInt();
                count++;
                if (seatNumber >= 1 && seatNumber <= 50 && count<=totalSeatCount) {
                    if (bookings.containsKey(seatNumber)) {
                        System.out.println("Seat already booked");
                        count--;
                    } else {
                        bookings.put(seatNumber, "Booked");
                        System.out.println("Seat booked successfully");
                    }

                }else if (count>totalSeatCount) {
                    System.out.println("Booking limit reached");  
                    break;  
                }
                 else {
                    System.out.println("Invalid seat number");
                }
            }

        }
        sc.close();
        for(int i=0;i<50;i++)
        {
            if(!bookings.containsKey(i+1))
            {
                bookings.put(i+1, "Available");
            }
        }

        System.out.println("Booked seats are: " + bookings);
        //to iterate through map
        for(Map.Entry<Integer,String> entry:bookings.entrySet())
        {
                System.out.println("Seat Number: "+entry.getKey()+" Status: "+entry.getValue());
        
        }
    }
}
