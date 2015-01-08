/**
 * Clase <code>Alimento</code>.
 *
 * Hereda de la clase <code>Producto</code>.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public abstract class Alimento extends Producto {


    private static final String ERROR_PRECIO = "El precio no puede ser negativo";
    private static final String ERROR_CALORIAS = "Las calorias no pueden ser negativas";


    private double precio;
    private int calorias;


    /**
     * Constructor de la clase <code>Alimento</code>.
     *
     * @param nombre      String con el nombre de <code>Alimento</code>.
     * @param descripcion String que contiene la descripcion de <code>Alimento</code>.
     * @param precio      Double que almacena el precio de <code>Alimento</code>.
     * @param calorias    Integer que almacena el numero de calorias de <code>Alimento</code>.
     *
     * @exception IllegalArgumentException si el valor de precio es menor que 0.
     * @exception IllegalArgumentException si el valor de calorias es menor que 0.
     */
    public Alimento(String nombre, String descripcion, double precio, int calorias) {
        super(nombre, descripcion);

        if (precio < 0) {
            throw new IllegalArgumentException(ERROR_PRECIO);
        }
        this.precio = precio;

        if (calorias < 0) {
            throw new IllegalArgumentException(ERROR_CALORIAS);
        }
        this.calorias = calorias;
    }


    /**
     * Setter del atributo <code>precio</code>.
     *
     * @param precio Double con el precio de <code>Alimento</code>.
     */
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException(ERROR_PRECIO);
        }
        this.precio = precio;
    }


    /**
     * Setter del atributo <code>calorias</code>.
     *
     * @param calorias Integer con el numero de calorias de <code>Alimento</code>.
     */
    public void setCalorias(int calorias) {
        if (calorias < 0) {
            throw new IllegalArgumentException(ERROR_CALORIAS);
        }
        this.calorias = calorias;
    }


    /**
     * Getter del atributo <code>precio</code>.
     *
     * @return Precio Double con el precio de <code>Alimento</code>.
     */
    @Override
    public double getPrecio() {
        return precio;
    }


    /**
     * Getter del atributo <code>calorias</code>.
     *
     * @return calorias Integer con el numero de calorias de <code>Alimento</code>.
     */
    @Override
    public int getCalorias() {
        return calorias;
    }
}
