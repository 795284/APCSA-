
/**
 * 
 * CellMatrix
 * Zephyr Granger
 * (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(int x [] []){

        for(int r=0; r<cells.length;r++){
            for(int c=0;c<cells[r].length;c++){
                System.out.print("\t"+cells[r][c]);  
            }

        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive 
    // sthis should be the parameters behind what numbers can appear in each cell
    public void loadMatrix(){
        for(int r=0;r<cells.length;r++){
            for(int c =0;c<cells[r].length;c++){
                cells[r][c]= new Cell ((int)(Math.random()*10)+1);
            }
        }
    }
    
     public int getNeighborSum(){ 
        int sum = 0; 
        for (int i =0; i<neighbors.length; i++){ 
            if(neighbors[i] != null){ 
                sum += neighbors[i].getInt();
            } 
        } 
        return sum;
    } 

    //  Finds the sum of each of the neighbors and returns the greatest 
    // so this should add the neighbors adajcent to the cell and then find the largest sum of neighbors of all the cells
    // neighbor value
    //public int getGreatestNeighbors(){
    //   int sum;
    //}
    //  Load neighbor cells into the neighbors array
    // make if statements for getting north south east west when there are none

    public void loadNeighbors(){
       
        for(int r=0; r<cells.length; r++){ 
           for(int c=0; c<cells[r].length; c++){ 
               if(r>0){ //get north 
                   cells[r][c].getNeighbors()[0]=cells[r-1][c]; 
                } 
               if(c>0){ //get west 
                   cells[r][c].getNeighbors()[1]=cells[r][c-1]; 
                } 
               if(c<cells[0].length){ //get east
                   cells[r][c].getNeighbors()[2]=cells[r][c+1]; 
                } 
            if(r<cells.length-1){ //get south 
                   cells[r][c].getNeighbors()[3]=cells[r+1][c]; 
                } 
            } 
        } 
    } 
    }


    
