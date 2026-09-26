/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.tugas004;

/**
 *
 * @author HP-845
 */
public class MainAset {
    public static void main(String[] args) {
        // a. Instansiasi objek ManajemenAset
        ManajemenAset manajemen = new ManajemenAset();

        System.out.println("--- Proses Penambahan Data Aset ---");
        // b. i. Tambahkan minimal 4 data aset IT
        manajemen.tambahAset(new AsetIT("IT-01", "Server", "Ruang Server Utama", "Baik"));
        manajemen.tambahAset(new AsetIT("IT-02", "Router", "Lantai 2", "Baik"));
        manajemen.tambahAset(new AsetIT("IT-03", "Switch", "Lantai 1", "Rusak"));
        manajemen.tambahAset(new AsetIT("IT-04", "PC", "Lab Komputer A", "Baik"));
        System.out.println("4 Data aset berhasil ditambahkan.\n");

        // b. ii. Tampilkan semua aset
        System.out.println("--- Daftar Semua Aset IT (Awal) ---");
        manajemen.tampilkanSemuaAset();

        // b. iii. Hapus salah satu aset menggunakan ID yang valid
        System.out.println("\n--- Proses Penghapusan Data ---");
        manajemen.hapusAset("IT-03"); 
        
        // Contoh tambahan untuk menguji jika ID tidak valid/tidak ditemukan
        // manajemen.hapusAset("IT-99"); 

        // b. iv. Tampilkan kembali semua aset untuk membuktikan penghapusan berhasil
        System.out.println("\n--- Daftar Semua Aset IT (Setelah Dihapus) ---");
        manajemen.tampilkanSemuaAset();
    }
}
