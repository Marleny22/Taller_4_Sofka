
package ejercicio5;

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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
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
        String medio = "";
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

        int tipo;
        boolean puertas;
        boolean sidecar;
        int ubicacionmotor;
        String umotor = "";
        int tbike;
        String tipob = "";
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

        System.out.println("Ejercicio Nº 5");
        System.out.println("Ingrese los datos del vehículo que ingresa al ferry");
        while (i < 10) {
            do {
                System.out.println("\n");
                System.out.println("Ingrese el número del tipo de vehículo que desea registrar en el Ferry:");
                System.out.println("1.Coche");
                System.out.println("2.Motocicleta");
                System.out.println("3.Camión");
                System.out.println("4.Bicicleta");
                System.out.println("5.Lancha");
                tipo = d.nextInt();
                System.out.println("\n");

            } while (tipo < 1 || tipo > 5);

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

            } while (!"s".equals(tripulacion) && !"S".equals(tripulacion) && !"n".equals(tripulacion) && 
                    !"N".equals(tripulacion));

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
             * Ingreso por teclado de la marca del vehículo.
             */
            System.out.print("Ingrese la marca del vehículo: ");
            String marca = k.readLine();

            /**
             * Condicional que asigna el medio por el que circula el vehículo
             * según el tipo de Vehículo.
             */
            if (tipo >= 1 && tipo <= 4) {
                medio = "Tierra";
            } else {
                medio = "Agua";
            }
            /**
             * El Switch Case evalúa el tipo de vehículo que se esta ingresando
             * en el menú inicial y realiza la solicitud de ciertos atributos
             * según corresponde.
             */
            switch (tipo) {
                case 1:
                    /**
                     * Caso de tipo coche que hace la solicitud de el estado del
                     * número de puertas.
                     */
                    /**
                     * Validación de los datos ingresados por teclado y manejo
                     * excepción.
                     */
                    do {
                        try {
                            System.out.println("Ingrese el número de puertas del coche: ");
                            System.out.print("Si el coche tiene 3 puertas ingrese 1 y si el coche tiene 5 puertas ingrese 2:");

                            /**
                             * Ingreso por teclado del número de puertas.
                             */
                            String npuertas1 = k.readLine();
                            /**
                             * Conversión a entero de String ingresado por
                             * teclado.
                             */
                            int npuertas = Integer.parseInt(npuertas1);
                            /**
                             * Condicional que asigna el valor adecuado a la
                             * variable puertas con estados booleano.
                             */
                            if (npuertas == 1) {
                                puertas = true;
                            } else {
                                puertas = false;
                            }
                            /**
                             * Sentencia que rompe el while - true si se
                             * ejecutan todas las líneas seguidas del try.
                             */
                            break;
                            /**
                             * Manejo de la excepción NumberFormatException
                             * cuando el usuario ingresa un valor que no
                             * corresponde con un número entero.
                             */
                        } catch (NumberFormatException e) {
                            System.out.println("El valor ingresado es inválido, las opciones son 1 o 2.");

                        }
                    } while (true);

                    /**
                     * Instanciación del vehículo coche con los parámetros
                     * ingresados por el usuario, mediante la clase Car.
                     */
                    Car coche = new Car(numeropasajeros, t, fecha, medio, marca, puertas);
                    /**
                     * Almacenamiento del vehículo en el arreglo que contiene
                     * los objetos de tipo vehículo ingresados al Ferry.
                     */
                    vehiculosferry[i] = coche;
                    break;
                case 2:
                    /**
                     * Caso de tipo Motocicleta que hace la solicitud de
                     * sidecar.
                     */
                    /**
                     * Validación de los datos ingresados por teclado y manejo
                     * excepción.
                     */
                    do {
                        try {
                            System.out.print("Ingrese si la motocicleta tiene carro lateral o sidecar: ");
                            System.out.print("Si la moto tiene sidecar  ingrese 1 y si la moto no tiene sidecar ingrese 2: ");
                            /**
                             * Ingreso por teclado del estado del sidecar.
                             */
                            String sc1 = k.readLine();
                            /**
                             * Conversión a entero de String ingresado por
                             * teclado.
                             */
                            int sc = Integer.parseInt(sc1);
                            /**
                             * Condicional que asigna el valor adecuado a la
                             * variable sc con estados booleano.
                             */
                            if (sc == 1) {
                                sidecar = true;
                            } else {
                                sidecar = false;
                            }
                            /**
                             * Sentencia que rompe el while - true si se
                             * ejecutan todas las líneas seguidas del try.
                             */
                            break;

                        } /**
                         * Manejo de la excepción NumberFormatException cuando
                         * el usuario ingresa un valor que no corresponde con un
                         * número entero.
                         */
                        catch (NumberFormatException e) {
                            System.out.println("El valor ingresado es inválido, las opciones son 1 o 2.");

                        }
                    } while (true);

                    /**
                     * Instanciación de objeto de tipo Motocicleta con los
                     * atributos adecuados.
                     */
                    Motorcycle moto = new Motorcycle(numeropasajeros, t, fecha, medio, marca, sidecar);
                    /**
                     * Almacenamiento del objeto en el arreglo de vehículos.
                     */
                    vehiculosferry[i] = moto;

                    break;
                case 3:
                    /**
                     * Caso tres que representa la clase Camión y permite el
                     * ingreso los atributos propios de la clase camión.
                     */
                    System.out.print("Ingrese la altura del camión en metros: ");
                    /**
                     * Ingreso de la altura del camión en una variable double
                     * mediante el método nextDouble de la clase Scanner.
                     */
                    double altura = d.nextDouble();
                    System.out.print("Ingrese la cantidad de ejes del camión (2, 3 o 4 ejes): ");
                    /**
                     * Ingreso por teclado de la cantidad de ejes del camión en
                     * un valor entero.
                     */
                    int ejes = d.nextInt();

                    /**
                     * Instanciación de un objeto camión con los parámetros
                     * adecuados para el objeto camión.
                     */
                    Truck camion = new Truck(numeropasajeros, t, fecha, medio, marca, ejes, altura);
                    /**
                     * Almacenamiento del objeto camión creado en el arreglo de
                     * vehículos.
                     */
                    vehiculosferry[i] = camion;
                    break;
                case 4:
                    /**
                     * Caso 4 que representa el vehículo Bicicleta y permite
                     * ingresar los atributos propios de éste vehículo.
                     */
                    System.out.print("Ingrese el tamaño del aro de la bicicleta en pulgadas (12, 16, 20, 24, 26): ");
                    /**
                     * Ingreso por teclado del tamaño en pulgadas del aro de la
                     * bicicleta.
                     */
                    int aro = d.nextInt();
                    /**
                     * Ciclo do - while que permite la validación del tipo de
                     * bicicleta.
                     */
                    do {
                        System.out.print("Ingrese el tipo de bicicleta: 1.De montaña 2.Urbana 3.De ruta ");
                        /**
                         * Ingreso por teclado de un valor entero.
                         */
                        tbike = d.nextInt();
                    } while (tbike < 1 || tbike > 3);
                    /**
                     * Asignación de la variable tbike con la descripción
                     * correspondiente.
                     */
                    if (tbike == 1) {
                        tipob = "De montaña";
                    } else if (tbike == 2) {
                        tipob = "Urbana";
                    } else if (tbike == 3) {
                        tipob = "De ruta";
                    }

                    /**
                     * Instanciación del objeto de la clase Bicicleta con los
                     * atributos necesarios.
                     */
                    Bike bici = new Bike(numeropasajeros, t, fecha, medio, marca, aro, tipob);
                    /**
                     * Almacenamiento del objeto dentro del arreglo de vehículos
                     * del Ferry.
                     */
                    vehiculosferry[i] = bici;
                    break;
                case 5:
                    /**
                     * Caso 5 que representa el Vehículo Lancha y permite el
                     * ingreso de los atributos propios.
                     */
                    /**
                     * Ciclo do - while que valida las opciones de ubicación del
                     * motor en la lancha.
                     */
                    do {
                        System.out.print("Ingrese la ubicación del motor en la lancha: "
                                + "1. Dentro de la borda 2. Fuera de la borda 3. Dentro/Fuera de la borda:");
                        /**
                         * Ingreso de un valor entero que representa la
                         * ubicación del motor.
                         */
                        ubicacionmotor = d.nextInt();
                    } while (ubicacionmotor < 1 || ubicacionmotor > 3);
                    /**
                     * Conidicional que asigna a la variable ubicacionmotor un
                     * String que representa el estado de la ubicación del
                     * motor.
                     */
                    if (ubicacionmotor == 1) {
                        umotor = "Fuera de la borda";
                    } else if (ubicacionmotor == 2) {
                        umotor = "Dentro de la borda";
                    } else if (ubicacionmotor == 3) {
                        umotor = "Dentro/Fuera de la borda";
                    }
                    /**
                     * Instanciación del objeto Lancha con los parámetros
                     * necesarios.
                     */
                    Launch lancha = new Launch(numeropasajeros, t, fecha, medio, marca, umotor);
                    /**
                     * Almacenamiento del objeto instanciado dentro del arreglo
                     * de Vehículos.
                     */
                    vehiculosferry[i] = lancha;
                    break;
                default:
                    throw new AssertionError();
            }
            /**
             * Incremento del índice de creación de Vehículos.
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

            System.out.println(j + 1 + ". " + vehiculosferry[j].PrintType());
            vehiculosferry[j].PrintData();

        }
    }

}
