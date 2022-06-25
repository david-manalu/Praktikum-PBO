public class Doktor extends Mahasiswa{
    private String judulDisertasi;
    private float nilaiSidang1;
    private float nilaiSidang2;
    private float nilaiSidang3;

    public Doktor(String nama, String alamat, String telepon, String ttl, String nim, String jurusan) {
        super(nama, alamat, telepon, ttl, nim, jurusan);
    }

    @Override
    String getNim() {
        return null;
    }

    @Override
    String getJurusan() {
        return null;
    }

    @Override
    void setNim(String nim) {

    }

    @Override
    void setJurusan(String jurusan) {

    }

    @Override
    String getNama() {
        return null;
    }

    @Override
    String getAlamat() {
        return null;
    }

    @Override
    String getTelepon() {
        return null;
    }

    @Override
    String getTtl() {
        return null;
    }

    @Override
    void setNama(String nama) {

    }

    @Override
    void setAlamat(String alamat) {

    }

    @Override
    void setTelepon(String telepon) {

    }

    @Override
    void setTtl(String ttl) {

    }
}
