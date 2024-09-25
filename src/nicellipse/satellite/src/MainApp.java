package nicellipse.satellite.src;

import nicellipse.component.NiEllipse;
import nicellipse.component.NiImage;
import nicellipse.component.NiSpace;
import nicellipse.satellite.src.component.Balise;
import nicellipse.satellite.src.component.Ciel;
import nicellipse.satellite.src.component.Mer;
import nicellipse.satellite.src.component.Satellite;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MainApp {
  private static int SATELLITE_NUMBER= 5;
  private static int BALISE_NUMBER= 5;


  public static void displayObject(NiSpace space) throws IOException {
    Random rand = new Random();
    for (int i = 0; i < SATELLITE_NUMBER; i++) {
      int x = rand.nextInt(450);
      int y = rand.nextInt(25);
      Point p = new Point(x,50+y);
      Satellite satellite = new Satellite(p);
      space.add(satellite);
    }

    for (int i = 0; i < BALISE_NUMBER; i++) {
      int x = rand.nextInt(450);
      int y = rand.nextInt(50);

      Point p = new Point(x,350-y);
      Balise balise = new Balise(p);
      space.add(balise);
      space.add(new Balise(p));
    }

  }

  public static void main(String[] args) throws IOException {
    NiSpace space = new NiSpace("Space with circles", new Dimension(500, 400));

    space.setBackground(Color.blue);
    Ciel ciel = new Ciel();
    Mer mer = new Mer();
    displayObject(space);
    space.add(ciel);
    space.add(mer);

    space.setOpaque(false);
    space.openInWindow();


    space.repaint();
  }


}
