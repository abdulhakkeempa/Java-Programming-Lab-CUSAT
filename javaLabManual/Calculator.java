import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.*;  


public class Calculator implements ActionListener{

    float firstValue,secondValue;
    boolean isOperatorClicked = false;

    JFrame frame = new JFrame("Calculator");
    JTextField screen = new JTextField();
    Calculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,300, 340);            
        frame.setVisible(true);
    }
    public void addComponents(){
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setBounds(12,20, 260,50);  
        screen.setEditable(false);
        screen.setBackground(Color.GRAY);
        screen.setForeground(Color.WHITE);
        screen.setFont(new Font("Courier", Font.PLAIN, 16));
        frame.setLayout(null);  
        frame.add(screen);
        createButtons();
    }

    void createButtons(){
        JButton plus = new JButton("+");
        JButton min = new JButton("-");
        JButton div = new JButton("/");
        JButton mult = new JButton("x");
        JButton equals = new JButton("=");
        JButton clear = new JButton("C");


        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton dot = new JButton(".");

        equals.setBounds(212,90,60,190);



        plus.setBounds(12,90, 40,40);
        min.setBounds(62,90, 40,40);
        div.setBounds(112,90, 40,40);
        mult.setBounds(162,90, 40,40);

        button7.setBounds(12,140, 40,40);
        button8.setBounds(62,140, 40,40);
        button9.setBounds(112,140, 40,40);
        button0.setBounds(162,140, 40,40);


        button4.setBounds(12,190, 40,40);
        button5.setBounds(62,190, 40,40);
        button6.setBounds(112,190, 40,40);
        dot.setBounds(162,190, 40,40);

        button1.setBounds(12,240, 40,40);
        button2.setBounds(62,240, 40,40);
        button3.setBounds(112,240, 40,40);
        clear.setBounds(162,240, 40,40);        


        plus.setMargin(new Insets(0, 0, 0, 0));
        min.setMargin(new Insets(0, 0, 0, 0));
        div.setMargin(new Insets(0, 0, 0, 0));
        mult.setMargin(new Insets(0, 0, 0, 0));
        clear.setMargin(new Insets(0, 0, 0, 0));

        frame.add(plus);
        frame.add(min);
        frame.add(div);
        frame.add(mult);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(clear);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(dot);        
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);   
        frame.add(equals);       

        dot.addActionListener(this);
        plus.addActionListener(this);
        min.addActionListener(this);
        div.addActionListener(this);
        mult.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){  
        String text = e.getActionCommand();
      if (text.charAt(0) == 'C') {                      
         screen.setText("");
      }else if (text.charAt(0) == '=') {    
        System.out.println(screen.getText());                
        screen.setText(evaluate(screen.getText()));
      }else {                                
         screen.setText(screen.getText() + text);
      }
    }  

   public String evaluate(String expression) {
      char[] arr = expression.toCharArray();
      String operand1 = "";String operand2 = "";String operator = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if(operator.isEmpty()){
               operand1 += arr[i];
            }else{
               operand2 += arr[i];
            }
         }  

         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }

      if (operator.equals("+")){
         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
      }   
      else if (operator.equals("-")){
         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
      }   
      else if (operator.equals("/")){
         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
      }   
      else{
         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));         
      }    
      return ""+result;
   }    
  

    public static void main(String S[]){
        Calculator c = new Calculator();
        c.addComponents();
    }
}