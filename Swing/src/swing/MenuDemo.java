
package swing;

import javax.swing.*;
public class MenuDemo extends JFrame {
    
    MenuDemo()
    {
        setSize(500,450);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenuItem i1 = new JMenuItem("Open");
        JMenuItem i2 = new JMenuItem("Save");
        file.add(i1);
        file.add(i2);
        mb.add(file);
        mb.add(edit);
        setJMenuBar(mb);
        
    }
    public static void main(String[] args) {
        new MenuDemo();
        
    }
}
