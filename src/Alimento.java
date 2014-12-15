/**
 * Created by garciparedes on 15/12/14.
 */
public abstract class Alimento extends Producto{


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
    public Alimento(String nombre, String descripcion, double precio, int calorias){
        super(nombre, descripcion);
        this.precio = precio;
        this.calorias = calorias;
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
     * Setter del atributo calorias.
     *
     * @param calorias Integer con el numero de calorias.
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }


    /**
     * Getter del atributo precio.
     *
     * @return Precio Double con el precio del producto.
     */
    public double getPrecio() {
        return precio;
    }


    /**
     * Getter del atributo calorias.
     *
     * @return calorias Integer con el numero de calorias.
     */
    public int getCalorias() {
        return calorias;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase Object.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx
     *
     * @return String con el contenido de producto.
     */
    @Override
    public String toString() {


        return (super.toString()
                + "  Precio: " + getPrecio()
                + "  Calorias: " + getCalorias()
        );
    }
}
