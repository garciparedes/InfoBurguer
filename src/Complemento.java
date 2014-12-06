/**
 * Created by garciparedes on 3/12/14.
 */
public class Complemento extends Producto{

    private int comensales;

    public Complemento(String nombre, String descripcion, Double precio, int calorias, int comensales){
        super(nombre, descripcion, precio, calorias);
        this.comensales = comensales;

    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public int getComensales() {
        return comensales;
    }

    @Override
    public String toString() {
        return super.toString()
                + "  Comensales: " + comensales;
    }
}
