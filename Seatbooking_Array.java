import java.util.*;

public class Seatbooking_Array {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         boolean flag=true;
       System.out.println("Enter the Number of seat number to be booked(1-10):");
        int seatNo=sc.nextInt();
        sc.nextLine();
        String[] seatlist=new String[10];
        for(int i=0;i<seatlist.length;i++)
        {
            seatlist[i]="Empty";
        }
        int count=0;
        while(flag)
        {
            System.out.println("Enter the Seat Number to be booked:");
            int Seat=sc.nextInt();
            count++;
            if(Seat<=10 && Seat>=0 && count<=seatNo)
            {
                if((seatlist[Seat-1]).equalsIgnoreCase(null)"Booked"))
                {
                    System.out.println("Seat already booked");
                    count--;
                }
                else
                {
                seatlist[Seat-1]="Booked";
                }
            }
            else if (count>seatNo){
                flag=false;
                System.out.println("Exceeds the number of seats you wanted to book");
                sc.close();
                break;
            }
            else
            {
                System.out.println("Invalid seat number");
                count--;
            }

       }
        
        System.out.println("The seat list is "+Arrays.toString(seatlist));
    }
    
}
