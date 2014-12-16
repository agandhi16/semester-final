/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import org.asl.karelx.Squarebot;


public class TestChallenge1 {
	

   public static void main(String[] args) {
   Display.openWorld("maps/.map");
   Display.setSize(20, 20);
   Display.setSpeed(5);
   
   Squarebot pete = new Squarebot(9,3);
   
   pete.layCorners(5);
   pete.explode();
   
   Sentry karel = new Sentry(4, 4, Display.NORTH, 1);
   
   karel.patrol(karel);

	}

}

