package cr.taller.ejercicio2.equipo2;

public class Matematica {

    /**
     * Divide dos numeros
     *
     * @param dividendo
     * @param divizor
     * @return
     */
    public Integer dividir(Integer dividendo, Integer divizor) {
        return dividendo / divizor;
    }

    /**
     * Suma dos numeros
     *
     * @param a
     * @param b
     * @return
     */
    public Integer Sumar(Integer a, Integer b) {
        return a + b;
    }

    /**
     * Resta el numero a al numero b y devuelve el resultado.
     *
     * @param a El numero al que se le resta la cantidad b
     * @param b La cantidad a restar.
     * @return El resultado de la resta.
     */
    public Integer Restar(Integer a, Integer b) {
        return a - b;
    }

    /**
     * La multiplicacion
     *
     * @param a
     * @param b
     * @return
     */
    public Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    /**
     * La potencia.
     *
     * @param a
     * @param exponente
     * @return
     */
    public Integer potencia(Integer a, Integer exponente) {
        int original = a;
        int INDEX = 0;
        // Esto va multiplicando los numeros y luego los devuelve.
        while (INDEX < exponente) {
            a = multiplicar(original, a);
            INDEX++;
        }
        return a;
    }

    /**
     * La derivada
     *
     * @param el_numero
     * @return
     */
    public Integer factorial(Integer el_numero) {
        int resultado = 1;
        //TODO: Arreglar este for ya que la variable comienza no contempla todos los casos.
        for (; el_numero > 0; el_numero--) {
            resultado = multiplicar(resultado, el_numero);
        }
        return resultado;
    }

}
