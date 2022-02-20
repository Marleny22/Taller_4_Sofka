
package ejercicio5;

import java.util.Date;

/**
 * Esta clase permite la instanciación de objetos de la clase Launch mediante el
 * constructor y da acceso a los métodos get de todos los atributos del los
 * objetos de la clase Launch,el método PrintData que permite la impresión de
 * los atributos de un objeto instanciado y el método PrintType que muestra el
 * tipo de vehículo que representa el objeto. Esta clase extiende de la clase
 * Vehicle de donde hereda algunos atributos y métodos.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Launch extends Vehicle {

    /**
     * Representa la ubicación del motor in--> dentro de la borda, out--> fuera
     * de la borda, in-out --> dentro y fuera de la borda.
     */
    public String motorlocation;

    /**
     * Constructor que permite la instanciación de objetos de tipo Launch o
     * lancha que hereda algunos atributos de la clase Vehicle o vehículo, y
     * también tiene sus propios atributos.
     *
     * @param passengernumber Número de pasajeros.
     * @param crew Estado de tripulación.
     * @param enrollmentdate Fecha de registro de la lancha.
     * @param meanstravel Medio por el que se desplaza.
     * @param brand Marca de la lancha.
     * @param motorlocation Ubicación del motor.
     */
    public Launch(int passengernumber, boolean crew, Date enrollmentdate, String meanstravel, String brand, String motorlocation) {
        super(passengernumber, crew, enrollmentdate, meanstravel, brand);
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
        String type = "Lancha";
        return type;
    }

}
