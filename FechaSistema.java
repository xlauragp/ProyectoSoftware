package ProyectoF;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaSistema {
    private final LocalDate fecha;

    public FechaSistema() {
        fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getFormatoFecha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formato);
    }
}
