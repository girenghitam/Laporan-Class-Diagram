// Admin.java
// Turunan dari User
// Bertanggung jawab mengelola sistem

public class Admin extends User {
    // Atribut tambahan Admin
    private String idAdmin;   // - private
    
    // Constructor
    public Admin(String nama, String email, String password, String idAdmin) {
        super(nama, email, password);
        this.idAdmin = idAdmin;
    }
    
    // Method: mengelola kelas
    public void mengelolaKelas(Kelas kelas, String namaKelasBaru) {
        System.out.println("Admin " + nama + " mengubah nama kelas menjadi: " + namaKelasBaru);
        kelas.setNamaKelas(namaKelasBaru);
    }
    
    // Method: mengelola siswa
    public void mengelolaSiswa(Siswa siswa, String operasi) {
        switch (operasi.toLowerCase()) {
            case "tambah":
                System.out.println("Admin " + nama + " menambahkan siswa: " + siswa.getNama());
                break;
            case "hapus":
                System.out.println("Admin " + nama + " menghapus siswa: " + siswa.getNama());
                break;
            case "edit":
                System.out.println("Admin " + nama + " mengedit data siswa: " + siswa.getNama());
                break;
            default:
                System.out.println("Operasi tidak dikenal");
        }
    }
    
    // Method: mengelola guru
    public void mengelolaGuru(Guru guru, String operasi) {
        System.out.println("Admin " + nama + " melakukan " + operasi + " pada guru: " + guru.getNama());
    }
    
    // Method: mengelola data sekolah
    public void mengelolaDataSekolah(DataSekolah dataSekolah) {
        System.out.println("Admin " + nama + " sedang mengelola data sekolah...");
        dataSekolah.tampilkanRingkasan();
    }
    
    // Getter
    public String getIdAdmin() { return idAdmin; }
}