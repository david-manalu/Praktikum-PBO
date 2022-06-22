public class Staff extends User {
    private String nik;

    public Staff(String nama, String alamat, String telepon, String ttl, String nik) {
        super(nama, alamat, telepon, ttl);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
