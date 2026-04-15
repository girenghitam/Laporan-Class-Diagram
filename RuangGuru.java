// RuangGuru.java
// Agregasi: Ruang Guru "memiliki" Guru (rombus kosong ◇)
// Guru bisa exist tanpa Ruang Guru (bisa pindah ruang)

import java.util.ArrayList;
import java.util.List;

public class RuangGuru {
    // Atribut
    private String namaRuang;       // - private
    private String lokasi;          // - private
    
    // AGREGASI: Ruang Guru memiliki Guru
    private List<Guru> daftarGuru;
    
    // Untuk mengelola input nilai
    private List<String> logNilai;
    
    // Constructor
    public RuangGuru(String namaRuang, String lokasi) {
        this.namaRuang = namaRuang;
        this.lokasi = lokasi;
        this.daftarGuru = new ArrayList<>();
        this.logNilai = new ArrayList<>();
    }
    
    // Method: menambah guru ke ruang
    public void tambahGuru(Guru guru) {
        daftarGuru.add(guru);
        System.out.println("Guru " + guru.getNama() + " masuk ke " + namaRuang);
    }
    
    // Method: mengelola input nilai
    public void inputNilai(Guru guru, Siswa siswa, double nilai) {
        // Catat log
        String log = guru.getNama() + " memberi nilai " + nilai + " kepada " + siswa.getNama();
        logNilai.add(log);
        
        // Guru memberi nilai (Asosiasi Guru-Siswa)
        guru.menambahNilai(siswa, nilai);
        System.out.println("Log tercatat di " + namaRuang + ": " + log);
    }
    
    public void tampilkanLogNilai() {
        System.out.println("=== Log Input Nilai di " + namaRuang + " ===");
        for (String log : logNilai) {
            System.out.println("- " + log);
        }
    }
    
    public void tampilkanGuru() {
        System.out.println("=== Guru di " + namaRuang + " ===");
        for (Guru g : daftarGuru) {
            System.out.println("- " + g.getNama() + " (Mata Pelajaran: " + g.getMataPelajaran() + ")");
        }
    }
    
    // Getter
    public String getNamaRuang() { return namaRuang; }
    public String getLokasi() { return lokasi; }
    public List<Guru> getDaftarGuru() { return daftarGuru; }
}