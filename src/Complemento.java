/**
 * Clase Complemento.
 *
 * Hereda de la clase Producto.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Complemento extends Producto {


    private int comensales;


    /**
     * Constructor de la clase Complemento.
     *
     * @param nombre String con el nombre del complemento.
     * @param descripcion String con la descripcion del complemento.
     * @param precio Double con el precio del complemento.
     * @param calorias Integer con el numero de calorias del complemento.
     * @param comensales Integer con el numero de comensales del complemento.
     */
    public Complemento(String nombre, String descripcion, Double precio, int calorias, int comensales){
        super(nombre, descripcion, precio, calorias);
        this.comensales = comensales;
    }


    /**
     * Setter del atributo comensales.
     *
     * @param comensales Integer con el numero de comensales del complemento.
     */
    public void setComensales(int comensales) {
        this.comensales = comensales;
    }


    /**
     * Getter del atributo comensales.
     *
     * @return comensales Integer con el numero de comensales del complemento.
     */
    public int getComensales() {
        return comensales;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase Producto.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx  Comensales: xxxx
     *
     * @return String con el contenido de Complemento.
     */
    @Override
    public String toString() {
        return super.toString()
                + "  Comensales: " + comensales;
    }
}
