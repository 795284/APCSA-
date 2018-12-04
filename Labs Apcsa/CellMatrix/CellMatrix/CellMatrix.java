
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
        
       for(int row=0; r<cells.length;row++){
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
             cells[r][c]= new cell ((int)(Math.Random()*10)+1);
            }
        }
    }
    //  Finds the sum of each of the neighbors and returns the greatest 
    // so this should add the neighbors adajcent to the cell and then find the largest sum of neighbors of all the cells
    // neighbor value
    public int getGreatestNeighbors(){
        int sum;
        sum == north+south+west+east;
        
        return 0;
    }
      //  Load neighbor cells into the neighbors array
      // make if statements for getting north south east west when there are none
      int south;
      int east;
      int west;
     
    public void loadNeighbors(){
        for(int r =0;r<cells.length;r++){
            for(int j =0;j<cells[r].length;j++){
                if(r>0){ //if true get north
                    r[0]= cells[r-1][j];}
               
            
            if(r<cells.length){ //this should get the southern neighbor if its in the last row of array should get null
                south == cells[r+1];
            } else {south == null;
        }
        if(j>=0){//this should get the east neighbor
            east == cells[r][j+1];
        }else{if(j>cells[r].length){
            east == null;
        }
        if(j>0){// should get the west neighbor
            west == cells[r][j-1];
        }else{ if(j>cells[0].length){
            west == null;
    }
    }
    
    
}
    
    
}
