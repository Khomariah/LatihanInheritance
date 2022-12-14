/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihaninheritance;

/**
 *
 * @author acer
 */
public class Balok extends PersegiPanjang {
    private int tinggi;
    public void setTinggi(int t){
    tinggi =t;
    }
    public int getTinggi() {
    return tinggi;
    }
    public int volume(){
    int  v =getpanjang()*getlebar()*tinggi;
    return v;
    }
    
    
}
