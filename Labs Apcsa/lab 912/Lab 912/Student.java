
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends StudentRunner
{
    // instance variables - replace the example below with your own
    private int studNumber;
    private boolean StudActive;
    private double StudGPA;
    private String StudName;

    /**
     * Constructor for objects of class Student
     */
    public Student()
   {
        // initialise instance variables
        studNumber = 0;
        StudActive = true;
        StudGPA = 4.0;
        StudName = "Zephyr";
       
        
    }
    

    /**
     * Student Methods
     */
    public void setStudNumber(int sn){
        studNumber = sn;
        
    }
    /**
     * 
     */
    public void setStudActive(boolean tf){
        StudActive = tf;
    }
    /**
     * 
     */
    public void setStudGPA(double xy){
        StudGPA = xy;
    }
    /**
     * 
     */
    public void setStudName(String ZJG){
        StudName = ZJG;
    }
   public int getStudNumber(){
   return studNumber;
 
}
public boolean getStuActive(){
    return StudActive;
}
public double getStudGPA(){
    return StudGPA;
   
}
public String getStudName(){
    return StudName;
}
    
}


    
