
/**
 * Zephyr Granger
 * New Boston Vid 16
 */
import java.util.Scanner;
public class Runner

{ 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Other otherObject = new Other();
        System.out.println("Enter birth name here: ");
        String temporary = input.nextLine();
        otherObject.setName(temporary);
        otherObject.saying();
        
        
        
        
    }
}
