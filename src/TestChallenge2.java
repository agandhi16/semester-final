import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class TestChallenge2 {
	

	public static void main(String[] args) {
		Display.openWorld("maps/pasture.map");
      Display.setSize(15, 15);
      Display.setSpeed(5);
      
      Horse alex = new Horse(6,3);
      
      alex.wander(36,7);
      alex.explode();
	
    

}
