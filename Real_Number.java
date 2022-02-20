package ejercicio3;

/**
 * Esta clase permite la instanciación de objetos de la clase Real_Number y da
 * acceso a los métodos de creación de arreglos de valores aleatorios de tipo
 * double y de ordenamiento: Método Búrbuja y Método Quicksort.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Real_Number {

    /**
     * Constructor de objetos de la clase Real_Number sin ningún atributo
     * especificado.
     */
    public Real_Number() {
    }

    /**
     * El método GenerateArray permite la creación de arreglos de tipo double.
     *
     * @param dimension Dimensión del arreglo de valores aleatorio.
     * @return Arreglo de tipo double con valores aleatorios.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     *
     */
    public double[] GenerateArray(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    /**
     * El método BubbleSort permite la implementación del ordenamiento mediante
     * el método búrbuja de un arreglo tipo double.
     *
     * @param array Arreglo de tipo double a ordenar.
     * @param dimension Dimensión del arreglo.
     * @return Arreglo de tipo double previamente ordenado de forma ascendente
     * mediante el método búrbuja.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     */
    public double[] BubbleSort(double array[], int dimension) {
        /**
         * Variables que representan los índices del arreglo que se desea
         * ordenar, y el nuevo arreglo ordanado.
         */
        int i;
        int j;

        int index;
        /**
         * Almacenamiento de la última posición del arreglo a ordenar y el
         * arreglo ordenado.
         */
        i = dimension - 1;
        /**
         * Ciclo que permite ejecutar el método hasta que todo el arreglo se
         * encuentre ordenado de forma ascendente.
         */
        while (i > 0) {
            index = 0;
            /**
             * ciclo for que recorre el arreglo que se desea ordenar desde la
             * primera a la última posición.
             */
            for (j = 0; j < i; j++) {
                /**
                 * Condicional que valida si el valor siguiente del arreglo es
                 * menor que el valor presente.
                 */
                if (array[j + 1] < array[j]) {
                    /**
                     * Variable auxiliar que permite el almacenamiento del valor
                     * presente si este es mayor que el valor siguiente.
                     */
                    double aux = array[j];
                    /**
                     * Actualización del valor presente con el valor siguiente
                     * siendo que este es menor.
                     */
                    array[j] = array[j + 1];
                    /**
                     * Actualización del valor siguiente con la variable
                     * auxiliar siendo que este es mayor.
                     */
                    array[j + 1] = aux;
                    /**
                     * Almacenamiento del índice de la posición presente.
                     */
                    index = j;
                }
            }

            /**
             * Actualización de la variable i para que el ciclo while termine.
             */
            i = index;
        }
        /**
         * Retorno del arreglo ordenado mediante el método búrbuja.
         */
        return array;
    }

    /**
     * El método Quicksort permite la implementación del ordenamiento mediante
     * el método quicksort de un arreglo tipo double.
     *
     * @param array Arreglo de tipo double a ordenar.
     * @param primero Índice inicial del arreglo desde donde se desea ordenar.
     * @param ultimo Último índice o posición del arreglo hasta donde se desea
     * ordenar.
     * @return Arreglo ordenado de forma ascendente mediante el método
     * quicksort.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     */
    public double[] Quicksort(double array[], int primero, int ultimo) {
        /**
         * Variable de tipo entero que almacena la primera posición del arreglo
         * desde donde se desea ordenar.
         */
        int i = primero;
        /**
         * Variable de tipo entero que almacena la última posición del arreglo
         * hasta donde se desea ordenar.
         */
        int j = ultimo;
        /**
         * Variable que almacenara el índice central de la porción del arreglo o
         * de todo el arreglo que se desea ordenar.
         */
        int central;
        /**
         * Variable que almacena el valor de tipo double de la posición central
         * del arreglo.
         */
        double pivote;
        /**
         * Cálculo de la posición central del arreglo.
         */
        central = (primero + ultimo) / 2;
        /**
         * Almacenamiento del valor de la posición central del arreglo.
         */
        pivote = array[central];
        /**
         * Ciclo do-while que opera mientras que la posición incial sea menor o
         * igual que la posición final en la iteración del proceso de
         * ordenamiento.
         */
        do {
            /**
             * Ciclo while que incrementa el índice i y actualiza el primer
             * indice de ordenamiento mientras que el valor del arreglo sea
             * menor que el valor del pivote.
             */
            while (array[i] < pivote) {
                i++;
            }
            /**
             * Ciclo while que decrementa el índice j y actualiza el último
             * índice de ordenamiento mientras que el valor del arreglo sea
             * mayor que el pivote.
             */
            while (array[j] > pivote) {
                j--;
            }
            /**
             * Condicional que evalúa si el indice i es menor o igual que el
             * índice j, es decir verifica que el último índice de ordenamiento
             * sea mayor que el primer índice de ordenamiento.
             */
            if (i <= j) {
                /**
                 * Varible temporal que almacena el valor actualizado del primer
                 * índice de ordenamiento.
                 */
                double tmp;
                /**
                 * Asignación de la variable temporal con el valor del arreglo
                 * en el primer índice de ordenamiento.
                 */
                tmp = array[i];
                /**
                 * Intercambio de los valores del arreglo del primer índice con
                 * el último.
                 */
                array[i] = array[j];
                array[j] = tmp;
                /**
                 * Incremento y decremento de los valores de los índices i y j.
                 */
                i++;
                j--;
            }
        } while (i <= j);
        /**
         * Condicional que evalúa si el valor ingresado al método como primer
         * índice es igual al índice j.
         */
        if (primero < j) {
            /**
             * Llamada del método Quicksort con actualización del último índice
             * de ordenamiento.
             */
            Quicksort(array, primero, j);
        }
        /**
         * Condicional que evalúa si el valor ingresado al método como último
         * índice es igual al índice j.
         */
        if (i < ultimo) {
            /**
             * Llamada del método Quicksort con actualización del primer índice
             * de ordenamiento.
             */
            Quicksort(array, i, ultimo);
        }
        /**
         * Retorno del arreglo ordenado mediante método Quicksort.
         */
        return array;
    }
}
