
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionAddSub implements ActionListener {
    
    JFrame f;
    JButton b1,b2;
    JTextField t1,t2,t3;
    ActionAddSub()
    {
        f = new JFrame();
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        
        t3 = new JTextField(20);
        
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(t3);
        
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,120,10);
        f.setSize(350,450);
        f.setLayout(f1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        
        if(ae.getSource()== b1)
        {
            int sum = a+b;
            t3.setText(String.valueOf(sum));
        }
        else if(ae.getSource()== b2)
        {
            int sub = a-b;
            t3.setText(String.valueOf(sub));
        }
    }
    public static void main(String args[])
    {
        new ActionAddSub();
    }
}

