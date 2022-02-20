
package ejercicio5;

import java.util.Date;

/**
 * Esta clase permite la instanciación de objetos de la clase Car mediante el
 * constructor y da acceso a los métodos get de todos los atributos del los
 * objetos de la clase Car,el método PrintData que permite la impresión de los
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
public class Car extends Vehicle {

    /**
     * Representa la cantidad de puertas del carro, true --> 3 puertas, false-->
     * 5 puertas.
     */
    public boolean doors;
    /**
     * Representa las ruedas del carro.
     */
    public int wheels;

    /**
     * Constructor que permite la instanciación de objetos de la clase Car o
     * coche que hereda algunos atributos de la clase Vehicle o vehículo, y
     * también tiene sus propios atributos.
     *
     * @param passengernumber Número de pasajeros.
     * @param crew Estado de la tripulación.
     * @param enrollmentdate Fecha de registro del carro.
     * @param meanstravel Medio por el que se desplaza.
     * @param brand Marca del Coche.
     * @param doors Número de puertas del carro.
     */
    public Car(int passengernumber, boolean crew, Date enrollmentdate, String meanstravel, String brand, boolean doors) {
        super(passengernumber, crew, enrollmentdate, meanstravel, brand);
        this.wheels = 4;

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
        String type = "Coche";
        return type;
    }

}
