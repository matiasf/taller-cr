package cr.taller.ejercicio2.equipo6;

import cr.taller.ejercicio2.equipo5.PasswordUtil;

import java.util.Calendar;
import java.util.Date;

public class RegisterUtil {

    public void ckeckUser(User u) throws InvalidUserException {
        checkPassword(u.getPassword());
        checkAge(u.getBirthDate());

        if (!checkPassword(u.getPassword())) {
            throw new InvalidUserException("password");
        }
    }

    private void checkAge(Date date) throws InvalidUserException {
        Date today = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTimeInMillis(today.getTime() - date.getTime());
        if (calendario.get(Calendar.YEAR) < 18) {
            throw new InvalidUserException("age");
        }
    }

    private boolean checkPassword(String password) {
        return PasswordUtil.isStrongPassword(password);
    }

    private class InvalidUserException extends Exception {

        public InvalidUserException(String edad) {
            super(edad);
        }

    }

    public class User {
        private String email;
        private String password;
        private Date birthDate;

        public String getEmail() {
            return email;
        }

        public void setEmail(final String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(final String password) {
            this.password = password;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(final Date birthDate) {
            this.birthDate = birthDate;
        }
    }

}
