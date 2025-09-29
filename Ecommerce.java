
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ecommerce {
    public static void main(String[] args) {
        List<String> products=Arrays.asList("apple","banana","apple","mango","banana","apple");
        HashMap<String,Integer> productCount=new HashMap<>();
        for(String product:products){
            productCount.put(product,productCount.getOrDefault(product, 0)+1);
        }
        System.out.println(productCount);
    }
}
