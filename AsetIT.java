/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.tugas004;

/**
 *
 * @author HP-845
 */
public class AsetIT {
    String idAset;
    String namaPerangkat;
    String lokasi;
    String statusKondisi;

    // b. Parameterized constructor untuk mengisi semua atribut
    public AsetIT(String idAset, String namaPerangkat, String lokasi, String statusKondisi) {
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi;
        this.statusKondisi = statusKondisi;
    }

    // c. Method: tampilkanInfoAset() untuk mencetak data aset ke konsol
    public void tampilkanInfoAset() {
        System.out.println("ID Aset: " + idAset + " | Perangkat: " + namaPerangkat + 
                           " | Lokasi: " + lokasi + " | Kondisi: " + statusKondisi);
    }
}
