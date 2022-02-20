package ejercicio1;

/**
 * Esta clase tiene como propósito el generar la descripción de un Sistema
 * planetario, y además se relaciona en ella el método abstracto para obtener la
 * fuerza de atraccón gravitacional entre dos cuerpos.
 *
 * @version [1.00.000 2022-02-14]
 *
 *
 * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public abstract class Planetary_system {

    /**
     * Este atributo representa la masa en Kg del cuerpo celeste que hace parte
     * del Sistema planetario.
     */
    public double mass;
    /**
     * Este atributo representa la densidad en g/cm^3 del cuerpo celeste que
     * hace parte del Sistema planetario.
     */
    public double density;
    /**
     * Este atributo representa el diámetro en Km del cuerpo celeste que hace
     * parte del Sistema planetario.
     */
    public double diameter;
    /**
     * Este atributo representa la distancia al sol en m del cuerpo celeste que
     * hace parte del Sistema planetario.
     */
    public double distanceFromTheSun;
    /**
     * Este atributo representa la Identificación del cuerpo celeste que hace
     * parte del Sistema planetario.
     */
    public int ID;
    /**
     * Este atributo representa el nombre del cuerpo celeste que hace parte del
     * Sistema planetario.
     */
    public String name;

    /**
     * Constructor que hereda a las clases planeta y estrella los siguientes
     * atributos que estan dispuestos como parámetros para la creación de un
     * planeta o estrella.
     *
     * @param mass Masa.
     * @param density Densidad
     * @param diameter Diámetro
     * @param distanceFromTheSun Distancia al sol
     * @param ID Identificación.
     * @param name Nombre
     */
    public Planetary_system(double mass, double density, double diameter, double distanceFromTheSun, int ID, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceFromTheSun = distanceFromTheSun;
        this.ID = ID;
        this.name = name;
    }

    public Planetary_system() {
    }

    /**
     * El método GetGravitationalAttraction permite el cálculo de la fuerza de
     * atracción gravitacional entre dos cuerpos celestes. Éste es un método
     * abstracto que hereda a las clases planeta y estrella.
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
     */
    public abstract double GetGravitationalAttraction(Planetary_system[] Sistema_solar, String celestialbody1, String celestialbody2);

}
