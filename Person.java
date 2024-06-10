public class Person {
    private String nama;
    private int umur;
    private String alamat;
    private String pekerjaan;
    private String hobi;

    // Constructor dengan argumen
    public Person(String nama, int umur, String alamat, String pekerjaan, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
    }

    // Constructor tanpa argumen (default constructor)
    public Person() {
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getHobi() {
        return hobi;
    }
}
