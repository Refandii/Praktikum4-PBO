/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.tugas004;

/**
 *
 * @author HP-845
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManajemenAset {
    // a. Sebuah ArrayList<AsetIT> bernama daftarAset
    List<AsetIT> daftarAset;

    public ManajemenAset() {
        daftarAset = new ArrayList<>();
    }

    // b. Method tambahAset(AsetIT asetbaru)
    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
    }

    // c. Method tampilkanSemuaAset() menggunakan For-Each
    public void tampilkanSemuaAset() {
        if (daftarAset.isEmpty()) {
            System.out.println("Tidak ada data aset.");
            return;
        }
        
        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }

    // d. Method hapusAset(String idAset) menggunakan Iterator
    public void hapusAset(String idAset) {
        Iterator<AsetIT> it = daftarAset.iterator();
        boolean ditemukan = false;
        
        while (it.hasNext()) {
            AsetIT asetSekarang = it.next();
            // Mengecek apakah ID aset saat ini sama dengan ID yang dicari
            if (asetSekarang.idAset.equals(idAset)) {
                it.remove(); // Menghapus menggunakan iterator
                ditemukan = true;
                System.out.println("Aset dengan ID " + idAset + " berhasil dihapus.");
                break; // Keluar dari perulangan karena data sudah ditemukan dan dihapus
            }
        }
        
        // Jika ID tidak ditemukan, tampilkan pesan peringatan
        if (!ditemukan) {
            System.out.println("Peringatan: Aset dengan ID " + idAset + " tidak ditemukan!");
        }
    }
}
