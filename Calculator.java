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

    Calculator(){

    }

    public static void main(String[] args){

        //Creating the instance of a calculator class
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
