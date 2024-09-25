package movement;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class SatelliteMovement extends Movement {
    @Override
    public void move(JComponent space, JComponent robi) {
        int x = 0, y = 0;
        while (true) {
            // while x is less than the width of the space minus the width of robi
            while (x < space.getWidth() - robi.getWidth()) {
                x = x + 1;
                this.onMove(x, y, robi);
            }
            // if x is more than the width of the space minus the width of robi,x =0
            if (x >= space.getWidth() - robi.getWidth()) {
                x = 0;
            }

        }


    }


    @Override
    void moveUp(JComponent space, JComponent component, int destination) {

    }

    @Override
    void moveDown(JComponent space, JComponent component, int destination) {

    }

    @Override
    void moveLeft(JComponent space, JComponent component, int destination) {

    }

    @Override
    void moveRight(JComponent space, JComponent component, int destination) {

    }

    @Override
    public void stop(JComponent component) {
        System.out.println("Satellite is stopped");
    }

    @Override
    public void turn() {
        System.out.println("Satellite is turning");
    }

}
