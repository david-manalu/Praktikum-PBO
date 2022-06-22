abstract class Mahasiswa extends User{
    protected String nim;
    protected String jurusan;

    public Mahasiswa(String nama, String alamat, String telepon, String ttl, String nim, String jurusan) {
        super(nama, alamat, telepon, ttl);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void printMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
        System.out.println("TTL: " + ttl);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}
