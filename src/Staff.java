abstract class Staff extends User {
    private String nik;

    public Staff(String nama, String alamat, String telepon, String ttl, String nik) {
        super(nama, alamat, telepon, ttl);
        this.nik = nik;
    }

    abstract String getNik();

    abstract void setNik(String nik);

    @Override
    public String toString() {
        return "Staff{" +
                "nik='" + nik + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", telepon='" + telepon + '\'' +
                ", ttl='" + ttl + '\'' +
                '}';
    }
}
