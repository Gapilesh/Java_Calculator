// 3 required imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Implementing an action listener
public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];      // 10 buttons for the 10 numbers
    JButton[] functionButtons = new JButton[8];     // 8 Function Buttons
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;       // Panel to keep the buttons

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;          //This will hold multiply, subtract, etc operators.

    Calculator(){                   //This is the Constructor

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //Close out of the program
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);       //Can't type in textfield

        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args){

        //Creating the instance of a calculator class
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
