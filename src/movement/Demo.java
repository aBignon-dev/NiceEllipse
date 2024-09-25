package movement;

import nicellipse.component.NiRectangle;
import nicellipse.component.NiSpace;

import java.awt.*;

public class Demo {

    NiSpace space = new NiSpace("Demo movement", new Dimension(200, 150));
    NiRectangle satellite = new NiRectangle();
    SatelliteMovement satelliteMovement = new SatelliteMovement();
    NiRectangle marker = new NiRectangle();
    MarkerMovement markerMovement = new MarkerMovement();

    public Demo() {
        super();
        space.setBackground(Color.lightGray);
        satellite.setBackground(Color.red);
        satellite.setSize(20, 20);
        space.add(satellite);
        space.add(marker);

        marker.setBackground(Color.blue);
        marker.setSize(20, 20);
        marker.setLocation(new Point(70, 70));

        space.openInWindow();

        // call the move method of the satellite object
        satelliteMovement.move(space, satellite);
        // call the move method of the marker object
        markerMovement.move(space, marker);


    }

    public static void main(String[] args) {
        new Demo();
    }

}

