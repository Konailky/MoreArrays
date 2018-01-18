
/**
 * Write a description of class ArrList here.
 * Arrays in a list? 
 *
 * @author Kong
 * @version 1.18.18
 */
import java.util.ArrayList;
import java.util.List;//This is actually an interface and not a class.
import java.util.Scanner;
import java.lang.Integer;
public class ArrList
{

    ArrayList<Object> list;
    public ArrList(){
        list =  new ArrayList<Object>();
        list.add("Hot pockets");
        list.add("Cookies");
        list.add("Salt....Wait, it's called ramen");
        list.add(new Scanner(System.in));
        list.add(new Integer (2));
        System.out.println(list.size());
    }
    
    public void printLIst(){
        System.out.println("Your shopping list contains:");
        System.out.println();
        for(Object i : list){
         System.out.println(i);   
        }
    }
}
