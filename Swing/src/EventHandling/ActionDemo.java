
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionDemo implements ActionListener {
    
    JFrame f;
    JButton b;
    JTextField t1,t2;
    
    ActionDemo()
    {
        f = new JFrame();
        t1 = new JTextField(20);
        b = new JButton("copy");
        t2 = new JTextField(20);
        f.add(t1); 
        f.add(b); 
        f.add(t2);
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER, 120,10);
        f.setSize(350,450);
        f.setLayout(f1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = t1.getText();
        t2.setText(s);
    }
    public static void main(String args[])
    {
        new ActionDemo();
    }
    
}
