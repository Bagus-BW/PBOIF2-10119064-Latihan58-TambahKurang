/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan58.tambahkurang;

import model.JumlahBilangan;
import model.SelisihBilangan;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk melakukan perhitungan
 * bilangan
 */
public class PBOIF210119064Latihan58TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek JumlahBilangan
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        jumlahBilangan.tampilHasilJumlah();
        
        //inisialisasi objek SelisihBilangan
        SelisihBilangan selisihBilangan = new SelisihBilangan();
        selisihBilangan.tampilSelisih();
    }
    
}
