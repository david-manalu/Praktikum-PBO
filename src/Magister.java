public class Magister extends Sarjana {
    private String judulTesis;

    public Magister(String nama, String alamat, String telepon, String ttl, String nim, String jurusan) {
        super(nama, alamat, telepon, ttl, nim, jurusan);
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }
}
