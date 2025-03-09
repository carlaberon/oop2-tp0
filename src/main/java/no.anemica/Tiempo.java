package no.anemica;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {
    private LocalDate date;

    public Tiempo (){
        this.date = LocalDate.now();
    }

    public LocalDate getTiempo(){
        return date;

    }
    public void setTiempo(LocalDate date1){
        this.date = date1;

    }
    public String formatoLargo(){
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        String longFormat = this.date.format(formatoLargo);
        return longFormat;
    }

    public String formatoCorto(){
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String shortFormat = this.date.format(formatoCorto);
        return shortFormat;
    }

}
