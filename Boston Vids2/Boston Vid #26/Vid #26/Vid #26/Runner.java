
/**
 * Zephyr Granger
 * Boston Vid #26
 */
import java.util.Random;
public class Runner

{
    public static void mian (String args[]){
       Random dice = new Random();
       int number;
       for(int counter=1;counter<=10;counter++){
         number = 1+dice.nextInt(6);
         System.out.println(number + " ");
        }
    }
}
