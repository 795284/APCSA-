
/**
 *Zephyr Granger
 *Boston Vid 15
 */
import java.util.Scanner;
public class Runner
{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        Other OtherObject = new Other();
        System.out.println("Type your name:");
        String name = input.nextLine();
        
        OtherObject.message(name);
    }
}
