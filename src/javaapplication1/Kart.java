/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Canberk
 */

public class Kart extends JButton{
    String isim;
     int penalti;
     int serbestAtis;
     int kaleciKarsiKarsiya;
     int ikilik;
    int ucluk;
     int serbestVurus;
     int x,y;
     ImageIcon acikresim=new ImageIcon();
     ImageIcon kapaliresim=new ImageIcon();
    boolean kartOrtayaAtildiMi;
     public Kart (String isim,int penalti,int serbestVurus,int kaleciKarsiKarsiya,ImageIcon acikresim,ImageIcon kapaliresim,boolean kartOrtayaAtildiMi,int x,int y){
    this.isim=isim;
    this.penalti=penalti;
    this.serbestVurus=serbestVurus;
    this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
    this.acikresim=acikresim;
    this.x=x;
    this.y=y;
    this.kartOrtayaAtildiMi = kartOrtayaAtildiMi;
    this.kapaliresim=kapaliresim;

           
}
     public  Kart(int ikilik,int ucluk,int serbestAtis,String isim,ImageIcon acikresim,ImageIcon kapaliresim,boolean kartOrtayaAtildiMi,int x,int y){
         this.serbestAtis=serbestAtis;
         this.ikilik=ikilik; 
         this. ucluk=ucluk;
         this.kartOrtayaAtildiMi=kartOrtayaAtildiMi;
         this.isim=isim;
         this.acikresim=acikresim;
         this.kapaliresim=kapaliresim;
         this.x=x;
         this.y=y;
     }

   public boolean isKartOrtayaAtildiMi() {
        return this.kartOrtayaAtildiMi;
    }

    
}
