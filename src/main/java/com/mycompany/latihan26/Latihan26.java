/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program untuk Menampilkan waktu saat ini termasuk hari ini
 */
public class Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dapatkan waktu saat ini
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        Locale locale = new Locale("id", "ID");
        
        // format waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", locale);
        
        // Tampilkan waktu
        System.out.println("Hari ini adalah hari : " + formatter.format(waktuSaatIni));
        
    }
    
}
