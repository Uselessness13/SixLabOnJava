import javax.sound.sampled.Line;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by aaand on 09.12.2016.
 */
public class Spiral {
    private int startX, startY, numberOfSpins, firstLenght, x1, x2, y1, y2, length;

    public Spiral(int startX, int startY, int len, int numberOfsp, Graphics2D g2) {
        this.x1 = startX;
        this.y1 = startY;
        this.x2 = startX+len;
        this.y2 = startY;
        this.firstLenght = len;
        this.numberOfSpins = numberOfsp;
        Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
        while (numberOfSpins > 0) {
            x1 += length;
            y2 -= length;
            Line2D.Double line1 = new Line2D.Double(x1, y1, x2, y2);
            y1 -= length;
            length += firstLenght;
            x2 -= length;
            Line2D.Double line2 = new Line2D.Double(x1, y1, x2, y2);
            x1 -= length;
            y2 += length;
            Line2D.Double line3 = new Line2D.Double(x1, y1, x2, y2);
            y1 += length;
            length += firstLenght;
            x2 += length;
            Line2D.Double line4 = new Line2D.Double(x1, y1, x2, y2);
            draw(line, line1, line2, line3, line4);
            numberOfSpins--;
        }
    }
}
