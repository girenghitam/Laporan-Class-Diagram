// Main.java
// Class untuk menjalankan dan testing sistem

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║    SISTEM SEKOLAH BYBY & JOJO 📚      ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        
        // ============================================================
        // 1. BUAT DATA SEKOLAH (Agregasi - pusat data)
        // ============================================================
        System.out.println("=== 1. INISIALISASI DATA SEKOLAH ===");
        DataSekolah sekolah = new DataSekolah("SMA Negeri 1", "Jl. Pendidikan No. 1");
        
        // ============================================================
        // 2. BUAT USER (Pewarisan: User → Siswa, Guru, Admin)
        // ============================================================
        System.out.println("\n=== 2. MEMBUAT USER (Pewarisan) ===");
        
        // Siswa (Pewarisan dari User)
        Siswa jojo = new Siswa("Jojo", "jojo@email.com", "password123", "S001", "XII-A");
        Siswa budi = new Siswa("Budi", "budi@email.com", "pass456", "S002", "XII-A");
        
        // Guru (Pewarisan dari User)
        Guru pakAgus = new Guru("Pak Agus", "agus@email.com", "guruku", "G001", "Matematika");
        Guru buDewi = new Guru("Bu Dewi", "dewi@email.com", "guruku2", "G002", "Bahasa Indonesia");
        
        // Admin (Pewarisan dari User)
        Admin adminUtama = new Admin("Admin Utama", "admin@sekolah.com", "admin123", "A001");
        
        // Daftarkan ke sekolah
        sekolah.tambahSiswa(jojo);
        sekolah.tambahSiswa(budi);
        sekolah.tambahGuru(pakAgus);
        sekolah.tambahGuru(buDewi);
        sekolah.tambahAdmin(adminUtama);
        
        // ============================================================
        // 3. TAMPILKAN INFO USER (Method dari User)
        // ============================================================
        System.out.println("\n=== 3. INFO USER (Method dari Superclass) ===");
        jojo.tampilInfo();  // Dari User
        System.out.println();
        pakAgus.tampilInfo();  // Dari User
        
        // ============================================================
        // 4. AGREGASI: KELAS MEMILIKI SISWA
        // ============================================================
        System.out.println("\n=== 4. AGREGASI: Kelas ◇—— Siswa ===");
        Kelas kelas12A = new Kelas("XII-A", "Senin-Jumat 07:00-15:00");
        sekolah.tambahKelas(kelas12A);
        
        // Siswa masuk ke kelas (Agregasi: Siswa bisa exist tanpa Kelas)
        kelas12A.tambahSiswa(jojo);
        kelas12A.tambahSiswa(budi);
        kelas12A.tampilkanSiswa();
        
        // ============================================================
        // 5. AGREGASI: RUANG GURU MEMILIKI GURU
        // ============================================================
        System.out.println("\n=== 5. AGREGASI: RuangGuru ◇—— Guru ===");
        RuangGuru ruangGuru1 = new RuangGuru("Ruang Guru Lantai 2", "Gedung Utara");
        
        // Guru masuk ke ruang (Agregasi: Guru bisa exist tanpa RuangGuru)
        ruangGuru1.tambahGuru(pakAgus);
        ruangGuru1.tambahGuru(buDewi);
        ruangGuru1.tampilkanGuru();
        
        // ============================================================
        // 6. ASOSIASI: GURU BERHUBUNGAN DENGAN SISWA (Pemberian Nilai)
        // ============================================================
        System.out.println("\n=== 6. ASOSIASI: Guru —— Siswa (Pemberian Nilai) ===");
        
        // Guru menambah siswa ke kelasnya (membangun asosiasi)
        pakAgus.tambahSiswa(jojo);
        pakAgus.tambahSiswa(budi);
        buDewi.tambahSiswa(jojo);
        
        // Guru memberi nilai ke Siswa (Asosiasi)
        System.out.println("\n--- Pak Agus memberi nilai ---");
        pakAgus.menambahNilai(jojo, 85.5);
        pakAgus.menambahNilai(budi, 78.0);
        
        System.out.println("\n--- Bu Dewi memberi nilai ---");
        buDewi.menambahNilai(jojo, 90.0);
        
        // Siswa melihat nilai
        System.out.println("\n--- Jojo melihat nilainya ---");
        jojo.melihatNilai();
        
        System.out.println("\n--- Budi melihat nilainya ---");
        budi.melihatNilai();
        
        // ============================================================
        // 7. SISWA MENGGUNAKAN METHOD SENDIRI
        // ============================================================
        System.out.println("\n=== 7. METHOD KHUSUS SISWA ===");
        jojo.melihatJadwal();
        jojo.mengumpulkanTugas("Tugas Matematika Hal 25");
        jojo.mengumpulkanTugas("Tugas B. Indonesia Esai");
        
        // ============================================================
        // 8. GURU MENGGUNAKAN METHOD SENDIRI
        // ============================================================
        System.out.println("\n=== 8. METHOD KHUSUS GURU ===");
        pakAgus.membuatTugas("Ulangan Harian Matematika");
        pakAgus.mengelolaNilai();
        
        // ============================================================
        // 9. ADMIN MENGELOLA SISTEM
        // ============================================================
        System.out.println("\n=== 9. METHOD KHUSUS ADMIN ===");
        adminUtama.mengelolaKelas(kelas12A, "XII-Alpha");
        adminUtama.mengelolaSiswa(jojo, "edit");
        adminUtama.mengelolaGuru(pakAgus, "review");
        adminUtama.mengelolaDataSekolah(sekolah);
        
        // ============================================================
        // 10. RUANG GURU MENGELOLA INPUT NILAI
        // ============================================================
        System.out.println("\n=== 10. RUANG GURU MENGELOLA NILAI ===");
        ruangGuru1.inputNilai(pakAgus, jojo, 88.0);
        ruangGuru1.inputNilai(buDewi, budi, 82.5);
        ruangGuru1.tampilkanLogNilai();
        
        // ============================================================
        // 11. RINGKASAN AKHIR
        // ============================================================
        System.out.println("\n=== 11. RINGKASAN DATA SEKOLAH ===");
        sekolah.tampilkanRingkasan();
        
        // ============================================================
        // 12. DEMONSTRASI ACCESS MODIFIER
        // ============================================================
        System.out.println("\n=== 12. DEMONSTRASI ACCESS MODIFIER ===");
        System.out.println("Public (+): jojo.getNama() = " + jojo.getNama());  // Bisa diakses
        System.out.println("Public (+): jojo.getEmail() = " + jojo.getEmail()); // Bisa diakses
        
        // System.out.println(jojo.password);  // ERROR! Private (-) tidak bisa diakses dari luar
        // System.out.println(jojo.nama);    // ERROR! Protected (#) tidak bisa diakses dari package lain
        
        System.out.println("Private (-) password: Hanya bisa diakses via getter getPassword()");
        System.out.println("Protected (#) nama: Hanya bisa diakses oleh subclass (Siswa, Guru, Admin)");
        
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║         SELESAI! 🎉                  ║");
        System.out.println("║    Semua relasi berhasil diuji!     ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}