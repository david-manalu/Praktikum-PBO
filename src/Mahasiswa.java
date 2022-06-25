abstract class Mahasiswa extends User{
    protected String nim;
    protected String jurusan;

    public Mahasiswa(String nama, String alamat, String telepon, String ttl, String nim, String jurusan) {
        super(nama, alamat, telepon, ttl);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    abstract String getNim();

    abstract String getJurusan();

    abstract void setNim(String nim);

    abstract void setJurusan(String jurusan);

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", telepon='" + telepon + '\'' +
                ", ttl='" + ttl + '\'' +
                '}';
    }
}
