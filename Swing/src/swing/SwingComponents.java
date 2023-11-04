
package swing;

import javax.swing.*;
public class SwingComponents {
    
    SwingComponents()
    {
        JFrame f = new JFrame("Swing Components");
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextArea ta = new JTextArea();
        ta.setBounds(80,50,200,150);
        f.add(ta);
        
        JCheckBox cb1 = new JCheckBox("Java",true);
        cb1.setBounds(80,270,80,15);
        JCheckBox cb2 = new JCheckBox("c++");
        cb2.setBounds(200,270,80,15);
        f.add(cb1);
        f.add(cb2);
        
        JRadioButton rb1 = new JRadioButton("Male",true);
        rb1.setBounds(80,320,80,15);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(200,320,80,15);
        JRadioButton rb3 = new JRadioButton("Other");
        rb3.setBounds(300,320,80,15);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        
        String country[] = {"Nepal","India","USA","UAE"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(80,420,70,40);
        f.add(cb);
        
        String data[][] = {{"1","ram","chitwan"},{"2","sita","kathmandu"},{"3","hari","butawal"},{"4","shyam","biratnagar"}};
        String column[]= {"id","name","address"};
        
        JTable t = new JTable(data,column);
        
        JScrollPane sp = new JScrollPane(t);
        sp.setBounds(80,500,150,50);
        f.add(sp);
        
        
        
        
        
    }
    public static void main(String[] args) {
        new SwingComponents();
    }
}
