import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareNumberFrame extends JFrame implements ActionListener {
    private JTextField numberField;
    private JButton squareButton;
    private JLabel resultLabel;

    public SquareNumberFrame() {
        // Set up the frame
        setTitle("Square a Number");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a text field for user input
        numberField = new JTextField(10);
        add(new JLabel("Enter a number:"));
        add(numberField);

        // Create a button to calculate the square
        squareButton = new JButton("Square");
        squareButton.addActionListener(this);
        add(squareButton);

        // Create a label to display the result
        resultLabel = new JLabel("");
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse the number from the text field
            int number = Integer.parseInt(numberField.getText());

            // Calculate the square of the number
            int square = number * number;

            // Display the result
            resultLabel.setText("Square is: " + square);
        } catch (NumberFormatException ex) {
            // Handle invalid input
            resultLabel.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        SquareNumberFrame frame = new SquareNumberFrame();
        frame.setVisible(true);
    }
}
