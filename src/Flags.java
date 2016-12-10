import javax.swing.*;
import java.awt.*;

class Flags extends JComponent {
    private Rectangle firstPole, secondPole, thirdPole;

    public Flags(int x, int y, int len, int wid, Color color1, Color color2, Color color3, Graphics2D g2, String countryName) {
        switch (countryName) {
            case "Russia":
                firstPole = new Rectangle(x, y, wid, (int) (len / 3));//white
                secondPole = new Rectangle(x, y + (int) (len / 3), wid, (int) (len / 3));//blue
                thirdPole = new Rectangle(x, y + 2 * (int) (len / 3), wid, (int) (len / 3));//red
                break;
            case "France":
                firstPole = new Rectangle(x, y, (int) (wid / 3), len);//blue
                secondPole = new Rectangle(x + (int) (wid / 3), y, (int) (wid / 3), len);//white
                thirdPole = new Rectangle(x + 2 * (int) (wid / 3), y, (int) (wid / 3), len);//red
                break;
            case "Holland":
                firstPole = new Rectangle(x, y, wid, (int) (len / 3));//white
                secondPole = new Rectangle(x, y + (int) (len / 3), wid, (int) (len / 3));//blue
                thirdPole = new Rectangle(x, y + 2 * (int) (len / 3), wid, (int) (len / 3));
                break;
            case "Belgium":
                firstPole = new Rectangle(x, y, wid, (int) (len / 3));//white
                secondPole = new Rectangle(x, y + (int) (len / 3), wid, (int) (len / 3));//blue
                thirdPole = new Rectangle(x, y + 2 * (int) (len / 3), wid, (int) (len / 3));
                break;
            case "Italy":
                firstPole = new Rectangle(x, y, (int) (wid / 3), len);//blue
                secondPole = new Rectangle(x + (int) (wid / 3), y, (int) (wid / 3), len);//white
                thirdPole = new Rectangle(x + 2 * (int) (wid / 3), y, (int) (wid / 3), len);
                break;
        }
        g2.setColor(color1);
        g2.fill(firstPole);
        g2.setColor(color2);
        g2.fill(secondPole);
        g2.setColor(color3);
        g2.fill(thirdPole);
    }
}
