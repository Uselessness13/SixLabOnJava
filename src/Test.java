import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        JFrame frame=new JFrame("Test");
        frame.setBounds(0, 0,700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(){
            Graphics2D g2;

            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g2=(Graphics2D)g;
                Scanner sc = new Scanner(System.in);
                System.out.println("элула");
                Integer numb = sc.nextInt();
                switch (numb){
                    case 1: {
                        Flags glag = new Flags(100,100,200,400,1, Color.WHITE, Color.BLUE, Color.RED,g2, "Russia");
                        break;
                    }
                    default: {
                        System.out.println("Неверный формат");
                        break;
                    }
                }

            }
        };
        frame.setContentPane(contentPane);

    }

}
