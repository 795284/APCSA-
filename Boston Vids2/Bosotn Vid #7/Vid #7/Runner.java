
/**
 * Write a description of class Runner here.
 * Zephyr Granger
 * Boston Vid #7 Basic Calc
 */
import java.util.Scanner;
public class Runner
{
  static void main(String args[]){
      Scanner One = new Scanner(System.in);
      double fnumber, snumber, answer;
      System.out.println("Input number: ");
      fnumber = One.nextDouble();
      System.out.println("Input next number: ");
      snumber = One.nextDouble();
      answer = fnumber + snumber;
      System.out.println(answer);
    }
}
