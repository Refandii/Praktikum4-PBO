<H1 align="center"> LAPORAN PRAKTIKUM PEMROGAMAN BERORIENTASI OBJEK </H1>
<H1 align="center"> Laporan Praktikum 004: Sistem Manajemen Aset IT </H1>

<br>

<p align="center">
  <img width="500" height="500" alt="UNS No  Bckg" src="https://github.com/user-attachments/assets/58f18451-ea1e-40e7-af70-23081dc27263" />
</p>

<br>

<div>
  <p align="center">
    <b>Disusun oleh:</b><br>
    Nama: Re'fandi Indra Maulana<br>
    NIM: L0325011</p><br>
</div>

<div>
  <p align="center">
    <b>Asisten Praktikum:</b><br>
    AZFA RAHMA PUTRA SUSANTO<br>
    INDRA FATA AZHARI<br>
</div>

---

Program Java untuk mengelola daftar aset IT (seperti server, router, PC, dll) menggunakan `LinkedList`. Program ini mencakup fungsi dasar seperti menambah data, menampilkan seluruh data, dan menghapus data berdasarkan ID Aset.

---

## Tujuan Praktikum
- Memahami pembuatan dan penggunaan kelas objek (Enkapsulasi dan Konstruktor).
- Mampu menggunakan struktur data ArrayList dalam Java untuk menyimpan sekumpulan objek secara dinamis.
- Mampu mengimplementasikan perulangan For-Each untuk membaca dan menampilkan data dari dalam koleksi.
- Mampu menggunakan Iterator untuk memanipulasi (menghapus) elemen tertentu di dalam list dengan aman guna menghindari ConcurrentModificationException.

---

## Fitur
- **Tambah Aset**: Menambahkan data aset baru ke dalam daftar.
- **Tampilkan Data**: Menampilkan seluruh data aset yang tersimpan beserta detailnya.
- **Hapus Aset**: Menghapus data aset spesifik menggunakan ID Aset (memanfaatkan `Iterator` agar aman saat iterasi).

---

## Struktur Proyek

Proyek ini terdiri dari tiga file utama:<br>
**1. AsetIT.java**<br>
Merupakan kelas blueprint (model) yang merepresentasikan data aset. Memiliki atribut idAset, namaPerangkat, lokasi, dan statusKondisi, dilengkapi dengan sebuah constructor dan method tampilkanInfoAset() untuk mencetak detail ke konsol.<br>

**2. ManajemenAset.java**<br>
Berfungsi sebagai pengelola koleksi data. Menggunakan ArrayList<AsetIT> untuk menyimpan data. Memiliki method:<br>
- tambahAset(): Menambahkan objek aset baru ke dalam list.<br>
- tampilkanSemuaAset(): Menampilkan semua data menggunakan perulangan For-Each.<br>
- hapusAset(): Menghapus data berdasarkan idAset secara aman menggunakan antarmuka Iterator.<br>

**3. MainAset.java**<br>
Merupakan driver class yang berisi method main. Kelas ini bertugas mensimulasikan penambahan 4 data aset, menampilkan daftar aset awal, menghapus salah satu data (ID "IT-03"), dan menampilkan kembali daftar aset untuk memvalidasi proses penghapusan.<br>

---

## Cara Menjalankan<br>
1. Pastikan Java Development Kit (JDK) sudah terinstal di komputer Anda.<br>
2. Clone repositori ini ke komputer lokal Anda.<br>
3. Buka proyek melalui IDE Java (seperti NetBeans, IntelliJ IDEA, atau Eclipse).<br>
4. Jalankan (Run) file MainAset.java.<br>

---

## Output Program
```--- Proses Penambahan Data Aset ---
4 Data aset berhasil ditambahkan.

--- Daftar Semua Aset IT (Awal) ---
ID Aset: IT-01 | Perangkat: Server | Lokasi: Ruang Server Utama | Kondisi: Baik
ID Aset: IT-02 | Perangkat: Router | Lokasi: Lantai 2 | Kondisi: Baik
ID Aset: IT-03 | Perangkat: Switch | Lokasi: Lantai 1 | Kondisi: Rusak
ID Aset: IT-04 | Perangkat: PC | Lokasi: Lab Komputer A | Kondisi: Baik

--- Proses Penghapusan Data ---
Aset dengan ID IT-03 berhasil dihapus.

--- Daftar Semua Aset IT (Setelah Dihapus) ---
ID Aset: IT-01 | Perangkat: Server | Lokasi: Ruang Server Utama | Kondisi: Baik
ID Aset: IT-02 | Perangkat: Router | Lokasi: Lantai 2 | Kondisi: Baik
ID Aset: IT-04 | Perangkat: PC | Lokasi: Lab Komputer A | Kondisi: Baik
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  4.144 s
Finished at: 2026-09-26T14:20:05+07:00
------------------------------------------------------------------------

```


