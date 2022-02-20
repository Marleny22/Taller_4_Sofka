package ejercicio1;

/**
 * Esta clase permite la instanciación de objetos de tipo Estrella como cuerpo
 * central del sistema planetario, hereda los atributos del sistema planetario y
 * un método obstracto.
 *
 * @version [1.0.0 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Star extends Planetary_system {

    /**
     * Contructor de la clase para la instanciación de objetos de tipo Estrella
     * de un sistema planetario.
     *
     * @param mass Masa del cuerpo celeste.
     * @param density Densidad del cuerpo celeste.
     * @param diameter Diámetro del cuerpo celeste.
     * @param distanceFromTheSun Distancia al sol del cuerpo celeste, para este
     * objeto este atributo siempre tiene valor de cero en el sistema solar.
     * @param ID Identificación del cuerpo celeste.
     * @param name Nombre del cuerpo celeste.
     */
    public Star(double mass, double density, double diameter, double distanceFromTheSun, int ID, String name) {
        super(mass, density, diameter, distanceFromTheSun, ID, name);
        this.distanceFromTheSun = 0;
    }

    /**
     * El método GetGravitationalAttraction permite el cálculo de la fuerza de
     * atracción gravitacional entre dos cuerpos celestes. Éste es un método
     * abstracto que hereda a la clase Estrella de Planetary_system o sistema
     * planetario.
     *
     * @param Sistema_solar Arreglo de los objetos que representan los cuerpos
     * celestes que hacen parte del sistema solar con sus atributos.
     * @param celestialbody1 Cuerpo celeste 1.
     * @param celestialbody2 Cuerpo celeste 2.
     * @return Fuerza de atracción gravitacional entre los dos cuerpos en N.
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.0.0]
     *
     *
     */
    @Override
    public double GetGravitationalAttraction(Planetary_system[] Sistema_solar, String celestialbody1, String celestialbody2) {

        /* Variable que almacena el valor de la distancia del cuerpo celeste 1 al sol.*/
        double d1 = 0;
        /* Variable que almacena el valor de la distancia del cuerpo celeste 2 al sol.*/
        double d2 = 0;
        /* Variable que almacena el valor de la mas del cuerpo celeste 1.*/
        double m1 = 0;
        /* Variable que almacena el valor de la mas del cuerpo celeste 2.*/
        double m2 = 0;
        /* Variable que almacena el valor absoluto de la diferencia de las dos distancias. */
        double d;
        /* Variable que almacena el cuadrado de la distancia media de los dos cuerpos celestes.*/
        double dcuadrado;
        /* Variable que almacena el valor a retornar del método, que es la fuerza de atracción gravitacional.*/
        double F;
        /*Representa la constante de gravitación universal en Nm^2/kg^2.*/
        double G = 6.77 * 10E-11;

        /**
         * For que recorre el arreglo de los objetos del sistema solar.
         */
        for (int i = 0; i < Sistema_solar.length; i++) {
            /**
             * Condicionales que evalúan los nombres de los cuerpos celestes
             * ingresados por el usuario y los comparan con los presentes en el
             * arreglo de sistema solar para almacenar sus distancias y masas.
             */
            if (Sistema_solar[i].name.equals(celestialbody1)) {
                d1 = Sistema_solar[i].distanceFromTheSun;
                m1 = Sistema_solar[i].mass;
            }
            if (Sistema_solar[i].name.equals(celestialbody2)) {
                d2 = Sistema_solar[i].distanceFromTheSun;
                m2 = Sistema_solar[i].mass;
            }

        }
        /**
         * Cálculo de la distancia media entre los dos cuerpos tomando en cuenta
         * la distancia de los mismos al sol.
         */
        d = Math.abs(d1 - d2);
        /**
         * Cálculo de la distancia media al cuadrado de los dos cuerpos
         * celestes.
         */
        dcuadrado = Math.pow(d, 2);
        /**
         * Cálculo de la Fuerza mediante la fórmula de la fueza de atracción
         * gravitacional F = (G*(m1*m2))/d^2.
         */
        F = (G * (m1 * m2)) / dcuadrado;

        return F;
    }

}
