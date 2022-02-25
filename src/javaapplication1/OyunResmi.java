/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.paintComponent;
public class OyunResmi extends JPanel {
   @Override
   protected void paintComponent(Graphics g)
   {
   super.paintComponent(g);
   Image arkaplan=new ImageIcon("C:\\Users\\Canberk\\Documents\\NetBeansProjects\\JavaApplication1\\src\\Image\\WhatsApp Image 2020-12-06 at 20.04.25 (1).jpeg").getImage();
   //g.drawImage(arkaplan,0,0, null);
   g.drawImage(arkaplan, 0, 0, 1500, 1000, null);
     


   } 
}