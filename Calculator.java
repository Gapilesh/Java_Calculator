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
        textField.setBounds(50, 25, 300, 50);   //Text field size
        textField.setFont(myFont);      //Text field font style
        textField.setEditable(false);

        //Buttons for each Functions
        addButton = new JButton ("+");
        subButton = new JButton ("-");
        mulButton = new JButton ("*");
        divButton = new JButton ("/");
        decButton = new JButton (".");
        equButton = new JButton ("=");
        delButton = new JButton ("Delete");
        clrButton = new JButton ("Clear");

        //Adding these buttons to the Array "functionButtons"
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        //Lot of functions, So creating a for loop to iterate 8 times.
        for (int i=0; i<8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);     //Removes the button outline (annoying)
        }

        //Doing something similar to the Number buttons like we did for function buttons.
        //This iterates 10 times
        for (int i=0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));      //
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        //Separately creating the Delete button and clear button on the panel
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        frame.add(delButton);
        frame.add(clrButton);
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
