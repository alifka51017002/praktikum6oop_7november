/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak3;


/**
 *
 * @author User
 */

import javax.swing.*;
import java.awt.event.*;
public abstract class Prak3 implements  ActionListener{

    /**
     * @param args the command line arguments
     */
    private static void  createAndShowGUI(){
        // make frame..
        JFrame frame = new JFrame ("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        //make a button
        JButton butt=new JButton("Click me");
        frame.getContentPane().setLayout(null);
        
        // instantiate an application object
        prak3 app = new prak3() {};
        //make the label
        app.label = new JLabel("nama tidak terdeteksi");
          app.label.setBounds(20,40,  200,20);
          frame.getContentPane().add(app.label);
          // set the application object to be the thing which
          //listens to the button
          butt.addActionListener(app);
          frame.setVisible(true);       
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //ini akan dieksekusi ketika button diklik
        label.setText("my name is alif");
        //clickCount++;
    }
    
    
    
  
   public static void main(String[] args) {
        // memulai swing GUI
        SwingUtilites.invokeLater(new Runnable() {
            
        public void run() {
            createAndShowGUI();
            
        }
    
        });
   }
   
// application object fields
   //int clickCount=0;
   JLabel label;
}
   



   