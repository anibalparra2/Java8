package ejemplos;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateApp {

    //compara fecha, hora y fecha-hora
    public void verificar() {
        LocalDate fecha1 = LocalDate.of(1974, 06, 14);
        LocalDate fecha2 = LocalDate.now();
        System.out.println(fecha1.isAfter(fecha2));
        LocalTime hora1 = LocalTime.of(15, 22, 30);
        LocalTime hora2 = LocalTime.now();
        System.out.println(hora1.isAfter(hora2));
        LocalDateTime fechaHora1 = LocalDateTime.of(1974, 06, 14, 15, 22, 30);
        LocalDateTime fechaHora2 = LocalDateTime.now();
        System.out.println(fechaHora1.isAfter(fechaHora2));
    }

    //calcula la diferencia de tiempo entre dos instantes de tiempo
    public void medirTiempo() throws InterruptedException {
        Instant ini = Instant.now();
        Thread.sleep(1000);
        Instant fin = Instant.now();
        System.out.println(Duration.between(ini, fin).toMillis());
    }

    //calcula el tiempo transcurrido entre dos fechas
    public void calcularTiempo() {
        LocalDate ini = LocalDate.of(1974, 06, 14);
        LocalDate fin = LocalDate.now();
        Period periodo = Period.between(ini, fin);
        System.out.println("Mi edad: " + periodo.getYears() + "-" + periodo.getMonths() + "-" + periodo.getDays());
    }

    //convierte de string a LocalDate
    public void convertir() {
        String fecha = "14/06/1974";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaFormato = LocalDate.parse(fecha, formateador); //pasar de string a LocalDate
        System.out.println(fechaFormato); //formato de LocalDate
        System.out.println(formateador.format(fechaFormato)); //formato personalizado
    }

    public static void main(String args[]) throws InterruptedException {
        LocalDateApp local = new LocalDateApp();
        //local.verificar();
        //local.medirTiempo();
        //local.calcularTiempo();
        local.convertir();
    }

}
