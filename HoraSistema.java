package ProyectoF;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class HoraSistema {
    private final LocalDateTime time;

    public HoraSistema() {
        time = LocalDateTime.now();
    }

    public LocalDateTime getTime() {
        return time;
    }
    public String getFormatoTime() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss");
        return time.format(formato);
    }
}
