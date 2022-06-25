abstract class User {
    protected String nama;
    protected String alamat;
    protected String telepon;
    protected String ttl;

    public User(String nama, String alamat, String telepon, String ttl) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.ttl = ttl;
    }

    abstract String getNama();

    abstract String getAlamat();

    abstract String getTelepon();

    abstract String getTtl();

    abstract void setNama(String nama);

    abstract void setAlamat(String alamat);

    abstract void setTelepon(String telepon);

    abstract void setTtl(String ttl);

    @Override
    public String toString() {
        return "User{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", telepon='" + telepon + '\'' +
                ", ttl='" + ttl + '\'' +
                '}';
    }

}
