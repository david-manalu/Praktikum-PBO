import java.util.ArrayList;

public class Karyawan extends Staff{
    float salary;
    ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();

    public Karyawan(String nama, String alamat, String telepon, String ttl, String nik) {
        super(nama, alamat, telepon, ttl, nik);
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
