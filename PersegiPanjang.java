/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihaninheritance;

/**
 *
 * @author acer
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    public void setpanjang(int p) {
    panjang = p;
    }
   public void setlebar(int l){
   lebar =l;
   }
   public int getpanjang() {
   return panjang;
   }
   public int getlebar(){
   return lebar;
   }
   public int luas () {
   int luas = panjang*lebar;
   return luas;
   }
}
