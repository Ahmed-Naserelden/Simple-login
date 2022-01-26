/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicoolness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author New
 */
public class GUI  implements ActionListener{

   private static JLabel userLabel;
   private static JLabel passwordLabel;
   private static JLabel success;
   private static JButton button;
   private static JTextField userText ;
   private static JPasswordField passwordText ;
       //  setBounds(x, y, w, h);
    public static void main(String[] args) {
        JPanel panel = new JPanel();
         
        JFrame frame = new JFrame();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.setLayout(null);
        userLabel = new JLabel("User");
        userLabel.setBounds(100, 70, 80, 25);
        panel.add(userLabel);
        
        userText  = new JTextField(20);
        userText.setBounds(190, 75, 165, 25);
        panel.add(userText);
        
        passwordLabel= new JLabel("Pasword");
        passwordLabel.setBounds(100, 110, 80, 25);
        panel.add(passwordLabel);
        
        passwordText  = new JPasswordField(20);
        passwordText.setBounds(190, 110, 165, 25);
        panel.add(passwordText);
        
        button = new JButton("Login");
        button.setBounds(235, 180, 80, 25);
        button. addActionListener(new GUI());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(230, 140, 300, 25);
        panel.add(success);     
        
        
        
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user +"  ,  " + password);
        if(user.equals("ahmed")  && password.equals("12345")){
            success.setText("Login Successful!");
        }else{
            success.setText("Login failed!");
        }
    }
    
}
