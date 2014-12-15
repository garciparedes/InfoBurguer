/**
 * Clase Hamburguesa.
 *
 * Hereda de la clase Producto.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Hamburguesa extends Alimento {


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
     * @return ingredientes String con los ingredientes de la Hamburguesa.
     */
    public String getIngredientes() {
        return ingredientes;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase Producto.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx  Ingredientes: xxxxxxxxxxxx
     *
     * @return String con el contenido de hamburguesa.
     */
    @Override
    public String toString() {
        return super.toString()
                + "  Ingredientes: " + getIngredientes();
    }
}
