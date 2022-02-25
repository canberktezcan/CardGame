/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.ArrayList;

/**
 *
 * @author Canberk
 */

public class Main{
    
    
    public static void main(String[] args) {
      ArrayList<Integer> sayi=new ArrayList<>();
        sayi.add(1);
        sayi.add(2);
        sayi.add(4);
        sayi.add(5);
         int a=(int)(1+Math.random()*3);
         if(a==1){
             sayi.remove(sayi.size()-1);
         }
         else if(a==2){
              sayi.remove(sayi.size()-1);
         }
         else {
             System.out.println(sayi);
              
         }
         System.out.println(sayi);
       // if(sayi.contains(3))System.out.println("3");
        // else System.out.println("yok");
    }
    
    
}
