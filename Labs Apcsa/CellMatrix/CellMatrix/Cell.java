
/**
 * Zephyr Granger
 * (11 26 18)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
 public Cell[] getNeighbors(){ 
        return neighbors;
 
    }
    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }
    //public int getGreatestNeighbors(){
     //return x+1;

    //}
    public int getInt(){
        return x;
    }
}
