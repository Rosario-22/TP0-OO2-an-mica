package ar.unrn.tp0.anemico.Time;
import java.time.LocalDate;

class Time {
    private LocalDate fecha;

    public Time() {
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}