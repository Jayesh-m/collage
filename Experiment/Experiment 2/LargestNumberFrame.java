import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LargestNumberFrame extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field;
    private JButton findLargestButton;
    private JLabel resultLabel;

    public LargestNumberFrame() {
        // Set up the frame
        setTitle("Find the Largest Number");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create text fields for user input
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);

        // Add labels and text fields to the frame
        add(new JLabel("Number 1:"));
        add(num1Field);
        add(new JLabel("Number 2:"));
        add(num2Field);

        // Create and add the button
        findLargestButton = new JButton("Find Largest");
        findLargestButton.addActionListener(this);
        add(findLargestButton);

        // Create and add the result label
        resultLabel = new JLabel("");
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse the numbers from the text fields
            int number1 = Integer.parseInt(num1Field.getText());
            int number2 = Integer.parseInt(num2Field.getText());

            // Find the largest number
            int largest = Math.max(number1, number2);

            // Display the result
            resultLabel.setText("Largest number is: " + largest);
        } catch (NumberFormatException ex) {
            // Handle invalid input
            resultLabel.setText("Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        LargestNumberFrame frame = new LargestNumberFrame();
        frame.setVisible(true);
    }
}
