/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Canberk
 */
public class Kullanici extends Oyuncu {
   

    
    public Kullanici(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }
    public Kullanici(){
        
    }
    

    @Override
    public Kart kartSec(Kart bkart1, Kart bkart2, Kart bkart3, Kart bkart4, Kart bkart5, Kart bkart6, Kart bkart7, Kart bkart8, String sira, ArrayList<Integer> sayikontrol) {
        return super.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, sira, sayikontrol);
    }
           
             @Override
    public ArrayList<Basketbolcu> basketbolcukart(Futbolcu[] desteFutbolcu, Basketbolcu[] desteBasketbolcu) {
        return super.basketbolcukart(desteFutbolcu, desteBasketbolcu); 
    }

    @Override
    public Sporcu[] kartListesi(ArrayList<Futbolcu> futbolculiste, ArrayList<Basketbolcu> basketbolculiste) {
        return super.kartListesi(futbolculiste, basketbolculiste); 
    }


    

    @Override
    public ArrayList<Futbolcu> futbolcukart(Futbolcu[] desteFutbolcu, Basketbolcu[] desteBasketbolcu) {
        return super.futbolcukart(desteFutbolcu, desteBasketbolcu); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
    
       
 
    

   

   
    
// Bu arraylisti kendi overrideın içinde yapıp  testte belirtmediğim ilk overrirde
//    @Override
//    public  Sporcu[]kartListesi(Sporcu[]desteFutbolcu, Sporcu[]desteBasketbolcu) {
        
//        int a,b=0,c=0;
//        ArrayList<Integer> numbers= new ArrayList<Integer>();
//    Sporcu[] kullaniciliste=new Sporcu[8];
//    for(int i = 0; i<8; i+=2)
//        {  
//        a=(int)(Math.random()*8);
//
//          //int sayiIndex = binarySearch(sayilar,a);
//          
//        if(numbers.contains(a)){
//            i-=2;
//           
//                   }
//        else {
//          
//           numbers.add(a);
//          kullaniciliste[i]=desteFutbolcu[a];
//          kullaniciliste[i+1]=desteBasketbolcu[a];
//       
//           }
//          
//        }
//     for(int i=0;i<kullaniciliste.length;i++){
//       kullaniciliste[i].sporcuPuaniGoster();
//          System.out.println("  ");
//       }
//  return kullaniciliste;
//    }


// Bu arraylistleri override içinde yani kartlistesi özelliğine parametre olarak gönderirerek numbersı kıyaslama yapmaya çalıştıgım override 
    //Bunun için test sınıdınfa arraylist açıp kullanıcı ve bilgiasayara numbers arraylistini gönderdim ama numbersler kendi meethotlarında işlem gördükleri için
    //İki farklı arrayliste gibi davranıp ona göre işlem yaptılar ve takımları oluşturdular aslında sorunsuz çalışıyor ama  kendi çapında
//    @Override
//    public Sporcu[] kartListesi(Sporcu[] desteFutbolcu, Sporcu[] desteBasketbolcu,ArrayList<Integer>numbers) {
//        //return super.kartListesi(desteFutbolcu, desteBasketbolcu); 
//        int a;
//        //ArrayList<Integer> numbers= new ArrayList<Integer>();
//    Sporcu[] kullaniciliste=new Sporcu[8];
//    for(int i = 0; i<8; i+=2)
//        {  
//        a=(int)(Math.random()*8);
//
//          
//        if(numbers.contains(a)){
//            i-=2;
//           
//                   }
//        else {
//          
//           numbers.add(a);
//          kullaniciliste[i]=desteFutbolcu[a];
//          kullaniciliste[i+1]=desteBasketbolcu[a];
//       
//           }
//          
//        }
//     for(int i=0;i<kullaniciliste.length;i++){
//       kullaniciliste[i].sporcuPuaniGoster();
//          System.out.println("  ");
//       }
//  return kullaniciliste;
    
//    }
//    Sporcu[] kullaniciliste=new Sporcu[8];
//    for(int i = 0; i<8; i+=2)
//        {  
//        a=(int)(Math.random()*8);
//
//          
//        if(numbers.contains(a)){
//            i-=2;
//           
//                   }
//        else {
//          
//           numbers.add(a);
//          kullaniciliste[i]=desteFutbolcu[a];
//          kullaniciliste[i+1]=desteBasketbolcu[a];
//       
//           }
//          
//        }
//     for(int i=0;i<kullaniciliste.length;i++){
//       kullaniciliste[i].sporcuPuaniGoster();
//          System.out.println("  ");
//       }
//  return kullaniciliste;

//    @Override
//    public ArrayList kartListesi(Futbolcu[] desteFutbolcu, Basketbolcu[] desteBasketbolcu) {
//        return super.kartListesi(desteFutbolcu, desteBasketbolcu); 
//    }

   