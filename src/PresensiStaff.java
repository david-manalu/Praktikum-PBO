import java.time.LocalTime;
import java.util.Date;

public class PresensiStaff extends Presensi {
    private LocalTime jam;

    public PresensiStaff(Date tanggal, int status) {
        super(tanggal, status);
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }
}
