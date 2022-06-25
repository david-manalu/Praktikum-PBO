import java.util.ArrayList;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap(String nama, String alamat, String telepon, String ttl, String nik) {
        super(nama, alamat, telepon, ttl, nik);
    }

    @Override
    String getDepartemen() {
        return null;
    }

    @Override
    void setDepartemen(String departemen) {

    }

    @Override
    ArrayList<MatkulAjar> getMatkulAjar() {
        return null;
    }

    @Override
    void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {

    }

    @Override
    String getNik() {
        return null;
    }

    @Override
    void setNik(String nik) {

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
