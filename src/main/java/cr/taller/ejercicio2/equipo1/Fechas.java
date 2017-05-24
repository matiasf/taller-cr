package cr.taller.ejercicio2.equipo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    /**
     * Chequea si la fecha provista es antes que la fecha recivida.
     * @param fecha
     * @return
     */
    public static boolean esPasado(Date fecha) {
        return new Date().after(fecha);
    }

    /**
     * Chequea si la fecha provista es despues que la fecha recivida.
     * @param fecha
     * @return
     */
    public static boolean esFutuo(Date fecha) {
        return new Date().before(fecha);
    }

    /**
     *
     * @return
     */
    public static Date _5diasdespues() {
        final Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.DAY_OF_YEAR, 5);
        return calendario.getTime();
    }

    /**
     * Devuelve el ultimo dia del mes
     * @param fecha
     * @return
     */
    public static Date ultimaDiaDelMes(Date fecha) {
        final Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        calendario.set(Calendar.DAY_OF_MONTH, calendario.getActualMaximum(Calendar.DAY_OF_MONTH));
        fecha = calendario.getTime();
        return fecha;
    }


    public static String fechaAString(Date fecha) {
        return dateFormat.format(fecha);
    }

    public static Date StringAFecha(String fecha) throws Exception {
        try {
            return dateFormat.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new Exception("El String no es una fecha");
        }
    }

}
