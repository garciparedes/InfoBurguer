package restaurante;
/**
 * Clase <code>Complemento</code>.
 *
 * Hereda de la clase <code>Alimento</code>.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Complemento extends Alimento {


    private static final String ERROR_COMENSALES = "Los comensales no pueden ser negativos.";


    private int comensales;


    /**
     * Constructor de la clase <code>Complemento</code>.
     *
     * @param nombre String con el nombre de <code>Complemento</code>.
     * @param descripcion String con la descripcion de <code>Complemento</code>.
     * @param precio Double con el precio de <code>Complemento</code>.
     * @param calorias Integer con el numero de calorias de <code>Complemento</code>.
     * @param comensales Integer con el numero de comensales de <code>Complemento</code>.
     *
     * @exception IllegalArgumentException si el valor de comensales es menor que uno.
     */
    public Complemento(String nombre, String descripcion, double precio, int calorias, int comensales){
        super(nombre, descripcion, precio, calorias);

        if (comensales < 1) {
            throw new IllegalArgumentException(ERROR_COMENSALES);
        }
        this.comensales = comensales;
    }


    /**
     * Setter del atributo <code>comensales</code>.
     *
     * @param comensales Integer con el numero de comensales de <code>Complemento</code>.
     */
    public void setComensales(int comensales) {
        if (comensales < 1) {
            throw new IllegalArgumentException(ERROR_COMENSALES);
        }
        this.comensales = comensales;
    }


    /**
     * Getter del atributo <code>comensales</code>.
     *
     * @return comensales Integer con el numero de comensales de <code>Complemento</code>.
     */
    public int getComensales() {
        return comensales;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase <code>Producto</code>.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx  Comensales: xxxx
     *
     * @return String con el contenido de <code>Complemento</code>.
     */
    @Override
    public String toString() {
        return super.toString()
                + ",  Comensales: " + comensales;
    }
}
