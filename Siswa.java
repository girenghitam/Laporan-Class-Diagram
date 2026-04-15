// Siswa.java
// Turunan dari User
// Pewarisan: mewarisi nama, email, password dari User

import java.util.ArrayList;
import java.util.List;

public class Siswa extends User {
    // Atribut tambahan Siswa
    private String idSiswa;     // - private
    private String kelas;       // - private
    
    // Agregasi: Siswa memiliki banyak nilai (List)
    private List<Double> nilaiList;
    private List<String> tugasList;
    
    // Constructor
    public Siswa(String nama, String email, String password, String idSiswa, String kelas) {
        super(nama, email, password);  // Panggil constructor User
        this.idSiswa = idSiswa;
        this.kelas = kelas;
        this.nilaiList = new ArrayList<>();
        this.tugasList = new ArrayList<>();
    }
    
    // Method: melihat nilai
    public void melihatNilai() {
        System.out.println("=== Nilai " + nama + " (ID: " + idSiswa + ") ===");
        if (nilaiList.isEmpty()) {
            System.out.println("Belum ada nilai");
        } else {
            for (int i = 0; i < nilaiList.size(); i++) {
                System.out.println("Nilai " + (i+1) + ": " + nilaiList.get(i));
            }
        }
    }
    
    // Method: melihat jadwal
    public void melihatJadwal() {
        System.out.println("=== Jadwal Kelas " + kelas + " ===");
        System.out.println("Senin: Matematika, Bahasa Indonesia");
        System.out.println("Selasa: IPA, IPS");
        System.out.println("Rabu: Bahasa Inggris, Olahraga");
        System.out.println("Kamis: Seni, Prakarya");
        System.out.println("Jumat: PAI, Kewarganegaraan");
    }
    
    // Method: mengumpulkan tugas
    public void mengumpulkanTugas(String namaTugas) {
        tugasList.add(namaTugas);
        System.out.println(nama + " mengumpulkan tugas: " + namaTugas);
    }
    
    // Method untuk ditambahkan nilai oleh Guru (package atau public)
    public void tambahNilai(double nilai) {
        nilaiList.add(nilai);
    }
    
    // Getter
    public String getIdSiswa() { return idSiswa; }
    public String getKelas() { return kelas; }
    public List<Double> getNilaiList() { return nilaiList; }
}