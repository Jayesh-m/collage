import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel statusLabel;

    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        statusLabel = new JLabel("Perform mouse actions inside the window", JLabel.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }


    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered the window");
    }

    
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited the window");
    }

    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved to (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
