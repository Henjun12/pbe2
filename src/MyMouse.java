import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyMouse extends JFrame implements MouseListener {
    JLabel lbl;
    MyMouse(){
        lbl = new JLabel("Owen Gege");

        setTitle("This is an key event");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        lbl.setBounds(50,100,80,30);
        lbl.addMouseListener(this);
        add(lbl);
    }

    public static void main(String[] args) {
        new MyMouse();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lbl.setText("the mouse is clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lbl.setText("the mouse is owen");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lbl.setText("the mouse is gege");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lbl.setText("the mouse is clicked");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lbl.setText("the mouse is oweng");
    }
}
