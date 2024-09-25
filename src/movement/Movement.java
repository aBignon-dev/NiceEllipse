package movement;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

// define the Movement abstract class
abstract class Movement {


    // define one movement method that will be called by the move method
     void onMove( int x, int y, JComponent component){
         final Runnable doit = () -> {
             component.setLocation(new Point(x, y));
             try {
                 Thread.sleep(15);
             } catch (InterruptedException e) {
                    e.printStackTrace();
             }
         };

         try {
             SwingUtilities.invokeAndWait(doit);
         } catch (InvocationTargetException | InterruptedException e1) {
             e1.printStackTrace();
         }
     }

    // define the specific move method
    abstract void move(JComponent space, JComponent component);


    // define the four move methods
    abstract void moveUp(JComponent space, JComponent component, int destination);
    abstract void moveDown(JComponent space, JComponent component, int destination);
    abstract void moveLeft(JComponent space, JComponent component, int destination);
    abstract void moveRight(JComponent space, JComponent component, int destination);

    // define the stop method
    abstract void stop(JComponent component);

    // define the turn method
    abstract void turn();
}
