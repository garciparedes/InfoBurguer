/**
 * Clase Hamburguesa.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Hamburguesa extends Producto {


    private String ingredientes;


    /**
     * Constructor de la clase Hamburguesa.
     *
     * @param nombre String con el nombre de la hamburguesa.
     * @param descripcion String con la descripcion de la hamburguesa.
     * @param precio Double con el precio de la hamburguesa.
     * @param calorias Integer con el numero de calorias de la hamburguesa.
     * @param ingredientes String con los ingredientes de la hamburguesa.
     */
    public Hamburguesa(String nombre, String descripcion, double precio, int calorias, String ingredientes){
        super(nombre, descripcion, precio, calorias);
        this.ingredientes = ingredientes;
    }


    /**
     * Setter del atributo ingredientes.
     *
     * @param ingredientes String con los ingredientes de la Hamburguesa.
     */
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


    /**
     * Getter del atributo ingredientes.
     *
     * @return ingredientes
     */
    public String getIngredientes() {
        return ingredientes;
    }
}
