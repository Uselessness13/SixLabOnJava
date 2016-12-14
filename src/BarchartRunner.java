import javax.swing.*;
import java.awt.*;

/**
 * Created by aaand on 14.12.2016.
 */
public class BarchartRunner {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Spiral(s)");
        frame.setBounds(0, 0, 700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel() {
            Graphics2D g2;
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g2 = (Graphics2D) g;

            }
        };
        frame.setContentPane(contentPane);
        frame.setVisible(true);
    }
}
