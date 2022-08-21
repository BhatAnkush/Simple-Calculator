package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculator extends JFrame implements ActionListener {
     Container c = getContentPane();
    JLabel l1= new JLabel(" First Number");
    JLabel l2 = new JLabel("Second Number");
    JLabel result = new JLabel();
    JTextField t1 = new JTextField(20);
    JTextField t2= new JTextField(20);
    JButton add = new JButton("add");
    JButton subtract = new JButton("subtract");
    JButton multiply = new JButton("multiply");
    JButton divide = new JButton("divide");
    public calculator(){
        super("Calculator");
        setSize(300,300);
        c.setLayout(new FlowLayout());
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(add);
        c.add(subtract);
        c.add(multiply);
        c.add(divide);
        c.add(result);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == add){
            String ans1 = t1.getText();
            int num1 = Integer.parseInt(ans1);
            String ans2 = t2.getText();
            int num2 = Integer.parseInt(ans2);

            int RESULT = num1 + num2;
            String res = new Integer(RESULT).toString();
            result.setText("The result is equal to " + res);
        }

        if(source == subtract){
            String ans1 = t1.getText();
            int num1 = Integer.parseInt(ans1);
            String ans2 = t2.getText();
            int num2 = Integer.parseInt(ans2);
            int RESULT = num1 - num2;
            String res = new Integer(RESULT).toString();
            result.setText("The result is equal to " + res);
        }

        if(source == multiply){
            String ans1 = t1.getText();
            int num1 = Integer.parseInt(ans1);
            String ans2 = t2.getText();
            int num2 = Integer.parseInt(ans2);
            int RESULT = num1 * num2;
            String res = new Integer(RESULT).toString();
            result.setText("The result is equal to " + res);
        }

        if(source == divide){
            String ans1 = t1.getText();
            double num1 = Double.parseDouble(ans1);
            String ans2 = t2.getText();
            double num2 = Double.parseDouble(ans2);
            Double RESULT = num1 / num2;
            String res = new Double (RESULT).toString();
            result.setText("The result is equal to " + res);
        }

    }
    public static void main(String[] args){
        calculator demo = new calculator();
        demo.setVisible(true);
    }

}