import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator{
    JFrame frame = new JFrame("Calculator");
    Calculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);            
        frame.setVisible(true);
    }


    public static void main(String S[]){
        Calculator c = new Calculator();
    }
}