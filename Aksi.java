public class Aksi {
    public static void main(String[] args) {
        // Buat 3 object dari Class Person
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        // Isi semua atribut pada salah satu object
        person1.setNama("Husna");
        person1.setUmur(23);
        person1.setAlamat("Banjarbaru");
        person1.setPekerjaan("Mahasiswa");
        person1.setHobi("Membaca");

        // Print atribut dari object person1
        System.out.println("Nama: " + person1.getNama());
        System.out.println("Umur: " + person1.getUmur());
        System.out.println("Alamat: " + person1.getAlamat());
        System.out.println("Pekerjaan: " + person1.getPekerjaan());
        System.out.println("Hobi: " + person1.getHobi());
    }
}