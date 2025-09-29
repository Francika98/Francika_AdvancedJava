import java.util.*;
public class Library {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System");
        // Library management system code can be implemented here
        //we can store unique book ids using Treeset in sorted/Natural order
        TreeSet<Integer> bookIds = new TreeSet<>();
        bookIds.add(106);           
        bookIds.add(101);
        bookIds.add(103);                       
        bookIds.add(105);
        bookIds.add(102); 
        bookIds.add(104);
        bookIds.add(104); //duplicate value, will not be added
        System.out.println("Book IDs in the library: " + bookIds);

    }
}
