/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

/**
 *
 * @author WINDOWS 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek baru
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
        //memanggil;
        cemara.setNama();
        cemara.setTinggi();
        
        kelapa.setNama();
        kelapa.setTinggi();
        System.out.println("\n====================\n");
        cemara.getNama();
        cemara.getTinggi();
        
        kelapa.getNama();
        kelapa.getTinggi();
        
    }
    
}
