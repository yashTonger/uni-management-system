
package sample.project;
import javax.swing.*;
import java.awt.*;

public class SampleProject extends JFrame implements Runnable {

      Thread t;
    SampleProject()
    { 
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icon/vibe pic.png"));
        Image i3 = i.getImage().getScaledInstance(960, 540,Image.SCALE_DEFAULT );
        ImageIcon i2= new ImageIcon(i3);
        JLabel i1= new JLabel(i2);
        add(i1);
        t=new Thread(this);
        t.start();
        
        setVisible(true); 
                //setSize(960,540);
                setLocation(300,150);
        for(int j=0;j<200;j++)
        {
       
        setSize(760+j,340+j);
        try{
            Thread.sleep(20);
        }catch (Exception e){}
    }
      //  setVisible(true); 
    }
    public void run()
    {
        try{
            Thread.sleep(7000);
           // setVisible(false);
            new logInPage();
            setVisible(false);
        }catch(Exception e){}
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new SampleProject();
    }
    
}
