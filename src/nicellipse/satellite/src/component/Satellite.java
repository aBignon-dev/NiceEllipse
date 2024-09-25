package nicellipse.satellite.src.component;

import nicellipse.component.NiImage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Satellite extends NiImage {
  private static String SATELLITE_IMAGE_PATH = "satellite.png";
  //Create a new Satellite with Satellite Icon loaded from the ressources
  public Satellite(Point p) throws IOException {
    super(new File(SATELLITE_IMAGE_PATH));
    this.setCenter(p);
  }
}
