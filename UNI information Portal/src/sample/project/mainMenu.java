/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample.project;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author abhinavsingh
 */
public class mainMenu extends JFrame{
    
    mainMenu(){
        
        setSize(1440,900);
       // setLocation(30,30);
        
        //background
         ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icon/vibe pic.png"));
        Image i3 = i.getImage().getScaledInstance(1440,800,Image.SCALE_DEFAULT );
        ImageIcon i2= new ImageIcon(i3);
        JLabel i1= new JLabel(i2);
        add(i1);
        
    
        
        
        //menu baar
        JMenuBar mb=new JMenuBar();
        

             //ADD INFO
            JMenu addInfo= new JMenu("Add Info");
            mb.add(addInfo);
                    JMenuItem addStudent= new JMenuItem("Add new Student");
                    addInfo.add(addStudent);
                    JMenuItem addFaculty= new JMenuItem("Add new Faculty");
                    addInfo.add(addFaculty);

            setJMenuBar(mb);
            
            //view info
            JMenu viewInfo= new JMenu("View Info");
            mb.add(viewInfo);
                JMenuItem viewStudent= new JMenuItem("view Student");
                viewInfo.add(viewStudent);
                JMenuItem viewFaculty= new JMenuItem("view Faculty");
                viewInfo.add(viewFaculty);
        
            setJMenuBar(mb);
        
        
            setVisible(true);
    }
    public static void main(String[] args){
      new  mainMenu();
    }
}
