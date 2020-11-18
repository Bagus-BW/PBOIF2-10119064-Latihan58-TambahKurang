/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk melakukan perhitungan
 * bilangan
 */
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
        int jumlah = super.getX() - super.getY();
        System.out.println("Hasil Selisih " + super.getX() + " - " + super.getY() + " = " + jumlah);
    }
}
