import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Customer_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>>  list = new ArrayList<ArrayList<String>>();
        for( int i=0;i<5;i++){
            ArrayList<String> products = new ArrayList<String>();
            for( int j=0;j<5;j++){
                products.add(sc.next());
            }
            list.add(products);
        }
        System.out.println("Enter the primary key (index/fixed column number)");
        int key = sc.nextInt();
        Set<String> key_values = new HashSet<String>();
        for(int i=0;i<5;i++){
            key_values.add(list.get(i).get(key));
        }
        System.out.println(key_values);
    }
}
