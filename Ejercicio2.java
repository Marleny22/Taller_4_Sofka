package ejercicio2;

/**
 * La clase principal Ejercicio dos permite el acceso a dos métodos principales
 * implementando polimorfismo mediante el método public static void
 * main(String[] args.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Ejercicio2 {

    /**
     * Método prinpipal main con dos valores de entrada que realiza una
     * operación aritmética de suma de dos números enteros e imprime el
     * resultado.
     *
     * @param valor Sumando 1.
     * @param valor2 Sumando 2.
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     */
    public static void main(int valor, int valor2) {
        /**
         * Variable que almacena el resultado de la operación de números
         * enteros.
         */
        int operation;
        /**
         * Operación aritmética.
         */
        operation = valor + valor2;
        /**
         * Impresión en pantalla del resultado de la operación.
         */
        System.out.println("La suma de " + valor + " y " + valor2 + " es: " + operation);
    }

    /**
     * Método prinpipal main con dos valores de entrada que realiza la impresión
     * de un String que representa el nombre de un integrante.
     *
     * @param string Nombre del integrante.
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     */
    public static void main(String string) {
        /**
         * Impresión en pantalla del String ingresado al método.
         */
        System.out.println("El nombre del integrante del grupo es: " + string);
    }

    /**
     * Método principal que establece la entrada a la ejecución del código, y
     * hace el llamado de dos métodos adicionales main.
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Llamado del método main para la realización de una suma aritmética de
         * enteros y la impresión del resultado.
         */
        main(40, 30);
        /**
         * LLamado del método main para la impresión de un String.
         */
        main("Marleny Fernandez");
    }

}
