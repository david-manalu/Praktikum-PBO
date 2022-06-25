import java.util.ArrayList;

public class MatkulAjar extends DosenTetap{
    private Matkul matkul;
    private ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();

    public MatkulAjar(String nama, String alamat, String telepon, String ttl, String nik) {
        super(nama, alamat, telepon, ttl, nik);
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }
}
