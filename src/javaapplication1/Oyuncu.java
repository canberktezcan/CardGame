/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.management.Query.lt;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Canberk
 */
public class Oyuncu extends JFrame  {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;


    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }
    public Oyuncu(){
        
    }
public void skorGoster(){
    System.out.println(this.oyuncuAdi+" isimli oyuncunun skoru: "+this.skor);
    
}

public Kart kartSec  (Kart bkart1, Kart bkart2,Kart bkart3,Kart bkart4,Kart bkart5,Kart bkart6,Kart bkart7,Kart bkart8,String sira,ArrayList<Integer> sayikontrol){
      int a;
   
    if(sira.equals("futbolcu"))
    {
    a=(int)(1+Math.random()*4); 
    while(sayikontrol.contains(a)){
    a=(int)(1+Math.random()*4);
    
    }
      sayikontrol.add(a); 
   }
    else {  
    a=(int)(5+Math.random()*4); 
    while(sayikontrol.contains(a)){
    a=(int)(5+Math.random()*4);
    
   }
    sayikontrol.add(a);
    }
        
        
    
    if(a==1){
        bkart1.kartOrtayaAtildiMi=true;
    return bkart1;
    } 
     else if(a==2){
        bkart2.kartOrtayaAtildiMi=true;
    return bkart2;
    } 
     else if(a==3){
        bkart3.kartOrtayaAtildiMi=true;
    return bkart3;
    } 
     else if(a==4){
        bkart4.kartOrtayaAtildiMi=true;
      return bkart4;  
     } 
        else if(a==5){
        bkart5.kartOrtayaAtildiMi=true;
        return bkart5;
        
        }
     else if(a==6){
        bkart6.kartOrtayaAtildiMi=true;
        return bkart6;
        
        }
     else if(a==7){
        bkart7.kartOrtayaAtildiMi=true;
        return bkart7;
        
        }
     else{
        bkart8.kartOrtayaAtildiMi=true;
        return bkart8;
        
        }
    
    
         
}
public ArrayList<Futbolcu>futbolcukart(Futbolcu[]desteFutbolcu, Basketbolcu[]desteBasketbolcu) {
     int a,b=0;   
     
   
    ArrayList <Futbolcu>futbolcukart=new ArrayList<Futbolcu>();
    for(int i = 0; i<8; i+=2)
        {  
        a=(int)(Math.random()*8);

         
          
        if(desteFutbolcu[a].kartKullanildiMi()){
            i-=2;
           
                   }
        else {
            desteFutbolcu[a].setKullanim(1);
            
        
       futbolcukart.add(desteFutbolcu[a]);
         
          
         
       
           }
          
        }
    return futbolcukart;
    
    
}
public ArrayList<Basketbolcu>basketbolcukart(Futbolcu[]desteFutbolcu, Basketbolcu[]desteBasketbolcu) {
     int a,b=0;   
     
   
    ArrayList <Basketbolcu>basketbolcukart=new ArrayList<Basketbolcu>();
    for(int i = 0; i<8; i+=2)
        {  
        a=(int)(Math.random()*8);

         
          
        if(desteBasketbolcu[a].kartKullanildiMi()){
            i-=2;
           
                   }
        else {
            desteBasketbolcu[a].setKullanim(1);
           basketbolcukart.add(desteBasketbolcu[a]);
        
      
         
          
         
       
           }
          
        }
    return basketbolcukart;
    
    
}
public Sporcu[] kartListesi(ArrayList<Futbolcu>futbolculiste,ArrayList<Basketbolcu>basketbolculiste){
    
    Sporcu[] kullanicilistesi=new Sporcu[8];
    int i,j=0;
    for (i = 0; i <8; i+=2) {
        kullanicilistesi[i]=futbolculiste.get(j);
        kullanicilistesi[i+1]=basketbolculiste.get(j);
        j++;
    }
    for (i = 0;  i< kullanicilistesi.length; i++) {
       
       kullanicilistesi[i].sporcuPuaniGoster(); 
    }
    return kullanicilistesi;
}


