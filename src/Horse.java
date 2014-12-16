import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;


public class Horse extends Wanderer {

	  public Horse(int x, int y)
   {
   super(x, y);
   }
	
   public void wander(int count, int timer) {
	int x = 0;
   while (x < count){ 
   wander(timer);
   putBeeper();
   x = x + timer;
   
   }
   }
   
   
	}

