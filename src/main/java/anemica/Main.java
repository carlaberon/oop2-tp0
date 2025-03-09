package anemica;
import no.anemica.Tiempo;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main (String[] args){
        Tiempo date = new Tiempo();
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        String longFormat = date.getTiempo().format(formatoLargo);
        System.out.println("Formato largo: " + longFormat);

        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String shortFormat = date.getTiempo().format(formatoCorto);
        System.out.println("Formato corto: " + shortFormat);
    }

}
