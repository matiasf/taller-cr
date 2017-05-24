package cr.taller.ejercicio2.equipo5;

public class PasswordUtil {

    public static boolean isStrongPassword(String password) {
        if (password.length() < 4) {
            return false;

        } else if (password.length() <= 8) {
            if (password.contains(",") || password.contains(".")) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

}
