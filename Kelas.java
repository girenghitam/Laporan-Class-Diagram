// Kelas.java
// Agregasi: Kelas "memiliki" Siswa (rombus kosong ◇)
// Siswa bisa exist tanpa Kelas (bisa pindah kelas)

import java.util.ArrayList;
import java.util.List;

public class Kelas {
    // Atribut
    private String namaKelas;           // - private
    private String jadwalPelajaran;     // - private
    
    // AGREGASI: Kelas memiliki banyak Siswa
    // Siswa bisa ada sebelum masuk kelas, bisa pindah kelas
    private List<Siswa> daftarSiswa;
    
    // Constructor
    public Kelas(String namaKelas, String jadwalPelajaran) {
        this.namaKelas = namaKelas;
        this.jadwalPelajaran = jadwalPelajaran;
        this.daftarSiswa = new ArrayList<>();
    }
    
    // Method: mengelola siswa dalam kelas
    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
        System.out.println("Siswa " + siswa.getNama() + " masuk ke kelas " + namaKelas);
    }
    
    public void hapusSiswa(Siswa siswa) {
        daftarSiswa.remove(siswa);
        System.out.println("Siswa " + siswa.getNama() + " keluar dari kelas " + namaKelas);
    }
    
    public void tampilkanSiswa() {
        System.out.println("=== Daftar Siswa Kelas " + namaKelas + " ===");
        for (Siswa s : daftarSiswa) {
            System.out.println("- " + s.getNama() + " (ID: " + s.getIdSiswa() + ")");
        }
    }
    
    // Getter dan Setter
    public String getNamaKelas() { return namaKelas; }
    public void setNamaKelas(String namaKelas) { this.namaKelas = namaKelas; }
    public String getJadwalPelajaran() { return jadwalPelajaran; }
    public List<Siswa> getDaftarSiswa() { return daftarSiswa; }
}