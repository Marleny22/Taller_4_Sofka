package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Marleny Fernandez Sandoval
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        /**
         * Variable del índice que evalúa el while para los 10 vehículos
         * permitidos en el Ferry.
         */
        int i = 0;
        /**
         * Variable que representa el estado de tripulación del vehículo.
         */
        boolean t = false;
        /**
         * Variable String que toma la selección del estado de la tripulación.
         */
        String tripulacion;
        /**
         * Variable entera que representa el número de pasajeros del vehículo.
         */
        int numeropasajeros;
        /**
         * Variable string que toma los datos ingresados por teclado del número
         * de ruedas del vehículo.
         */
        String numeroruedas1 = "";
        /**
         * Variable que representa el medio por el que se desplaza el vehículo.
         */
        String medio;
        /**
         * Variable que almacena la fecha de registro de los vehículos
         * registrados.
         */
        Date fecha = new Date();
        /**
         * Variable auxiliar que permite l validación de la fecha.
         */
        int aux;
        /**
         * Variable que representa el número de ruedas del vehículo y alamcena
         * el valor ingresado por el usuario.
         */
        int numeroruedas;
        /**
         * Objeto que permite acceder al método readLine para captura de datos
         * por teclado.
         */
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Objeto que permite acceder al método NextInt para capturar datos
         * enteros por teclado.
         */
        Scanner d = new Scanner(System.in);
        /**
         * Arreglo de tipo Vehicle que permite el alamcenamiento de los objetos
         * vehículo instanciados con todos sus atributos.
         */
        Vehicle[] vehiculosferry = new Vehicle[10];
        /**
         * Solicitud de datos del vehículo por teclado.
         */
        System.out.println("Ejercicio Nº 4");
        System.out.println("Ingrese los datos del vehículo que ingresa al ferry");
        /**
         * While que realiza el proceso de almacenamiento de datos de los
         * vehículos hasta que se cumpla la cantidad suficiente que puede
         * transportar el Ferry que son 10 vehículos.
         */
        while (i < 10) {
            /**
             * Variable de visualización en pantalla para indicar que número de
             * vehículo se esta registrando partiendo desde 1.
             */
            int y = i + 1;
            System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
            System.out.println("Vehículo " + y);
            System.out.print("Ingrese el número de pasajeros: ");
            /**
             * Validación del valor de número de pasajeros como un valor entero.
             */
            try {
                /**
                 * El valor ingresado por teclado se pasa por el método paseInt
                 * para convertirse a entero.
                 */
                numeropasajeros = Integer.parseInt(d.next());
                /**
                 * Si el valor ingresado no corresponde con un valor entero,
                 * entonces se establece el manejo de la excepción
                 * NumberFormatException.
                 */
            } catch (NumberFormatException ex) {
                System.out.println("El valor ingresado no es un número entero ");
                /**
                 * Esta sentencia permite retornar al inicio del ciclo while
                 * para permitir al usuario ingresar de nuevo el dato.
                 */
                continue;
            }

            /**
             * Ciclo do-while para validación del estado de la tripulación, el
             * ciclo se repite mientras el estado ingresado no corresponda con
             * las opciones permitidas.
             */
            do {

                System.out.print("Ingrese si el vehículo tiene tripulación S/N: ");
                tripulacion = k.readLine();
                /**
                 * Condicional que evalúa si el estado ingresado s o S que
                 * representa Si o n o N que representa No, esta presente en la
                 * variable de entrada, de lo contrario y la ultima conidición
                 * se establece la función continue que retorna la ejecución al
                 * inicio del do - while.
                 */
                if ("S".equals(tripulacion) || "s".equals(tripulacion)) {
                    t = true;
                } else if ("N".equals(tripulacion) || "n".equals(tripulacion)) {
                    t = false;
                } else {
                    System.out.println("El dato ingresado es ivalido!! las opciones posibles son S o N");
                    continue;
                }

            } while (!"s".equals(tripulacion) && !"S".equals(tripulacion) && !"n".equals(tripulacion) && !"N".equals(tripulacion));
            /**
             * Condicional que valida el ingreso de un número entero que
             * represente el número de ruedas.
             */
            do {
                /**
                 * Manjeo de excepción de formato inválido para el método
                 * paseInt que indica que el valor presente no es un número
                 * entero.
                 */
                try {
                    /**
                     * Captura de datos por teclado de el número de ruedas del
                     * vehículo y conversión de este String a entero.
                     */
                    System.out.print("Ingrese el número de ruedas: ");
                    numeroruedas1 = k.readLine();
                    numeroruedas = Integer.parseInt(numeroruedas1);
                    /**
                     * Manejo de la excepción para cualquier tipo de dato que no
                     * corresponda con un número entero ingresado por teclado.
                     */
                } catch (NumberFormatException e) {
                    System.out.println("El valor ingresado no es un número entero!!");
                    /**
                     * Actualización de la variable de validación del ciclo
                     * do-while para permitir que al manejar la excepción se
                     * vuelva a preguntar al usuario por el dato.
                     */
                    numeroruedas1 = "0";
                    numeroruedas = 0;

                }

            } while (Integer.parseInt(numeroruedas1) <= 0);

            /**
             * Ciclo do - while que permite la validación de la fecha de
             * registro del vehículo.
             */
            do {
                try {
                    /**
                     * Se realiza la solicitud de la fecha de registro del
                     * vehículo y si da formato a la fecha mediante el método
                     * parse.
                     */
                    System.out.print("Ingrese la fecha de registro del vehículo: (dd/MM/yyyy) ");
                    String fecha1 = k.readLine();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    fecha = formato.parse(fecha1);
                    /**
                     * se emplea esta variable para romper el ciclo y que el
                     * código siga ejecutandose normalmente.
                     */
                    aux = 0;
                    /**
                     * El catch hace un tratado de la excepción ParseException
                     * del método parse cuando no se ingresa una fecha adecuada.
                     */
                } catch (ParseException e) {
                    /**
                     * Se imprime un mensaje para indicarle al usuario que el
                     * dato ingresado es inválido.
                     */
                    System.out.println("El formato de fecha es invalido debe ser 02/03/2022");
                    /**
                     * Actualización de la variable aux para permitir que el
                     * ciclo se ejecute nuevamente hasta que el usuario ingrese
                     * el dato correcto.
                     */
                    aux = 1;
                }
            } while (aux == 1);
            /**
             * Ciclo do - while de validación para el ingreso del medio por el
             * que circula el vehículo.
             */
            do {

                /**
                 * Captura por teclado del medio en el que se desplaza.
                 */
                System.out.println("Ingrese el medio por el que se desplaza: ");
                System.out.print("Tierra,aire o agua: ");
                medio = k.readLine();
                /**
                 * Condicional que válida el valor ingresado con diferentes
                 * combinaciones de mayúsculas y minúsculas.
                 */
                if ("tierra".equals(medio) || "Tierra".equals(medio) || "TIERRA".equals(medio)) {
                    medio = "Tierra";
                } else if ("aire".equals(medio) || "Aire".equals(medio) || "AIRE".equals(medio)) {
                    medio = "Aire";
                } else if ("agua".equals(medio) || "Agua".equals(medio) || "AGUA".equals(medio)) {
                    medio = "Agua";
                } else {
                    /**
                     * Imprime un mensaje en pantalla que el valor ingresado es
                     * incorrecto.
                     */
                    System.out.println("Ingrese un medio válido: Tierra, aire, agua");
                }
            } while (!"agua".equals(medio) && !"Agua".equals(medio) && !"AGUA".equals(medio) && !"AIRE".equals(medio)
                    && !"Aire".equals(medio) && !"aire".equals(medio) && !"tierra".equals(medio) && !"Tierra".equals(medio)
                    && !"TIERRA".equals(medio));
            /**
             * Ingreso por teclado de la marca del vehículo.
             */
            System.out.print("Ingrese la marca del vehículo: ");
            String marca = k.readLine();
            /**
             * Instanciación del objeto vehículo con todos los parámetros
             * ingresados por teclado.
             */
            Vehicle vehiculo = new Vehicle(numeropasajeros, t, numeroruedas, fecha, medio, marca);
            /**
             * Almacenamiento del vehículo instanciado en el arreglo de
             * vehículos que ingresaron al Ferry.
             */
            vehiculosferry[i] = vehiculo;
            /**
             * Incremento de la variable i para ingreso de un nuevo vehículo.
             */
            i++;
        }

        System.out.println("");
        System.out.println("_________________________________________________________________________________________________");
        System.out.println("Los vehículos ingresados al ferry son: ");
        /**
         * Ciclo for que imprime los vehículos ingresados al Ferry.
         */
        for (int j = 0; j < vehiculosferry.length; j++) {
            System.out.print(j + 1 + ".");
            vehiculosferry[j].PrintData();
        }
    }

}
