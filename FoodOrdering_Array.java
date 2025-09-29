import java.util.Arrays;
import java.util.Scanner;

public class FoodOrdering_Array {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int count=0;
        String[] dishList=new String[5];
        boolean flag=true;
       while(flag)
        {
            System.out.println("Enter the Name of the Dish");
            String DishName=sc.nextLine();
            if(count<5)
            {
            dishList[count]=DishName;
            count++;
            }
            else
            {
                flag=false;
                System.out.println("Order limit reached");
                sc.close();
            }


        }
        System.out.println("The Ordered dishes are "+Arrays.toString(dishList));
    }
}
