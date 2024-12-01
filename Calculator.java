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

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.GRAY);

        //Adding the number buttons
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
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

        //To see if somebody's clicking the number buttons
        for(int i=0;i<10;i++){
            if (e.getSource() == numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        //Adding functionality to decimal button
        if (e.getSource()==decButton){
            textField.setText(textField.getText().concat("."));
        }

        //Adding functionality to add button
        if (e.getSource()==addButton){
            num1 = Double.parseDouble(textField.getText());
            //Assigning an operator which is a 'character'
            operator = '+';
            textField.setText("");
        }
        if (e.getSource()==subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource()==mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource()==divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if(e.getSource()==equButton) {
            num2 = Double.parseDouble(textField.getText());

            //Using a switch
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;


        }
    }
}
