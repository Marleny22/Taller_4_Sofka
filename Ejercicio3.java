package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Marleny Fernández Sandoval
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /**
         * Variable de validación que permite al usuario generar arreglos
         * númericos hasta que éste lo desee y emplear los métodos de
         * ordanmiento.
         */
        String n = "0";
        /**
         * Variable de validación del ingreso para crear un nuevo arreglo
         * númerico.
         */
        String option;
        /**
         * Variable de validación para ingresar el valor de la dimensión al
         * proceso de crear arreglos con valores aleatorios.
         */
        String dimension1;
        /**
         * Variable auxiliar para verificar que el valor de la dimensión es un
         * valor entero.
         */
        int dimension;
        /**
         * Variable de validación para ingresar al menú de ordenamiento.
         */
        String option2 = "";
        /**
         * Variable de validación para continuar ordenando un arreglo
         * previamente creado mediante los dos métodos existentes.
         */
        String m = "0";
        /**
         * Objeto de la clase Real_Number que permite el acceso a lo métodos de
         * crear arreglo y ordenamiento.
         */
        Real_Number real = new Real_Number();
        /**
         * Menú de inicio con una opción principal de crear arreglos númericos
         * de tipo double
         */
        System.out.println("Ejercicio Nº 3");
        System.out.println("Ingrese la opción que desea realizar");
        /**
         * Objeto para capturar String por teclado.
         */
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Objeto para capturar datos por teclado.
         */
        Scanner d = new Scanner(System.in);
        /**
         * Objeto que permite acceder al método format y dar un formato de dos
         * decimales a lo valores númericos double.
         */
        DecimalFormat df = new DecimalFormat("0.00");
        /**
         * While que se ejecuta mientras el usuario desee continuar.
         */
        while ("0".equals(n)) {
            System.out.print("1. Crear un arreglo de números aleatorios reales. Ingrese 1 para continuar: ");
            /**
             * Validación de la opción ingresada por el usuario.
             */
            do {
                option = k.readLine();
                if (!"1".equals(option)) {
                    System.out.println("La opción ingresada es invalida!!");
                } else {
                    break;
                }
            } while (!"1".equals(option));
            /**
             * Switch Case que se encarga de verificar el valor de la opción
             * seleccionada y realizar el proceso de creación del arreglo de
             * valores aleatorios según las condiciones del usuario.
             */
            switch (option) {
                case "1":
                    /**
                     * Validación de la dimensión del arreglo ingresada por el
                     * usuario, esta debe corresponder con un número entero
                     * mayor a 0.
                     */

                    do {
                        try {
                            System.out.print("Ingrese la dimensión del arreglo que desea: ");
                            dimension1 = k.readLine();
                            dimension = Integer.parseInt(dimension1);
                        } catch (NumberFormatException e) {
                            System.out.println("Este no es un valor númerico entero");
                            dimension = 0;

                        }
                    } while (dimension <= 0);
                    /**
                     * difinición del arreglo donde se almacenarán los valores
                     * aleatorios con la dimensión especificada.
                     */
                    double[] array = new double[dimension];
                    /**
                     * Implementación del método de generación de un arreglo
                     * aleatorio que devuelve un arreglo tipo double con un
                     * dimensión predefinida.
                     */
                    array = real.GenerateArray(dimension);
                    /**
                     * Impresión en pantalla del arreglo generado por el método.
                     */
                    System.out.println("El arreglo creado contiene los siguientes elementos: ");
                    for (int i = 0; i < dimension; i++) {
                        System.out.print(df.format(array[i]) + " ");
                    }
                    System.out.println("\n");
                    /**
                     * En esta estructura se valida la opción ingresada por el
                     * usuario para seleccionar los métodos de ordenamiento, se
                     * trabaja con una excepción para garantizar que el valor
                     * ingresado sea un valor númerico entero y el do-while
                     * verifica que sean las dos posibles opciones 1 o 2.
                     */
                    while ("0".equals(m)) {
                        do {

                            try {
                                System.out.println("Ingrese la acción que desea realizar: ");
                                System.out.println("1. Ordenar mediante método burbuja");
                                System.out.println("2. Ordenar mediante QuickSort");
                                option2 = k.readLine();
                                Integer.parseInt(option2);
                            } catch (NumberFormatException e) {
                                System.out.println("Las opciones validas son 1 o 2!!");
                                option2 = "22";

                            }

                        } while (Integer.parseInt(option2) != 1 && Integer.parseInt(option2) != 2);
                        /**
                         * El Switch-Case evalua los dos valores de opción y
                         * ejecuta el ordenamiento del arreglo deseado por el
                         * usuario.
                         */
                        switch (option2) {
                            case "1":
                                /**
                                 * Se crea el arreglo de tipo double que
                                 * almacenará el arreglo ordenado mediante
                                 * método búrbuja.
                                 */
                                double[] arraybubblesort = new double[array.length];
                                /**
                                 * Implementa el método de la clase real
                                 * BubbleSort que ejecuta el ordenamiento de
                                 * método búrbuja sobre el arreglo con valores
                                 * aleatorios creado inicialmente.
                                 */
                                arraybubblesort = real.BubbleSort(array, dimension);
                                /**
                                 * Mediante el for se imprime en pantalla el
                                 * arreglo ordenado mediante método búrbuja.
                                 */
                                System.out.println("Los valores del arreglo ordenados mediante el método búrbuja son:");
                                for (int i = 0; i < dimension; i++) {
                                    System.out.print(df.format(arraybubblesort[i]) + " ");
                                }
                                System.out.println("\n");
                                break;
                            case "2":
                                /**
                                 * Se crea el arreglo de tipo double que
                                 * almacenará el arreglo con valores aleatorios
                                 * mediante el método quicksort.
                                 */
                                double[] arrayquicksort = new double[array.length];
                                /**
                                 * Implementa el método de la clase real
                                 * QuickSort que ejecuta el ordenamiento de
                                 * método quicksort sobre el arreglo con valores
                                 * aleatorios creado inicialmente en el cual se
                                 * ingresa el arreglo creado, el índice inicial
                                 * y el índice final del arreglo.
                                 */
                                arrayquicksort = real.Quicksort(array, 0, array.length - 1);
                                /**
                                 * Mediante el for se imprime en pantalla el
                                 * arreglo ordenado mediante método quicksort.
                                 */
                                System.out.println("Los valores del arreglo ordenados mediante el método Quicksort son:");
                                for (int i = 0; i < dimension; i++) {
                                    System.out.print(df.format(arrayquicksort[i]) + " ");
                                }
                                System.out.println("\n");
                                break;
                            default:
                                throw new AssertionError();
                        }
                        /**
                         * Validación para continuar en el menú de ordanamiento
                         * o salir.
                         */
                        System.out.print("Ingrese 0 si desea continuar ordenando el arreglo creado...: ");
                        m = k.readLine();
                    }

                    break;

                default:
                    throw new AssertionError();

            }
            /**
             * Validación para continuar en la opción de crear nuevo arreglo de
             * valores aleatorios o salir.
             */
            System.out.print("Ingrese 0 si desea continuar  creando mas arreglos...: ");
            n = k.readLine();
        }
    }

}
