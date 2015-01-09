package restaurante;
/**
 * Clase <code>Producto</code>
 *
 * Es una clase abstracta para modelar los productos.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public abstract class Producto {


    private String nombre;
    private String descripcion;
    private static final String ERROR_NOMBRE = "El nombre no puede ser nulo.";
    private static final String ERROR_DESCRIPCION = "La descripcion no puede ser nula.";


    /**
     * Constructor de la clase <code>Producto</code>.
     *
     * @param nombre String con el nombre de <code>Producto</code>.
     * @param descripcion String que contiene la descripcion de <code>Producto</code>.
     */
    public Producto(String nombre, String descripcion){
    	
    	if (nombre == null) {
            throw new IllegalArgumentException(ERROR_NOMBRE);
        }
        this.nombre = nombre;
        
        if (descripcion == null) {
            throw new IllegalArgumentException(ERROR_DESCRIPCION);
        }
        this.descripcion = descripcion;
    }


    /**
     * Setter del atributo <code>nombre</code>.
     *
     * @param nombre String con el nombre de <code>Producto</code>.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Setter del atributo <code>descripcion</code>.
     *
     * @param descripcion String con la descripcion de <code>Producto</code>.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Getter del atributo <code>nombre</code>.
     *
     * @return nombre String con el nombre de <code>Producto</code>.
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Getter del atributo <code>descripcion</code>.
     *
     * @return descripcion String con la descripcion de <code>Producto</code>.
     */
    public String getDescripcion() {
        return descripcion;
    }


    /**
     * Getter del atributo <code>precio</code>.
     *
     * Metodo abstracto.
     *
     * @return precio Double con el precio de <code>Producto</code>.
     */
    public abstract double getPrecio();


    /**
     * Getter del atributo <code>calorias</code>.
     *   
     * Metodo abstracto.
     *
     * @return calorias Integer con las calorias de <code>Producto</code>.
     */
    public abstract int getCalorias();


    /**
     * Metodo que sobreescribe el metodo toString() de la clase <code>Object</code>.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx
     *
     * @return String con el contenido de <code>Producto</code>.
     */
    @Override
    public String toString() {
        return ("Nombre: " + getNombre()
                + ",  Descripcion: " + getDescripcion()
                + ",  Precio: " + getPrecio()
                + ",  Calorias: " + getCalorias()
        );
    }
}
