import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyKey extends JFrame implements KeyListener {
    JLabel lbl1;
    JTextField txt;

    public MyKey(){
        lbl1 = new JLabel();
        txt = new JTextField(20);txt.addKeyListener(this);

        add(lbl1);
        add(txt);

        setTitle("This is an key event");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyKey();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        lbl1.setText(txt.getText());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        lbl1.setText(txt.getText());
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // char keytyped = e.getKeyChar();
        lbl1.setText("The words you have typed : " + txt.getText());
    }
}
