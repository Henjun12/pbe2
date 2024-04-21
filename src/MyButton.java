import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyButton extends JFrame implements ItemListener {
    JLabel lbl1,lbl2;
    JCheckBox cb1,cb2;

    public MyButton(){
        setTitle("This is an item event");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));
        setVisible(true);

        lbl1 = new JLabel("This is banana");
        lbl2 = new JLabel("This is dragon fruit ");
        lbl1.setVisible(false);
        lbl2.setVisible(false);

        cb1 = new JCheckBox("Banana");
        cb1.addItemListener(this);
        cb2 = new JCheckBox("Dragon Fruit");
        cb2.addItemListener(this);

        add(lbl1);
        add(lbl2);
        add(cb1);
        add(cb2);
    }

    public static void main(String[] args) {
        new MyButton();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (cb1.isSelected()==true){
            lbl1.setVisible(true);
        }else{
            lbl1.setVisible(false);
        }
        if (cb2.isSelected()==true){
            lbl2.setVisible(true);
        }else{
            lbl2.setVisible(false);
        }
    }
}
