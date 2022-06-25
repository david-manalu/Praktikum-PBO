public class MatkulPilihan extends Matkul{
    private int minMhs;

    public MatkulPilihan(String kode, int sks, String nama) {
        super(kode, sks, nama);
    }

    public int getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }
}
