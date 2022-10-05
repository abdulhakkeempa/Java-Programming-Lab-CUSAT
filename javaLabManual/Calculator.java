import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;


public class Calculator{
    JFrame frame = new JFrame("Calculator");
    JTextField screen = new JTextField("Calculator Screen");
    Calculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,300, 400);            
        frame.setVisible(true);
    }
    public void addComponents(){
        screen.setBounds(12,20, 260,50);  
        screen.setEditable(false);
        screen.setBackground(Color.GRAY);
        screen.setForeground(Color.WHITE);
        screen.setFont(new Font("Courier", Font.PLAIN, 16));
        frame.setLayout(null);  
        frame.add(screen);
    }
    public static void main(String S[]){
        Calculator c = new Calculator();
        c.addComponents();
    }
}