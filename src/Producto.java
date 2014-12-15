/**
 * Clase abstracta para modelar los productos.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public abstract class Producto {


    private String nombre;
    private String descripcion;


    /**
     * Constructor de la clase producto.
     *
     * @param nombre String con el nombre del producto.
     * @param descripcion String que contiene la descripcion del producto.
     */
    public Producto(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    /**
     * Setter del atributo nombre.
     *
     * @param nombre String con el nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Setter del atributo descripcion.
     *
     * @param descripcion String con la descripcion del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Getter del atributo nombre.
     *
     * @return nombre String con el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Getter del atributo descripcion.
     *
     * @return descripcion String con la descripcion del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase Object.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx
     *
     * @return String con el contenido de producto.
     */
    @Override
    public String toString() {


        return ("Nombre: " + getNombre()
                + "  Descripcion: " + getDescripcion()
        );
    }
}
