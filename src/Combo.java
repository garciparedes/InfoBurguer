import java.util.ArrayList;

/**
 * Clase Combo.
 * Hereda de la clase Producto.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Combo extends Producto {


    private ArrayList<Producto> productos;


    public Combo(String nombre, String descripcion, ArrayList<Producto> productos){
        super(nombre, descripcion);
        this.productos = productos;
    }


    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    @Override
    public int getCalorias() {
        return super.getCalorias();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }
}
