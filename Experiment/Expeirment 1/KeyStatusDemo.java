import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyStatusDemo extends JFrame implements KeyListener {
    private JLabel statusLabel;

    public KeyStatusDemo() {
        setTitle("Key Status Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        statusLabel = new JLabel("Press any key...");
        add(statusLabel);

        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        statusLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        statusLabel.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        statusLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        KeyStatusDemo demo = new KeyStatusDemo();
        demo.setVisible(true);
    }
}
