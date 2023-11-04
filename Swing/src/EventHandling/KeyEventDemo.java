
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyEventDemo implements KeyListener {
    
    JFrame f;
    JTextField t1,t2,t3;
    JButton b;
    
    KeyEventDemo()
    {
        f = new JFrame();
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b = new JButton("ok");
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        f.setLayout(fl);
        f.setSize(350,450);
        f.setVisible(true);
        b.addKeyListener(this);
        
    }
    public void keyPressed(KeyEvent ke)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        
        if(ke.getKeyChar() == 'a')
        {
            int sum;
            sum = a+b;
            t3.setText(String.valueOf(sum));
        }
        else if(ke.getKeyChar()=='s')
        {
            int diff;
            diff = a-b;
            t3.setText(String.valueOf(diff));
            
        }
        else
        {
            System.out.println("You press other key");
        }
           
       
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }
    public void keyReleased(KeyEvent ke)
    {
        
    }
    public static void main(String[] args) {
        new KeyEventDemo();
    }
    
}
