import javax.swing.*;
import java.awt.*;

/**
 * Created by aaand on 07.12.2016.
 */
public class Flags extends JComponent {
    public Flags(int x, int y, int len, int wid, int stripe, Color color1, Color color2, Color color3, Graphics2D g2, String countryName) {
        if (stripe == 1) {
            Rectangle rect = new Rectangle(x, y, wid, (int) (len / 3));
            g2.setColor(color1);
            g2.fill(rect);
            Rectangle rect2 = new Rectangle(x, y + (int) (len / 3), wid, (int) (len / 3));
            g2.setColor(color2);
            g2.fill(rect2);
            Rectangle rect3 = new Rectangle(x, y + 2 * (int) (len / 3), wid, (int) (len / 3));
            g2.setColor(color3);
            g2.fill(rect3);


            switch (countryName) {
                case "Russia":
                    Rectangle firstpole = new Rectangle(0, 0, 500, 100);

                    break;
                case "France":

                    break;
                case "Holland":

                    break;
                case "Belgium":

                    break;
                case "Italy":

                    break;
            }


            //frame.setVisible(true);
        }

    }
}
