package nicellipse.satellite.src.component;

import nicellipse.component.NiImage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Balise extends NiImage {
  private static String BALISE_IMAGE_PATH = "balise.png";
  //Create a new Balise with balise Icon loaded from the ressources
  public Balise(Point p) throws IOException {
    super(new File(BALISE_IMAGE_PATH));
    this.setCenter(p);
  }
}
