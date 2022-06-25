import java.util.ArrayList;

abstract class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();

    public Dosen(String nama, String alamat, String telepon, String ttl, String nik) {
        super(nama, alamat, telepon, ttl, nik);
    }

    abstract String getDepartemen();

    abstract void setDepartemen(String departemen);

    abstract ArrayList<MatkulAjar> getMatkulAjar();

    abstract void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar);
}
