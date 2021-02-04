/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Pohon {
    //deklarasi
    String nama;
    int tinggi;
    
    //Scanner
    Scanner input = new Scanner(System.in);
    //input
    void setNama(){
        System.out.print("Masukkan nama pohon   : ");
        nama = input.nextLine();
    }
    void setTinggi(){
        System.out.print("Masukkan tinggi pohon : ");
        tinggi = input.nextInt();
    }
    //output
    void getNama(){
        System.out.println("Nama pohon      : "+nama);
    }
    void getTinggi(){
        System.out.println("Tinggi pohon    : "+tinggi);
    }
}
