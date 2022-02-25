/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.ImageIcon;

/**
 *
 * @author Canberk
 */
public class Futbolcu extends Sporcu {
    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    private boolean kullanim;
    private boolean kartOrtayaAtildiMi;
   
    public Futbolcu(String sporcuIsim, String sporcuTakim,ImageIcon acikresim,ImageIcon kapaliresim,int penalti, int serbestAtis, int kaleciKarsiKarsiya ) {
     super(sporcuIsim, sporcuTakim,acikresim,kapaliresim);
     this.penalti=penalti;
     this.serbestAtis=serbestAtis;
     this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
    }
    public Futbolcu(){
            
    }
    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster(); 
        System.out.println("penaltı vuruş: "+this.penalti);
        System.out.println("serbest atış: "+this.serbestAtis);
        System.out.println("kaleci ile karşı karşıya: "+this.kaleciKarsiKarsiya);
    }

    public boolean isKartOrtayaAtildiMi() {
        return kartOrtayaAtildiMi;
    }

    public void setKartOrtayaAtildiMi(boolean kartOrtayaAtildiMi) {
        this.kartOrtayaAtildiMi = kartOrtayaAtildiMi;
    }
    
   
    public int getPenalti() {
        return this.penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return this.serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return this.kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
    public void setKullanim(int kullanım){
        this.kullanim=true;
    }
   
    public boolean kartKullanildiMi(){
        return this.kullanim;
    }   

    
}
