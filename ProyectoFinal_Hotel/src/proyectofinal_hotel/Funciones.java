package proyectofinal_hotel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Funciones {

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean isDoble(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Date String_A_Date(String s) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(s);
        } catch (Exception e) {
            System.out.println(e);
        }
        return fecha;
    }

    public static String Date_A_Calendar(Date d) {
        String fecha;
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        Integer mes = c.get(Calendar.MONDAY)+1;
        fecha = c.get(Calendar.DAY_OF_MONTH) + "/" +mes+ "/" +c.get(Calendar.YEAR);
        return fecha;
    }
}
