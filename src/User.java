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

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getTtl() {
        return ttl;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void printUser() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
        System.out.println("TTL: " + ttl);
    }
}
