import java.util.ArrayList;

/**
 * Clase Combo.
 *
 * Hereda de la clase Producto.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Combo extends Producto {


    private ArrayList<Producto> productos;


    /**
     * Constructor de la clase Combo.
     *
     * @param nombre String con el nombre del Combo.
     * @param descripcion String con la descripcion del Combo.
     */
    public Combo(String nombre, String descripcion){
        super(nombre, descripcion);
        this.productos = new ArrayList<Producto>();
    }


    /**
     * Setter del atributo productos.
     *
     * @param productos Arraylist de productos  que componen el Combo.
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    /**
     * Getter del atributo productos.
     *
     * @return productos ArrayLis de productos que componen el Combo.
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }


    /**
     * Getter del atributo calorias.
     *
     * Para calcular el numero de calorias se suman las de los productos que componen el combo.
     *
     * @return totalCalorias Integer con el numero total de calorias del combo.
     */
    @Override
    public int getCalorias() {
        int totalCalorias = 0;

        for (int i = 0 ; i < getProductos().size() ; i++){
            totalCalorias += getProductos().get(i).getCalorias();
        }

        return totalCalorias;
    }


    /**
     * Getter del atributo precio.
     *
     * Para calcular el precio se realiza la suma del de sus productos y a este se le resta el 20%.
     *
     * @return totalPrecio Double con el precio total del combo.
     */
    @Override
    public double getPrecio() {
        double totalPrecio = 0;

        for (int i = 0 ; i < getProductos().size() ; i++){
            totalPrecio += getProductos().get(i).getPrecio();
        }

        totalPrecio = totalPrecio - 0.2*totalPrecio;

        return totalPrecio;
    }


    public void addProducto(Producto producto){
        if (!(producto instanceof Combo)){
            getProductos().add(producto);
        }

    }
}
