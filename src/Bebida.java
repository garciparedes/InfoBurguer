/**
 * Clase Bebida.
 * Hereda de la clase Producto.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Bebida  extends Producto {


    private String tipo;


    /**
     * Constructor de la clase bebida.
     *
     * @param nombre String con el nombre de la bebida.
     * @param descripcion String con la descripcion de la bebida.
     * @param precio Double con el precio de la bebida.
     * @param calorias Integer con el numero de calorias de la bebida.
     * @param tipo String con el tipo de la bebida (Normal, Sin Cafeina o Sin Azucar).
     */
    public Bebida(String nombre, String descripcion, double precio, int calorias, String tipo){
        super(nombre, descripcion, precio,calorias);
        this.tipo = tipo;
    }


    /**
     * Setter del atributo tipo.
     *
     * @param tipo String con el tipo de la bebida.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Getter del atributo tipo.
     *
     * @return comensales String con el tipo de la bebida.
     */
    public String getTipo() {
        return tipo;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase Producto.
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx  Tipo: xxxxxxxx
     *
     * @return String con el contenido de Bebida.
     */
    @Override
    public String toString() {
        return super.toString()
                + "  Tipo: " +getTipo();
    }
}
