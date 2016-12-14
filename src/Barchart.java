import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by aaand on 14.12.2016.
 */
public class Barchart {
    private int midline;

    Barchart(int height, Graphics2D g2) {
        Rectangle stolb;
        if (height>0){
            stolb = new Rectangle(50, 100, 50, height);
        }
        else {
            stolb = new Rectangle(50, midline+100, 50, height);
        }
        midline = height+100;
        g2.setColor(Color.blue);
        g2.fill(stolb);
    }
}
