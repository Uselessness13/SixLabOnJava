import javafx.scene.paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        JFrame framec=new JFrame("Test");
        framec.setBounds(0, 0,700, 700);
        framec.setVisible(true);
        framec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(){
            Graphics2D g2;

            Object[] possibilities = {"Russia", "France", "Holland", "Belgium", "Italy"};
            String s = (String)JOptionPane.showInputDialog(framec,"Choose your country than press OK","Choose ur country",JOptionPane.PLAIN_MESSAGE,null,possibilities,"Russia");

            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g2=(Graphics2D)g;
                new Flags(100,100,500,700,1, Color.white, Color.blue, Color.red, g2, s);

            }
        };
        framec.setContentPane(contentPane);

    }

}
