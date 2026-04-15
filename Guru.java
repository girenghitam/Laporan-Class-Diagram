// Guru.java
// Turunan dari User
// Asosiasi: Guru berhubungan dengan Siswa dalam pemberian nilai

import java.util.ArrayList;
import java.util.List;

public class Guru extends User {
    // Atribut tambahan Guru
    private String idGuru;          // - private
    private String mataPelajaran;   // - private
    
    // Asosiasi: Guru berhubungan dengan banyak Siswa
    private List<Siswa> daftarSiswa;
    
    // Constructor
    public Guru(String nama, String email, String password, String idGuru, String mataPelajaran) {
        super(nama, email, password);
        this.idGuru = idGuru;
        this.mataPelajaran = mataPelajaran;
        this.daftarSiswa = new ArrayList<>();
    }
    
    // Method: menambah nilai (Asosiasi dengan Siswa)
    public void menambahNilai(Siswa siswa, double nilai) {
        // Cek apakah siswa sudah terdaftar
        if (daftarSiswa.contains(siswa)) {
            siswa.tambahNilai(nilai);
            System.out.println("Guru " + nama + " menambah nilai " + nilai + " untuk " + siswa.getNama());
        } else {
            System.out.println("Siswa " + siswa.getNama() + " tidak terdaftar di kelas ini");
        }
    }
    
    // Method: membuat tugas
    public void membuatTugas(String namaTugas) {
        System.out.println("Guru " + nama + " membuat tugas: " + namaTugas);
        System.out.println("Mata Pelajaran: " + mataPelajaran);
    }
    
    // Method: mengelola nilai siswa
    public void mengelolaNilai() {
        System.out.println("=== Kelola Nilai oleh " + nama + " ===");
        for (Siswa s : daftarSiswa) {
            System.out.println("Siswa: " + s.getNama());
            s.melihatNilai();
        }
    }
    
    // Method untuk menambah siswa ke kelas guru (Asosiasi)
    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
        System.out.println("Siswa " + siswa.getNama() + " ditambahkan ke kelas " + nama);
    }
    
    // Getter
    public String getIdGuru() { return idGuru; }
    public String getMataPelajaran() { return mataPelajaran; }
    public List<Siswa> getDaftarSiswa() { return daftarSiswa; }
}