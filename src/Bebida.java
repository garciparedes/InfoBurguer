/**
 * Created by garciparedes on 3/12/14.
 */


public class Bebida  extends Producto{

    private String tipo;


    public Bebida(String nombre, String descripcion, double precio, int calorias, String tipo){
        super(nombre, descripcion, precio,calorias);
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "  Tipo: " +getTipo();
    }
}
