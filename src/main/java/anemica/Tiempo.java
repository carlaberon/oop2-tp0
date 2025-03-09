package anemica;
import java.time.LocalDate;

public class Tiempo {
    private LocalDate date;

    public Tiempo() {
        this.date = LocalDate.now();
    }

    public LocalDate getTiempo() {
        return date;
    }

    public void setTiempo(LocalDate date1) {
        this.date = date1;

    }
}