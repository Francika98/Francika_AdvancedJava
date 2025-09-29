import java.util.ArrayList;

public class FoodOrdering_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> dishList=new ArrayList<String>();
        // can add any number of dishes as ArrayList is dynamic in nature
        dishList.add("Biryani");   
        dishList.add("Pizza");
        dishList.add("Burger");                                     
        dishList.add("Pasta");
        dishList.add("Salad");
        dishList.add("Sushi");
        dishList.add("Tacos");
        dishList.add("Curry");
        dishList.add("Dumplings");
        dishList.add("Steak");
        System.out.println("The Ordered dishes are "+dishList); 
    }
}
