import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by aaand on 10.12.2016.
 */
public class SpiralRunner {
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
                int numberOfSpirals = Integer.parseInt(JOptionPane.showInputDialog("Введите количество спиралей"));
                for (int i = 1; i <= numberOfSpirals; i++) {
                    int x = Integer.parseInt(JOptionPane.showInputDialog("Введите позицию Х"));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("Введите позицию Y"));
                    int len = Integer.parseInt(JOptionPane.showInputDialog("Введите длинну первого фрагмента"));
                    int numb = Integer.parseInt(JOptionPane.showInputDialog("Введите количество витков спирали"));
                    new Spiral(x, y, len, numb, g2);
                }
            }
        };
        frame.setContentPane(contentPane);
        frame.setVisible(true);
    }
}
