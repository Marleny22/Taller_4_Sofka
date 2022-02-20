
package ejercicio5;

import java.util.Date;

/**
 * Esta clase permite la instanciación de objetos de la clase Bike mediante el
 * constructor y da acceso a los métodos get de todos los atributos del los
 * objetos de la clase Bike,el método PrintData que permite la impresión de los
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
public class Bike extends Vehicle {

    /**
     * Representa el tamaño del aro de la bicicleta en pulgadas.
     */
    public int ringsize;
    /**
     * Representa el número de ruedas de la bicicleta.
     */
    public int wheels;
    /**
     * Representa si la bicicleta es de montaña, de ruta, o urbana.
     */
    public String type;

    /**
     * Constructor que permite la instanciación de objetos de la clase Bike o
     * bicicleta que hereda algunos atributos de la clase Vehicle o vehículo, y
     * también tiene sus propios atributos.
     *
     * @param passengernumber Número de pasajeros.
     * @param crew Estado de la tripulación.
     * @param enrollmentdate Fecha de registro de la bicicleta.
     * @param meanstravel Medio por el que se desplaza.
     * @param brand Marca de la bicicleta.
     * @param ringsize Tamaño del aro.
     * @param type Tipo de bicicleta.
     */
    public Bike(int passengernumber, boolean crew, Date enrollmentdate, String meanstravel, String brand, int ringsize, String type) {
        super(passengernumber, crew, enrollmentdate, meanstravel, brand);
        this.wheels = 2;
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
        String type = "Bicicleta";
        return type;
    }

}
