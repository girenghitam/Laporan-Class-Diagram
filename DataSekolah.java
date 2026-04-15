// DataSekolah.java
// Agregasi: Data Sekolah "memiliki" data sistem (rombus kosong ◇)
// Semua data bisa exist tanpa DataSekolah (pusat data saja)

import java.util.ArrayList;
import java.util.List;

public class DataSekolah {
    // Atribut
    private String namaSekolah;     // - private
    private String alamat;          // - private
    
    // AGREGASI: Data Sekolah memiliki semua data
    private List<Siswa> daftarSiswa;
    private List<Guru> daftarGuru;
    private List<Kelas> daftarKelas;
    private List<Admin> daftarAdmin;
    private List<Double> daftarNilai;
    
    // Constructor
    public DataSekolah(String namaSekolah, String alamat) {
        this.namaSekolah = namaSekolah;
        this.alamat = alamat;
        this.daftarSiswa = new ArrayList<>();
        this.daftarGuru = new ArrayList<>();
        this.daftarKelas = new ArrayList<>();
        this.daftarAdmin = new ArrayList<>();
        this.daftarNilai = new ArrayList<>();
    }
    
    // Method: menambah data
    public void tambahSiswa(Siswa s) {
        daftarSiswa.add(s);
        System.out.println("Siswa " + s.getNama() + " didaftarkan ke sistem sekolah");
    }
    
    public void tambahGuru(Guru g) {
        daftarGuru.add(g);
        System.out.println("Guru " + g.getNama() + " didaftarkan ke sistem sekolah");
    }
    
    public void tambahKelas(Kelas k) {
        daftarKelas.add(k);
        System.out.println("Kelas " + k.getNamaKelas() + " didaftarkan ke sistem sekolah");
    }
    
    public void tambahAdmin(Admin a) {
        daftarAdmin.add(a);
        System.out.println("Admin " + a.getNama() + " didaftarkan ke sistem sekolah");
    }
    
    // Method: mengelola nilai
    public void catatNilai(double nilai) {
        daftarNilai.add(nilai);
    }
    
    // Method: tampilkan ringkasan
    public void tampilkanRingkasan() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║      DATA SEKOLAH " + namaSekolah.toUpperCase() + "       ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Alamat: " + alamat);
        System.out.println("║ Total Siswa: " + daftarSiswa.size());
        System.out.println("║ Total Guru: " + daftarGuru.size());
        System.out.println("║ Total Kelas: " + daftarKelas.size());
        System.out.println("║ Total Admin: " + daftarAdmin.size());
        System.out.println("║ Total Nilai Tercatat: " + daftarNilai.size());
        System.out.println("╚════════════════════════════════════╝");
    }
    
    // Getter
    public String getNamaSekolah() { return namaSekolah; }
    public List<Siswa> getDaftarSiswa() { return daftarSiswa; }
    public List<Guru> getDaftarGuru() { return daftarGuru; }
    public List<Kelas> getDaftarKelas() { return daftarKelas; }
}