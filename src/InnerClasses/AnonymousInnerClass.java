package InnerClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AnonymousInnerClass implements ActionListener {
    JFrame frame;
    JButton button;

    AnonymousInnerClass(){
        frame = new JFrame("Startup Screen");
        button = new JButton ("Start");

        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        frame.add(button);
        button.addActionListener(this);
    }

    public static void main(String[] args) {

    }
}
