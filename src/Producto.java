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
    private double precio;
    private int calorias;


    /**
     * Constructor de la clase producto.
     *
     * @param nombre String con el nombre del producto.
     * @param descripcion String que contiene la descripcion del producto.
     * @param precio Double que almacena el precio del producto.
     * @param calorias Integer que almacena el numero de calorias del producto.
     */
    public Producto(String nombre, String descripcion, double precio, int calorias){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.calorias = calorias;
    }


    /**
     * Setter del atributo nombre.
     * @param nombre String con el nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Setter del atributo calorias.
     *
     * @param calorias Integer con el numero de calorias.
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
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
     * Setter del atributo precio.
     *
     * @param precio Double con el precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    /**
     * Getter del atributo nombre.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Getter del atributo precio.
     * @return Precio
     */
    public double getPrecio() {
        return precio;
    }


    /**
     * Getter del atributo calorias.
     *
     * @return calorias
     */
    public int getCalorias() {
        return calorias;
    }


    /**
     * Getter del atributo descripcion.
     *
     * @return descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase Object.
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx
     *
     * @return String con el contenido de producto.
     */
    @Override
    public String toString() {


        return ("Nombre: " + getNombre()
                + "  Descripcion: " + getDescripcion()
                + "  Precio: " + getPrecio()
                + "  Calorias: " + getCalorias()
        );
    }
}
