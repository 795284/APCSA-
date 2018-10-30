
/**
 * Write a description of class Runner here.
 * Zephyr Granger
 * The New Boston Vid #6
 */
import java.util.Scanner;
public class Runner
{
    public static void main(){
        Scanner bob = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = bob.nextLine();
        
        System.out.println("Please enter your age");
        int age = bob.nextInt();
        
        System.out.println("Hey " + name +"  it apears you are " + age + " years old");
        
    }
}
