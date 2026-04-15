// User.java
// Kelas induk untuk Siswa, Guru, dan Admin
// Pewarisan: User → Siswa, Guru, Admin

public class User {
    // Atribut dengan access modifier
    protected String nama;      // # protected: bisa diakses subclass
    protected String email;     // # protected: bisa diakses subclass  
    private String password;    // - private: hanya User yang boleh akses
    
    // Constructor
    public User(String nama, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
    }
    
    // Method public (+): semua bisa akses
    public void setNama(String nama) {
        this.nama = nama;
        System.out.println("Nama diubah menjadi: " + nama);
    }
    
    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email diubah menjadi: " + email);
    }
    
    public void tampilInfo() {
        System.out.println("=== Info User ===");
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        // Password tidak ditampilkan demi keamanan
    }
    
    // Getter untuk password (private, jadi butuh method untuk akses)
    public String getPassword() {
        return password;
    }
    
    // Getter lainnya
    public String getNama() { return nama; }
    public String getEmail() { return email; }
}