import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlueCircleOnMouseClick extends JFrame {
    private int x = -50, y = -50; // Initial coordinates outside the frame

    public BlueCircleOnMouseClick() {
        setTitle("Blue Circle on Mouse Click");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);

        // Add MouseListener using MouseAdapter
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX(); // Get the x-coordinate of the click
                y = e.getY(); // Get the y-coordinate of the click
                repaint(); // Redraw the frame with the new circle
            }
        });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass's paint method
        g.setColor(Color.BLUE); // Set the color to blue
        g.fillOval(x - 25, y - 25, 50, 50); // Draw a circle with a radius of 25 pixels
    }

    public static void main(String[] args) {
        new BlueCircleOnMouseClick(); // Create and display the frame
    }
}
