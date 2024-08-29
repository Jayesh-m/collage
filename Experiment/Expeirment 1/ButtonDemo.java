import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends JFrame implements ActionListener {
    private JButton yesButton, noButton, exitButton;
    private JLabel messageLabel;

    public ButtonDemo() {
        // Set up the frame
        setTitle("Button Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        yesButton = new JButton("Yes");
        noButton = new JButton("No");
        exitButton = new JButton("Exit");

        // Add action listeners to the buttons
        yesButton.addActionListener(this);
        noButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Create a label to display messages
        messageLabel = new JLabel("");

        // Add buttons and label to the frame
        add(yesButton);
        add(noButton);
        add(exitButton);
        add(messageLabel);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check which button was clicked and display the corresponding message
        if (e.getSource() == yesButton) {
            messageLabel.setText("You pressed Yes");
        } else if (e.getSource() == noButton) {
            messageLabel.setText("You pressed No");
        } else if (e.getSource() == exitButton) {
            messageLabel.setText("You pressed Exit");
            System.exit(0);  // Close the application when "Exit" is pressed
        }
    }

    public static void main(String[] args) {
        new ButtonDemo();  // Create and display the frame
    }
}
