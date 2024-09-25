package movement;

import javax.swing.*;

public class MarkerMovement extends Movement{

    @Override
    void moveUp(JComponent space, JComponent component, int destination) {

        while (component.getY() > destination) {
            component.setLocation(component.getX(), component.getY() - 1);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    void moveDown(JComponent space, JComponent component, int destination) {
        while (component.getY() < destination) {
            component.setLocation(component.getX(), component.getY() + 1);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    void moveLeft(JComponent space, JComponent component, int destination) {
        while (component.getX() > destination) {
            component.setLocation(component.getX() - 1, component.getY());
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    void moveRight(JComponent space, JComponent component, int destination) {
        while (component.getX() < destination) {
            component.setLocation(component.getX() + 1, component.getY());
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    void move(JComponent space, JComponent component) {
        // move the marker up, down and zigzag in a loop
        while (true) {
            this.moveUp(space, component, 0);
            this.moveDown(space, component, space.getHeight() - component.getHeight());
            this.moveLeft(space, component, 0);
            this.moveRight(space, component, space.getWidth() - component.getWidth());
        }
    }

    @Override
    void stop(JComponent component) {

    }

    @Override
    void turn() {

    }
}
