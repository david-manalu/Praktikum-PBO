import java.util.ArrayList;

public class MatkulAmbil {
    private Matkul matkul;
    private ArrayList<Presensi> presensi = new ArrayList();
    private int nilai1;
    private int nilai2;
    private int nilai3;

    public MatkulAmbil(Matkul matkul, ArrayList<Presensi> presensi, int nilai1, int nilai2, int nilai3) {
        this.matkul = matkul;
        this.presensi = presensi;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }
}
