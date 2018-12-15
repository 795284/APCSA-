
/**
 * Write a description of class th here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
public class GraphicsRunner extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 550;
    public GraphicsRunner()
    {
        super("Graphics Runner");
        setSize(WIDTH,HEIGHT);
        add(new RandomColoredBoxes());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main( String args[] )
    {
        GraphicsRunner run = new GraphicsRunner();
    }

}




































