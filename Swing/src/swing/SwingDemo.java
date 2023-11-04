
package swing;

import javax.swing.*;
public class SwingDemo {

    SwingDemo()
    {
        JFrame f = new JFrame("Demo");
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        
        JLabel username = new JLabel("Username");
        JTextField txtuser = new JTextField();
        JLabel password = new JLabel("Password");
        JPasswordField txtpass = new JPasswordField();
        JButton signin = new JButton("SignIn");
        
        username.setBounds(100,200,100,50);
        txtuser.setBounds(200,200,100,50);
        password.setBounds(100,300,100,50);
        txtpass.setBounds(200,300,100,50);
        signin.setBounds(200,400,100,50);
        f.add(username);
        f.add(txtuser);
        f.add(password);
        f.add(txtpass);
        f.add(signin);
        
        
        
    }
  
    public static void main(String[] args) {
        new SwingDemo();
    }
    
}
