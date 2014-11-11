/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Andre Purits>  // replace <...> with your name
* @version <11/11/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
   public static void runTheRace(Racer arg) {
   arg.move();
   arg.jumpRight();
   arg.shuttle(1,7);
   arg.turnAround();
   arg.shuttle(3,5);
   arg.turnAround();
   arg.shuttle(5,3);
   arg.turnAround();
   arg.jumpLeft();
   arg.turnAround();
   arg.move();
   arg.put(15);
   arg.turnAround();
   arg.move();
   }
     public static void main(String[] args) {
          Display.openWorld("maps/shuttle.map");
          Display.setSize(10,10);
          Display.setSpeed(8);
          Racer andre = new Racer(1);
          Racer giroud = new Racer(4);
          Racer zlatan = new Racer(7);
          runTheRace(andre);
          runTheRace(giroud);
          runTheRace(zlatan);
     }
}
