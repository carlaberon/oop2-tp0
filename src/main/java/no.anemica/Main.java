package no.anemica;

public class Main {
    public static void main (String[] args){
        Tiempo date = new Tiempo();
        System.out.println("Formato largo: " + date.formatoLargo());
        System.out.println("Formato corto: " + date.formatoCorto());
    }
}
