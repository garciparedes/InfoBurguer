package restaurante;
/**
 * Clase <code>Hamburguesa</code>.
 *
 * Hereda de la clase <code>Alimento</code>.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Hamburguesa extends Alimento {


    private String ingredientes;


    /**
     * Constructor de la clase <code>Hamburguesa</code>.
     *
     * @param nombre String con el nombre de <code>Hamburguesa</code>.
     * @param descripcion String con la descripcion de <code>Hamburguesa</code>.
     * @param precio Double con el precio de <code>Hamburguesa</code>.
     * @param calorias Integer con el numero de calorias de <code>Hamburguesa</code>.
     * @param ingredientes String con los ingredientes de <code>Hamburguesa</code>.
     */
    public Hamburguesa(String nombre, String descripcion, double precio, int calorias, String ingredientes){
        super(nombre, descripcion, precio, calorias);
        this.ingredientes = ingredientes;
    }


    /**
     * Setter del atributo <code>ingredientes</code>.
     *
     * @param ingredientes String con los ingredientes de <code>Hamburguesa</code>.
     */
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


    /**
     * Getter del atributo <code>ingredientes</code>.
     *
     * @return ingredientes String con los ingredientes de <code>Hamburguesa</code>.
     */
    public String getIngredientes() {
        return ingredientes;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase <code>Alimento</code>.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx  Ingredientes: xxxxxxxxxxxx
     *
     * @return String con el contenido de <code>Hamburguesa</code>.
     */
    @Override
    public String toString() {
        return super.toString()
                + ",  Ingredientes: " + getIngredientes();
    }
}
