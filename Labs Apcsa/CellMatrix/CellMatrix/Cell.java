
/**
 * Zephyr Granger
 * (11 26 18)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }

    /**
     * ++++++++++++++  methods
     */
    
    //  Load neighbor cells into the neighbors array
    
    public void loadNeighbors(){
        for(int r =0;r<cells.length;r++){
            for(int j =0;j<cells[r].length;j++){
                if(r>0){ //if true get north
                    cells [r][j].getNeighbors
                
        
                }
               
            }
    }
}
    public int getInt(){
        return x;
    }
}
