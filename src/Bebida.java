/**
 * Clase Bebida.
 * Hereda de la clase Producto.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Bebida  extends Producto {


    private boolean azucar;
    private boolean cafeina;


    /**
     * Constructor de la clase bebida.
     *
     * @param nombre String con el nombre de la bebida.
     * @param descripcion String con la descripcion de la bebida.
     * @param precio Double con el precio de la bebida.
     * @param calorias Integer con el numero de calorias de la bebida.
     * @param cafeina Boolean que indica si la bebida tiene cafeina.
     * @param azucar Boolean que indica si la bebida tiene azucar.
     */
    public Bebida(String nombre, String descripcion, double precio, int calorias, boolean azucar, boolean cafeina){
        super(nombre, descripcion, precio,calorias);
        this.azucar = azucar;
        this.cafeina = cafeina;
    }

    /**
     * Setter del atributo azucar.
     *
     * @param azucar Boolean que indica si la bebida tiene azucar.
     */
    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }


    /**
     * Setter del atributo cafeina.
     *
     * @param cafeina Boolean que indica si la bebida tiene cafeina.
     */
    public void setCafeina(boolean cafeina) {
        this.cafeina = cafeina;
    }

    /**
     * Getter del atributo azucar.
     *
     * @return azucar Boolean que indica si la bebida tiene azucar.
     */
    public boolean getAzucar() {
        return azucar;
    }


    /**
     * Getter del atributo cafeina.
     *
     * @return cafeina Boolean que indica si la bebida tiene cafeina.
     */
    public boolean getCafeina() {
        return cafeina;
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
                + "  Azucar: " + boolToString(getAzucar())
                + "  Cafeina: " + boolToString(getCafeina());
    }


    /**
     * Funcion auxiliar destinada a convertir el valor de un booleano a
     * cadena de caracteres en castellano.
     *
     * En el caso de que el booleano se cumpla se imprime "Si".
     * En caso contrario se imprime "No".
     *
     * @param bool Boolean que se convertira a String.
     * @return String con el valor de bool pero como cadena de caracteres en castellano.
     */
    private String boolToString(boolean bool){
        String aCadena = "No";

        if (bool) {
            aCadena = "Si";
        }

        return  aCadena;
    }
}
