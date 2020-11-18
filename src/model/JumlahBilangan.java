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
public class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah(){
        int jumlah = super.getX() + super.getY();
        System.out.println("Hasil Penjumlahan " + super.getX() + " + " + super.getY() + " = " + jumlah);
    }
}
