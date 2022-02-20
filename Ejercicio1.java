package ejercicio1;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Marleny Fernández Sandoval.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /**
         * Variable que representa la atracción gravitacional de dos cuerpos.
         */
        double F;
        /**
         * Variable que almacena el nombre del índice que representa el cuerpo
         * celeste 1 y posteriormente actualiza al nombre real.
         */
        String cuerpo1;
        /**
         * Variable que almacena el nombre del índice que representa el cuerpo
         * celeste 2 y posteriormente actualiza al nombre real.
         */
        String cuerpo2;
        /**
         * Variable auxiliar para validación del valor númerico ingresado por
         * teclado dentro de las opciones del menú.
         */
        int aux;

        /**
         * Implementación de constructor planeta que permite acceder al método
         * GetGravitationalAttraction.
         *
         */
        Planet planeta = new Planet();
        /**
         * Instanciación de los objetos de la clase planeta con sus
         * características predefinidas.
         */
        Planet Mercurio = new Planet(3.285 * 1E23, 5.43, 4879.4, 57.91 * 1E9, 2, "Mercurio");
        Planet Venus = new Planet(4.867 * 1E24, 5.24, 12104, 108.2 * 1E9, 3, "Venus");
        Planet Tierra = new Planet(5.9722 * 1E24, 5.51, 12742, 147.86 * 1E9, 4, "Tierra");
        Planet Marte = new Planet(6.39 * 1E23, 3.93, 6779, 227.94 * 1E9, 5, "Marte");
        Planet Jupiter = new Planet(1.898 * 1E27, 1.33, 139820, 778.33 * 1E9, 6, "Jupiter");
        Planet Saturno = new Planet(5.683 * 1E26, 0.687, 116460, 1429.4 * 1E9, 7, "Saturno");
        Planet Urano = new Planet(8.681 * 1E25, 1.27, 50724, 2810.99 * 1E9, 8, "Urano");
        Planet Neptuno = new Planet(1.024 * 1E26, 1.64, 49244, 4504.3 * 1E9, 9, "Neptuno");

        /**
         * Instanciación del objeto estrella que representa el cuerpo central
         * del sistema planetario.
         */
        Star Sol = new Star(1.989 * 1E30, 1.41, 1.3927 * 10E6, 0, 1, "Sol");

        /**
         * Instanciación del sistema solar de la clase Sistema planetario, el
         * cual es un arreglo que almacena objetos de la clase planeta y
         * estrella y contiene al sol y los demás planetas del sistema solar.
         */
        Planetary_system[] Sistema_solar = new Planetary_system[9];

        /**
         * Almacenamiento de los planetas y el sol en el arreglo sistema solar.
         */
        Sistema_solar[0] = Sol;
        Sistema_solar[1] = Mercurio;
        Sistema_solar[2] = Venus;
        Sistema_solar[3] = Tierra;
        Sistema_solar[4] = Marte;
        Sistema_solar[5] = Jupiter;
        Sistema_solar[6] = Saturno;
        Sistema_solar[7] = Urano;
        Sistema_solar[8] = Neptuno;

        /**
         * Instanciación del objeto k para lectura de datos por teclado.
         */
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Menú para la selección de los cuerpos celestes de los cuales se
         * quiere hacer el cáculo de la fuerza de atracción gravitacional.
         */
        System.out.println("Bienvenido al Ejercicio de Sistema Planetario");
        System.out.println("El modelo realizado representa al sistema solar y esta compuesto por una estrella y "
                + "algunos planetas");
        System.out.println("Estrella: ");
        System.out.println("0. Sol");
        System.out.println("Los planetas son:");
        System.out.println("1. Mercurio");
        System.out.println("2. Venus");
        System.out.println("3. Tierra");
        System.out.println("4. Marte");
        System.out.println("5. Jupiter");
        System.out.println("6. Saturno");
        System.out.println("7. Urano");
        System.out.println("8. Neptuno");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Ingrese el identificador de los cuerpos celestes para los cuales desea calcular "
                + "la fuerza de atracción gravitatoria");
        /**
         * Validación de las opciones ingresadas por teclado dentro de los
         * valores adecuados facilitando el ingreso de un valor entero en vez de
         * un String para el nombre del cuerpo celeste.
         */
        do {
            System.out.print("Cuerpo Nº 1:");
            cuerpo1 = k.readLine();
            /**
             * Manejo de excepción cuando se ingresa un valor que no es numerico
             * para la asignación de los cuerpos celestes.
             */
            try {
                aux = Integer.parseInt(cuerpo1);
            } catch (NumberFormatException e) {
                System.out.println("Este no es un valor númerico");
                aux = 10;

            }

        } while (aux != 0 && aux != 1 && aux != 2 && aux != 3 && aux != 4 &&
                aux != 5 && aux != 6 && aux != 7 && aux != 8);
        do {
            System.out.print("Cuerpo Nº 2:");
            cuerpo2 = k.readLine();
            /**
             * Manejo de excepción cuando se ingresa un valor que no es numerico
             * para la asignación de los cuerpos celestes.
             */
            try {
                aux = Integer.parseInt(cuerpo2);
            } catch (NumberFormatException e) {
                System.out.println("Este no es un valor númerico");
                aux = 10;

            }
        } while (aux != 0 && aux != 1 && aux != 2 && aux != 3 && aux != 4 &&
                aux != 5 && aux != 6 && aux != 7 && aux != 8);
        /**
         * Asignación del nombre del cuerpo celeste 1 como un String despúes de
         * evaluar el ingreso como un número.
         */
        switch (cuerpo1) {
            case "0":
                cuerpo1 = "Sol";
                break;
            case "1":
                cuerpo1 = "Mercurio";
                break;
            case "2":
                cuerpo1 = "Venus";
                break;
            case "3":
                cuerpo1 = "Tierra";
                break;
            case "4":
                cuerpo1 = "Marte";
                break;
            case "5":
                cuerpo1 = "Jupiter";
                break;
            case "6":
                cuerpo1 = "Saturno";
                break;
            case "7":
                cuerpo1 = "Urano";
                break;
            case "8":
                cuerpo1 = "Neptuno";
                break;
            default:
                throw new AssertionError();
        }
        /**
         * Asignación del nombre del cuerpo celeste 2 como un String despúes de
         * evaluar el ingreso como un número.
         */
        switch (cuerpo2) {
            case "0":
                cuerpo2 = "Sol";
                break;
            case "1":
                cuerpo2 = "Mercurio";
                break;
            case "2":
                cuerpo2 = "Venus";
                break;
            case "3":
                cuerpo2 = "Tierra";
                break;
            case "4":
                cuerpo2 = "Marte";
                break;
            case "5":
                cuerpo2 = "Jupiter";
                break;
            case "6":
                cuerpo2 = "Saturno";
                break;
            case "7":
                cuerpo2 = "Urano";
                break;
            case "8":
                cuerpo2 = "Neptuno";
                break;
            default:
                throw new AssertionError();
        }
        /**
         * Evaluación del método de cálculo de la Fuerza de atracción
         * gravitacional con los dos cuerpos celestes ingresados.
         */
        F = planeta.GetGravitationalAttraction(Sistema_solar, cuerpo1, cuerpo2);
        System.out.println("______________________________________________________________________________________________");
        /**
         * Impresión en pantalla del valor calculado mediante el método.
         */
        System.out.println("La fuerza de atracción gravitacional entre " + cuerpo1 + " y " + cuerpo2 + " es: " + F+" N.");

    }

}
