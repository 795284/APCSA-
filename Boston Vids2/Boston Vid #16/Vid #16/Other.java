
/**
 *Zephyr Granger
 *Vid 16
 */
public class Other
{
    private String birthName;
    public void setName(String name){
     birthName=name;
     
    }
    public String getName(){
     return birthName;
    }
    public void saying(){
        System.out.printf("Your name was %s",getName());
    }
}
