/**
 * Clase <code>Bebida</code>.
 *
 * Hereda de la clase <code>Alimento</code>.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Bebida  extends Alimento {


    private boolean azucar;
    private boolean cafeina;


    /**
     * Constructor de la clase <code>Bebida</code>.
     *
     * @param nombre String con el nombre de <code>Bebida</code>.
     * @param descripcion String con la descripcion de <code>Bebida</code>.
     * @param precio Double con el precio de <code>Bebida</code>.
     * @param calorias Integer con el numero de calorias de <code>Bebida</code>
     * @param cafeina Boolean que indica si <code>Bebida</code> tiene cafeina.
     * @param azucar Boolean que indica si <code>Bebida</code> tiene azucar.
     */
    public Bebida(String nombre, String descripcion, double precio, int calorias, boolean azucar, boolean cafeina){
        super(nombre, descripcion, precio,calorias);
        this.azucar = azucar;
        this.cafeina = cafeina;
    }


    /**
     * Setter del atributo <code>azucar</code>.
     *
     * @param azucar Boolean que indica si <code>Bebida</code> tiene azucar.
     */
    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }


    /**
     * Setter del atributo <code>cafeina</code>.
     *
     * @param cafeina Boolean que indica si <code>Bebida</code> tiene cafeina.
     */
    public void setCafeina(boolean cafeina) {
        this.cafeina = cafeina;
    }


    /**
     * Getter del atributo <code>azucar</code>.
     *
     * @return azucar Boolean que indica si <code>Bebida</code> tiene azucar.
     */
    public boolean getAzucar() {
        return azucar;
    }


    /**
     * Getter del atributo <code>cafeina</code>.
     *
     * @return cafeina Boolean que indica si <code>Bebida</code> tiene cafeina.
     */
    public boolean getCafeina() {
        return cafeina;
    }


    /**
     * Metodo que sobreescribe el metodo toString() de la clase <code>Alimento</code>.
     *
     * Devuelve una cadena de caracteres con el siguiente formato:
     * Nombre: xxxx  Descripcion: xxxxx  Precio: xxxxx  Calorias: xxxxxx  Tipo: xxxxxxxx
     *
     * @return String con el contenido de <code>Bebida</code>.
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
