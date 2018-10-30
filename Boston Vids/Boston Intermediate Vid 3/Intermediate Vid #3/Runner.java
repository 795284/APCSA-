
/**
 *Zephyr Granger 
 * New Boston Intermediate Vid 3
 */
public class Runner
{
    public static void main(String args[]){
        System.out.println(fact(5));
    }
    public static long fact(long n){
        if(n<=1)
        return 1;
        else
        return n*fact(n-1);
    }
}
