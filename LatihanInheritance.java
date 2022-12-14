/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihaninheritance;

/**
 *
 * @author acer
 */
public class LatihanInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang a= new PersegiPanjang();
        a.setpanjang(6);
        a.setlebar(5);
        System.out.println("");
        System.out.println("Contoh program pewarisan");
        System.out.println("");
        System.out.println("Superclass persegipanjang");
        System.out.println("panjang : "+a.getpanjang());
        System.out.println("lebar :"+a.getlebar());
        System.out.println("luas:"+a.luas());
        System.out.println("");
        Balok b =new Balok();
        
        b.setpanjang(4);
        b.setlebar(3);
        b.setTinggi(5);
        System.out.println("Subclass Balok");
        System.out.println("panjang :"+ b.getpanjang());
        System.out.println("lebar:"+ b.getlebar());
        System.out.println("Tinggi:"+ b.getTinggi());
        System.out.println("Volume:"+ b.volume());
        
        
        
        
        
        
        
    }
    
}
