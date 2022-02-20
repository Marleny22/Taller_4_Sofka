package ejercicio4;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Esta clase permite la instanciación de objetos de la clase Vehicle mediante
 * el constructor y da acceso a los métodos get de todos los atributos del
 * vehículo y el método PrintData que permite la impresión de los atributos de
 * un objeto instanciado.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Vehicle {

    /**
     * Representa la cantidad de pasajeros del vehículo.
     */
    private int passengernumber;
    /**
     * Representa la presencia o ausencia de tripulación. True --> presencia de
     * tripulación. False --> ausencia de tripulación.
     */
    private boolean crew;
    /**
     * Representa la cantidad de ruedas del vehículo.
     */
    private int wheelsnumber;
    /**
     * Representa la fecha de registro del vehículo.
     */
    private Date enrollmentdate;
    /**
     * Representa el medio por el que se desplaza el vehículo.
     */
    private String meanstravel;
    /**
     * Representa la marca del vehículo.
     */
    private String brand;

    /**
     * Contructor que permite la instanciación de objetos de la clase Vehículo
     * con los siguientes parámetros.
     *
     * @param passengernumber Número de pasajeros.
     * @param crew Estado de vehículo tripulado o no.
     * @param wheelsnumber Número de ruedas.
     * @param enrollmentdate Fecha de registro del vehículo.
     * @param meanstravel Medio por el que se desplaza el vehículo.
     * @param brand Marca del vehículo.
     */
    public Vehicle(int passengernumber, boolean crew, int wheelsnumber, Date enrollmentdate, String meanstravel, String brand) {
        this.passengernumber = passengernumber;
        this.crew = crew;
        this.wheelsnumber = wheelsnumber;
        this.enrollmentdate = enrollmentdate;
        this.meanstravel = meanstravel;
        this.brand = brand;
    }

    /**
     * Método que permite obtener el número de pasajeros del vehículo.
     *
     * @return Número entero de pasajeros.
     */
    public int getPassengernumber() {
        return passengernumber;
    }

    /**
     * Método que permite obtener estado de tripulado del vehículo.
     *
     * @return Estado booleano true--> tripulado, false--> no tripulado.
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Método que permite obtener el número de ruedas del vehículo.
     *
     * @return Número entero de ruedas.
     */
    public int getWheelsnumber() {
        return wheelsnumber;
    }

    /**
     * Método que permite obtener la fecha de registro del vehículo.
     *
     * @return Fecha de registro tipo Date.
     */
    public Date getEnrollmentdate() {
        return enrollmentdate;
    }

    /**
     * Método que permite obtener el medio por el que se desplaza el vehículo.
     *
     * @return Medio de tipo String.
     */
    public String getMeanstravel() {
        return meanstravel;
    }

    /**
     * Método que permite obtener la marca del vehículo.
     *
     * @return Marca de tipo String.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * El método PrintData permite la impresión de los atributos de un objeto de
     * la clase Vehículo.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     *
     */
    public void PrintData() {
        /**
         * Objeto empleado para dar un formato adecuado de forma visible para el
         * usuario a la fecha de registro.
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        /**
         * Impresión de los atributos propios del objeto.
         */
        System.out.println("Los datos del vehículo son: ");
        System.out.println("Cantidad de pasajeros: " + this.passengernumber);
        System.out.println("Tripulación: " + this.crew);
        System.out.println("Ruedas: " + this.wheelsnumber);
        System.out.println("Fecha de registro: " + this.enrollmentdate);
        System.out.println("Medio por el que circula: " + this.meanstravel);
        System.out.println("Marca: " + this.brand);
    }

}
