package cr.taller.ejercicio2.equipo3;

public class texto {

    /**
     * Devuelve la suma de los dos strings como un nuevo string.
     *
     * @param a
     * @param b
     * @return
     */
    public String sumar_texto(String a, String b) {
        return a.concat(b);
    }

    public Integer sumarStrings(String numA, String numB) {
        try {
            return Integer.valueOf(numA) + Integer.valueOf(numB);
        } catch (final NumberFormatException nfe) {
            return 0;
        }
    }

    /**
     * @param vocal
     * @return
     */
    public Boolean isVocal(char vocal) {
        if (vocal == 'a') {
            return true;
        } else if (vocal == 'e') {
        } else if (vocal == 'i') {
            return true;
        } else if (vocal == 'o') {
            return true;
        } else if (vocal == 'u') {
            return true;
        }
        return false;
    }

    /**
     * Devuelve la primer vocal de la cadena
     *
     * @param cadena Cadena de carcteres
     * @return La vocal
     */
    public Character primerVocal(String cadena) {
        char[] caractere = cadena.toCharArray();
        for (final char aCaractere : caractere) {
            if (isVocal(aCaractere)) {
                return aCaractere;
            }
        }
        return null;
    }

    /**
     * Devuelve la primer consonante de la cadena
     *
     * @param cadena Cadena de carcteres
     * @return La consonante
     * @throws Exception Si no hay consonantes devuelve excepcion.
     */
    public char consonantePrimera(String cadena) throws Exception {
        char[] caractere = cadena.toCharArray();
        for (int i = 0; i < caractere.length; i++) {
            if (!isVocal(caractere[i])) {
                return caractere[i];
            }
        }
        throw new Exception("No hay consonantes");
    }

}
