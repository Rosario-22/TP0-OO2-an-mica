package ar.unrn.tp0.anemico.Main;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Time tiempo = new Time();

        DateTimeFormatter timeLong = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy",
                new Locale("es", "ES"));
        DateTimeFormatter timeShort = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(tiempo.getFecha().format(timeLong));
        System.out.println(tiempo.getFecha().format(timeShort));
    }
}

