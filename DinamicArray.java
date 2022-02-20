package ejercicio6;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

/**
 * Esta clase permite instanciar objetos de la clase DinamicArray y además
 * obtener acceso al método DinamicArray.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class DinamicArray {

    /**
     * Objeto de la clase Scanner que permite capturar datos por teclado.
     */
    Scanner data = new Scanner(System.in);
    /**
     * Objeto de la clase Bufferedreader que permite la captura de datos por
     * teclado.
     */
    BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Constructor que permite instanciar objetos de la clase, sin ningún
     * atributo de entrada.
     */
    public DinamicArray() {
    }

    /**
     * El método DinamicArray permite capturar por teclado valores de tipo
     * entero y generar un arreglo dinámico, el ingreso de datos se detendrá
     * cuando se ingrese un mismo dato dos veces seguidas.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     *
     */
    public void DinamicArray() throws IOException {
        /**
         * Arreglo de la clase Vector, que permite la generación de arreglos
         * dinámicos, cuando el valor de su tamaño se supera por la interacción
         * con el programa, su dimensión se duplica para ajustarse a las
         * necesidades del programa.
         */
        Vector vector = new Vector(20);
        /**
         * Variable que almacena el valor ingresado por teclado.
         */
        String d1;
        /**
         * Variable que almacena el número entero convertido mediante el método
         * ParseInt.
         */
        int d = 0;
        /**
         * Variable auxiliar que permite verificar el valor de las posiciones
         * del arreglo dinámico.
         */
        int j = 0;
        /**
         * Variable que permite la ejecución repetitiva de un ciclo while que
         * permite la captura de datos por teclado.
         */
        int n = 1;
        /**
         * Variable que controla el ciclo do - while.
         */
        int m = 0;

        /**
         * Ciclo While que se ejecuta hasta que el usuario ingresa dos veces
         * seguidas un mismo número.
         */
        while (n == 1) {
            /**
             * Ciclo do-while que valida que los números ingresados sean números
             * enteros.
             */
            do {
                /**
                 * Manejo de la Excepción de formato de valor ingresado.
                 */
                try {
                    System.out.println("Ingrese un número: ");
                    /**
                     * Captura de valores enteros por teclado y almacenamiento
                     * en la variable d1.
                     */
                    d1 = k.readLine();
                    /**
                     * Conversión del valor ingresado a un número entero.
                     */
                    d = Integer.parseInt(d1);
                    m = 0;
                } catch (NumberFormatException e) {
                    System.out.println("El valor ingresado no corresponde con un valor númerico!!");
                    m = 1;
                }
            } while (m == 1);

            /**
             * Adición del número ingresado al arreglo dinámico.
             */
            vector.addElement(d);
            /**
             * Condicionales anidados que evalúan las posiciones presente del
             * arreglo y la anterior, si los valores coinciden la variable n que
             * controla el ciclo while cambiará de valor y el ingreso de nuevos
             * valores ya no será posible, se omite la posición cero dado que a
             * esta posición no hay una anterior.
             */
            if (j != 0) {
                if (vector.elementAt(j) == vector.elementAt(j - 1)) {
                    /**
                     * Actualización de la variable de control del ciclo while
                     * para que éste finalice.
                     */
                    n = 0;
                }

            }

            /**
             * Incremento del índice que evalúa las posiciones del arreglo
             * dinámico.
             */
            j++;

        }

        System.out.println("Los números del arreglo son:");
        /**
         * Ciclo for que imprime los valores del arreglo dínámico en pantalla.
         */
        for (int i = 0; i < vector.size(); i++) {

            System.out.println(vector.elementAt(i));

        }
        /**
         * Manejo de Excepción de tipo IOException o de entradas y salidas de
         * datos.
         */
        try {
            System.out.print("Ingrese el nombre del archivo .txt donde se almacenará el arreglo: ");
            /**
             * Ingreso del nombre del archivo que almacenará los arreglos
             * dinámicos.
             */
            String nombre = data.next();
            /**
             * Instanciación de un objeto de la clase PrintWriter con el nombre
             * ingresado teclado de tipo .txt.
             */
            PrintWriter fichero = new PrintWriter(new FileWriter(nombre + ".txt"));
            /**
             * Ciclo for que almacena los valores del vector dinámico en el
             * fichero creado.
             */
            for (int i = 0; i < vector.size(); i++) {

                fichero.println(vector.elementAt(i));

            }
            /**
             * Método que permite cerrar el fichero creado.
             */
            fichero.close();
            /**
             * Manejo de la excepción de entrada de datos.
             */
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error!!");
        }
    }

}
