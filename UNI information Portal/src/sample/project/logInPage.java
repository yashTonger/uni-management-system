
package sample.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class logInPage extends JFrame implements ActionListener{
    
     JButton cancel,log;
     JPasswordField passIn;
     JTextField nameIn;
     
    logInPage(){
        
//        ImageIcon im= new ImageIcon(ClassLoader.getSystemResource("icon/wp6006336.jpeg"));
//        JLabel ima = new JLabel(im);
//        ima.setBounds(0, 0, 600, 300);
//        add(ima);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ///name
        JLabel name = new JLabel("Username:");
        name.setFont(new Font("serif",Font.BOLD,15));
        name.setBounds(40, 40, 100, 20);
       name.setForeground(Color.WHITE);
        add(name);
        
        nameIn = new JTextField();
        nameIn.setBounds(150,40,150,20);
        add(nameIn);
        
        //passward
        
         JLabel pass = new JLabel("Passward:");
        pass.setBounds(40, 70, 100, 20);
        pass.setFont(new Font("serif",Font.BOLD,17));
        pass.setForeground(Color.WHITE);
        add(pass);
        
         passIn = new JPasswordField();
        passIn.setBounds(150,70,150,20);
        add(passIn);
        
        
        //buttons
        
         log= new JButton("LOGIN");
        log.setBounds(60, 100, 150, 30);
        log.setFont(new Font("Tahoma",Font.BOLD,17));
        log.addActionListener(this);
        add(log);
        log.setBackground(Color.GRAY);
        log.setForeground(Color.BLACK);
        
        
        //button 2
        
        
        cancel= new JButton("CANCEL");
        cancel.setBounds(250, 100, 150, 30);
        cancel.setFont(new Font("Tahoma",Font.BOLD,17));
        cancel.addActionListener(this);
        add(cancel);
        cancel.setBackground(Color.GRAY);
        cancel.setForeground(Color.BLACK);
        
        
        //background
        ImageIcon im= new ImageIcon(ClassLoader.getSystemResource("icon/wp6006336.jpeg"));
        JLabel ima = new JLabel(im);
        ima.setBounds(0, 0, 600, 300);
        add(ima);
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
    
    ///action
    
           
            
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==cancel) {
            setVisible(false);
        }
        else if(ae.getSource()==log){
            
            String username=nameIn.getText();
            String password=passIn.getText();        
            
            String query="select * from login where username='"+username+"' and password='"+password+"'";
            try{
                connect c1= new connect();
               ResultSet rs=  c1.s.executeQuery(query);
               
               if(rs.next()){
                   setVisible(false);
                   new mainMenu();
               }else{
                   JOptionPane.showMessageDialog(null,"Invalid username or password");
                  // setVisible(false);
               }
               
            }catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
    
    public static void main(String[] args){
        new logInPage();
    }
}
