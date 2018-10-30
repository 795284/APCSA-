
/**
 * Write a description of class other here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class other
{
    private String Name;
    public void setName(String name){
     Name=name;
     
    }
    public String getName(){
     return Name;
    }
    public void saying(){
        System.out.printf("Your name was %s",getName);
    }
}
