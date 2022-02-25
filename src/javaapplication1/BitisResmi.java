/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Canberk
 */
public class BitisResmi extends JPanel {
    protected void paintComponent(Graphics g)
   {
   super.paintComponent(g);
   Image arkaplan=new ImageIcon("C:\\Users\\Canberk\\Documents\\NetBeansProjects\\JavaApplication1\\src\\Image\\WhatsApp Image 2020-12-06 at 21.00.00.jpeg").getImage();
   g.drawImage(arkaplan, 0, 0, 1500, 1000, null);
   


   }
}
    