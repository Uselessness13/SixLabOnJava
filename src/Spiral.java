import java.awt.*;
import java.awt.geom.Line2D;

public class Spiral {
    private int length;

    Spiral(int startX, int startY, int len, int numberOfsp, Graphics2D g2) {
        int x1 = startX;
        int y1 = startY;
        int x2 = startX + len;
        int y2 = startY;
        int numberOfSpins = numberOfsp;
        Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
        g2.draw(line);


        while (numberOfSpins > 0) {
            x1 = x2;
            y1 = y2;
            y2 -= len;
            Line2D.Double line1 = new Line2D.Double(x1, y1, x2, y2);
            g2.draw(line1);
            len*=1.5;
            y1 = y2;
            x2 -= len;
            Line2D.Double line2 = new Line2D.Double(x1, y1, x2, y2);
            g2.draw(line2);
            y1 = y2;
            y2+=len;
            x1 = x2;
            Line2D.Double line3 = new Line2D.Double(x1, y1, x2, y2);
            g2.draw(line3);
            len*=1.5;
            x2+=len;
            y1 = y2;
            Line2D.Double line4 = new Line2D.Double(x1, y1, x2, y2);
            g2.draw(line4);
            numberOfSpins--;
        }
    }
}