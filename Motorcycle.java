package ejercicio5;

import java.util.Date;

/**
 * Esta clase permite la instanciación de objetos de la clase Motorcycle
 * mediante el constructor y da acceso a los métodos get de todos los atributos
 * del los objetos de la clase Motorcycle o motocicleta,el método PrintData que permite la
 * impresión de los atributos de un objeto instanciado y el método PrintType que
 * muestra el tipo de vehículo que representa el objeto. Esta clase extiende de
 * la clase Vehicle de donde hereda algunos atributos y métodos.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Motorcycle extends Vehicle {

    /**
     * Representa el estado de la moto con o sin sidecar o carro lateral. True
     * --> con sidecar, False --> sin sidecar.
     */
    public boolean hassidecar;
    /**
     * Representa las ruedas de la moto.
     */
    public int wheels;

    /**
     * Constructor que permite la instanciación de objetos de tipo Motorcycle o
     * Motocicleta que hereda algunos atributos de la clase Vehicle o vehículo,
     * y también tiene sus propios atributos.
     *
     * @param passengernumber Número de pasajeros.
     * @param crew Estado de la tripulación de la moto.
     * @param enrollmentdate Fecha de registro de la moto.
     * @param meanstravel Medio por el que se desplaza.
     * @param brand Marca de la moto.
     * @param hassidecar Estado del Sidecar o carro lateral.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     */
    public Motorcycle(int passengernumber, boolean crew, Date enrollmentdate, String meanstravel, String brand, boolean hassidecar) {
        super(passengernumber, crew, enrollmentdate, meanstravel, brand);
        /**
         * Condicional que establece el número de ruedas de la motocicleta si es
         * que esta cuenta con sidecar.
         */
        if (hassidecar == true) {
            this.wheels = 3;
        } else {
            this.wheels = 2;
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
        String type = "Motocicleta";
        return type;
    }

}