//public ArrayList  kartListesi(Futbolcu[]desteFutbolcu, Basketbolcu[]desteBasketbolcu){
////   int wt =100 , lt =150, x = 50, y = 450;
////   ImageIcon kart1resim=new ImageIcon("C:\\Users\\Canberk\\Documents\\NetBeansProjects\\JavaApplication1\\src\\Image\\futbolcu11.png");
////   
////      JButton oyunabasla = new JButton();
////        JButton kartlariDagit = new JButton();
////        kartlariDagit.setBounds(500, 250, 200, 150);
////        kartlariDagit.setText("Kartları Dagıt");
////        jf1.add(kartlariDagit);
////       oyunabasla.setText("OYUNA BASLA");
////       oyunabasla.setBounds(550, 250, 200, 100);
////      jf.add(oyunabasla);
////        
////        JButton kart1 = new JButton();
////        kart1.setIcon(kart1resim);
////        kart1.setBounds(x, y, wt, lt);
////        jf1.add(kart1);     
////        kart1.setVisible(false);
////        
////        JButton kart2 = new JButton();
////        kart2.setBounds(x+150, y, wt, lt);
////        jf1.add(kart2);
////        kart2.setVisible(false);
////        
////        JButton kart3 = new JButton();
////        kart3.setBounds(x+300, y, wt, lt);
////        jf1.add(kart3);
////        kart3.setVisible(false);
////        
////        JButton kart4 = new JButton();
////        kart4.setBounds(x+450, y, wt, lt);
////        jf1.add(kart4);
////        kart4.setVisible(false);
////        
////        JButton kart5 = new JButton();
////        kart5.setBounds(x+600, y, wt, lt);
////        jf1.add(kart5);
////        kart5.setVisible(false);
////        
////        JButton kart6 = new JButton();
////        kart6.setBounds(x+750, y, wt, lt);
////        jf1.add(kart6);
////        kart6.setVisible(false);
////        
////        JButton kart7 = new JButton();
////        kart7.setBounds(x+900, y, wt, lt);
////        jf1.add(kart7);
////        kart7.setVisible(false);
////        
////        JButton kart8 = new JButton();
////        kart8.setBounds(x+1050, y, wt, lt);
////        jf1.add(kart8);
////        kart8.setVisible(false);
////
////        GirisResmi girisresmi = new GirisResmi();
////        OyunResmi oyunresmi = new OyunResmi();
////        jf.add(girisresmi);
////        jf.setTitle("SPORCU KART OYUNU");
////        jf.setSize(1500, 1000);
////
////        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        jf.setVisible(true);
////
////        oyunabasla.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                jf.setVisible(false);
////
////                jf1.add(oyunresmi);
////                jf1.setTitle("OYUN BASLADİ");
////                jf1.setSize(1500,1000);
////                jf1.setVisible(true);
////                kartlariDagit.setVisible(false);  
////                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////               
////
////            }
////        });
////
////        kartlariDagit.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////
////               kartlariDagit.setVisible(false);
////                kart1.setVisible(true);
////                 kart2.setVisible(true);
////                  kart3.setVisible(true);
////                   kart4.setVisible(true);
////                    kart5.setVisible(true);
////                     kart6.setVisible(true);
////                      kart7.setVisible(true);
////                       kart8.setVisible(true);
////                     
////                
////            }
////        });
////        
//        
//     int a,b=0;   
//     
//    //Sporcu[] kullaniciliste=new Sporcu[8];
//    ArrayList kullaniciliste=new ArrayList();
//    for(int i = 0; i<8; i+=2)
//        {  
//        a=(int)(Math.random()*8);
//
//         
//          
//        if(desteFutbolcu[a].kartKullanildiMi()){
//            i-=2;
//           
//                   }
//        else {
//            desteFutbolcu[a].setKullanım(1);
//            
//        
//       kullaniciliste.add(desteFutbolcu[a]);
//          //kullaniciliste[i]=desteFutbolcu[a];
//          kullaniciliste.add(desteBasketbolcu[a]);
//         // kullaniciliste[i+1]=;
//       
//           }
//          
//        }
//     
//    
////    for(int i=0;i<kullaniciliste.length;i++){
////       //kullaniciliste[i].sporcuPuaniGoster();
////      
////          System.out.println("  ");
////       }
//  return kullaniciliste;  
//  
//}



    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

   
    
}