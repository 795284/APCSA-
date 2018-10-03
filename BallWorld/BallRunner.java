
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    // instance variables - replace the example below with your own
    public static void activity1(){
        BallWorld ballWorld = new BallWorld (200,200);
        TGPoint start = new TGPoint (-15,80); 
        BallBot ballBot = new BallBot (ballWorld,start,80.5,80);
        int q = 1;

        while(q ==1){
            if(ballBot.canMoveForward(ballWorld) ==true) {
                ballBot.moveForward();
            }
            else{
                ballBot.setHeading(ballBot.getHeading() + (Math.random()*360)%90);

            }
        }
    }

    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        BallWorld bw = new BallWorld (250,300);
        TGPoint P1 = new TGPoint (5,8);
        BallRunner[] bots =new BallRunner[10];

        for(int i =0;i<bots.length;i++){
        }
        for(int r =0;r<ballBotArray.length;r++){
            if(ballBotArray[r]==null){
                return r;
            }
            return ballBotArray.length;
        }


    }
}

