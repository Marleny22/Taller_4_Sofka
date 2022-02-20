
package ejercicio5;

import java.util.Date;

/**
 * Esta clase permite la instanciación de objetos de la clase Truck mediante el
 * constructor y da acceso a los métodos get de todos los atributos del los
 * objetos de la clase Truck,el método PrintData que permite la impresión de los
 * atributos de un objeto instanciado y el método PrintType que muestra el tipo
 * de vehículo que representa el objeto. Esta clase extiende de la clase Vehicle
 * de donde hereda algunos atributos y métodos.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Truck extends Vehicle {

    /**
     * Representa el número de ejes del camión.
     */
    public int numberofaxles;
    /**
     * Representa las ruedas del camión.
     */
    public int wheels;
    /**
     * Representa la altura del camión en metros.
     */
    public double height;

    /**
     * Constructor que permite la instanciación de objetos de tipo Truck o
     * Camión que hereda algunos atributos de la clase Vehicle o vehículo, y
     * también tiene sus propios atributos.
     *
     * @param passengernumber Número de pasajeros.
     * @param crew Estado de tripulación.
     * @param enrollmentdate Fecha de registro.
     * @param meanstravel Medio por el que se desplaza.
     * @param brand Marca.
     * @param numberofaxles Número de ejes.
     * @param height Altura.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     */
    public Truck(int passengernumber, boolean crew, Date enrollmentdate, String meanstravel, String brand, int numberofaxles, double height) {
        super(passengernumber, crew, enrollmentdate, meanstravel, brand);
        if (numberofaxles == 2) {
            this.wheels = 4;
            /*Representa un camión sencillo de dos ejes con cuatro ruedas.*/
        } else if (numberofaxles == 3) {
            this.wheels = 6;
            /*Representa un Dobletroque de tres ejes con seis ruedas.*/
        } else if (numberofaxles == 4) {
            this.wheels = 8;
            /*Representa un Camión de cuatro ejes con ocho ruedas.*/
        }
    }

    /**
     * Método PrintType que permite la obtención del tipo de objeto que crea
     * esta clase.
     *
     * @return Tipo de objeto.
     * 
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     */
    @Override
    public String PrintType() {
        String type = "Camión";
        return type;
    }

}
