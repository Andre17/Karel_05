/**
*  <Describe that the Racer class does>
*
*  @author <Andre Purits>
*  @version <11/11/14>
*/
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Racer extends Athlete 
{
public Racer (int y)
{
   super(1, y, Display.EAST, Display.INFINITY);
}
public void jumpRight(){
turnLeft();
move();
turnRight();
move();
turnRight();
move();
turnLeft();
}
public void jumpLeft() {
turnLeft();
move();
turnLeft();
move();
turnLeft();
move();
turnLeft();
}
public void sprint(int n) {
   for(int k=1; k <=n; k++)
move();
}
public void put(int n) {
for (int k=1; k <= n; k++)
      putBeeper();
}
public void pick(int n) {
for(int k=1; k <= n; k++)
pickBeeper();
}

public void shuttle(int spaces,int beepers) {
for(int k=0; k <= spaces; k++)
move();
for(int k=1; k <= beepers; k++)
   pickBeeper();
   turnAround();
   for(int k=0; k <= spaces; k++)
   move();
   }
}
