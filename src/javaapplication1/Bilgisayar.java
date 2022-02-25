/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Canberk
 */
public class Bilgisayar extends Oyuncu {
    
    public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
        
    }
    public Bilgisayar(){
        
    }

   

 
  //return super.kartSec(kart1, kart2, kart3, kart4, kart5, kart6, kart7, kart8); //To change body of generated methods, choose Tools | Templates.

//    @Override
//    public int kartSec() {
//        return super.kartSec(); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public Kart kartSec(Kart bkart1, Kart bkart2, Kart bkart3, Kart bkart4, Kart bkart5, Kart bkart6, Kart bkart7, Kart bkart8, String sira, ArrayList<Integer> sayikontrol) {
        return super.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, sira, sayikontrol); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   

   

    

//    public Sporcu[] kartListesi(Sporcu[] desteFutbolcu, Sporcu[] desteBasketbolcu,ArrayList<Integer>numbers) {
//       int b=0;
//    Sporcu[] bilgisayarliste=new Sporcu[8]; 
//       for(int i=0;i<8;i+=2){
//           if(numbers.contains(b)){
//              b++;
//              i-=2;
//                  }
//           else{
//               b++;
//             bilgisayarliste[i]=desteFutbolcu[b];
//          bilgisayarliste[i+1]=desteBasketbolcu[b];
//           
//           }
//       
//       }
//       for(int i=0;i<bilgisayarliste.length;i++){
//       bilgisayarliste[i].sporcuPuaniGoster();
//           System.out.println("  ");
//       }
//       return bilgisayarliste;
//    }

//    @Override
//    public ArrayList kartListesi(Futbolcu[] desteFutbolcu, Basketbolcu[] desteBasketbolcu ) {
//        return super.kartListesi(desteFutbolcu, desteBasketbolcu);
//    }

    @Override
    public ArrayList<Futbolcu> futbolcukart(Futbolcu[] desteFutbolcu, Basketbolcu[] desteBasketbolcu) {
        return super.futbolcukart(desteFutbolcu, desteBasketbolcu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Basketbolcu> basketbolcukart(Futbolcu[] desteFutbolcu, Basketbolcu[] desteBasketbolcu) {
        return super.basketbolcukart(desteFutbolcu, desteBasketbolcu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sporcu[] kartListesi(ArrayList<Futbolcu> futbolculiste, ArrayList<Basketbolcu> basketbolculiste) {
        return super.kartListesi(futbolculiste, basketbolculiste); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
