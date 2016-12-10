import javax.swing.*;
import java.awt.*;

public class FlagRunner {
    public static void main(String[] args) {

        JFrame frame = new JFrame("FlagRunner");
        frame.setBounds(0, 0, 700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel() {
            Graphics2D g2;
            String x = JOptionPane.showInputDialog("Введите позицию Х");
            String y = JOptionPane.showInputDialog("Введите позицию Y");
            String len = JOptionPane.showInputDialog("Введите длинну флага");
            String wid  = JOptionPane.showInputDialog("Введите высоту флага");
            String[] possibilities = {"Russia", "France", "Holland", "Belgium", "Italy"};
            String s = (String) JOptionPane.showInputDialog(frame, "Choose your country than press OK", "Choose ur country", JOptionPane.PLAIN_MESSAGE, null, possibilities, "Russia");

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g2 = (Graphics2D) g;
                switch (s){
                    case "Russia":
                        new Flags(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(len), Integer.parseInt(wid), Color.white, Color.blue, Color.red, g2, s);
                        break;
                    case "France":
                        new Flags(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(len), Integer.parseInt(wid), Color.blue, Color.white, Color.red, g2, s);
                        break;
                    case "Holland":
                        new Flags(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(len), Integer.parseInt(wid), Color.red, Color.white, Color.blue, g2, s);
                        break;
                    case "Belgium":
                        new Flags(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(len), Integer.parseInt(wid), Color.white, Color.blue, Color.red, g2, s);
                        break;
                    case "Italy":
                        new Flags(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(len), Integer.parseInt(wid), Color.green, Color.white, Color.red, g2, s);
                        break;
                }
            }
        };
        frame.setContentPane(contentPane);
        frame.setVisible(true);
    }

}
