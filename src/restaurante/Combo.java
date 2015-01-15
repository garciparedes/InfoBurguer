package restaurante;
import java.util.ArrayList;

/**
 * Clase <code>Combo</code>.
 *
 * Hereda de la clase <code>Producto</code>.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class Combo extends Producto {


    private ArrayList<Alimento> alimentos;
    private static final String ERROR_ALIMENTOS = "Los alimentos no pueden ser nulos.";


    /**
     * Constructor de la clase <code>Combo</code>.
     *
     * @param nombre String con el nombre de <code>Combo</code>.
     * @param descripcion String con la descripcion de <code>Combo</code>.
     */
    public Combo(String nombre, String descripcion, Producto... productos){
        super(nombre, descripcion);

        alimentos = new ArrayList<Alimento>();

        for ( Producto producto : productos ){

            if (producto == null) {
                throw new IllegalArgumentException(ERROR_ALIMENTOS);
            }
            alimentos.add((Alimento) producto);

        }
    }


    /**
     * Getter del atributo <code>alimentos</code>.
     *
     * @return alimentos ArrayLis de alimentos que componen <code>Combo</code>.
     */
    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }


    /**
     * Getter del atributo <code>precio</code>.
     *
     * Para calcular el precio se realiza la suma del de sus alimentos y a este se le resta el 20%.
     *
     * @return totalPrecio Double con el precio total de <code>Combo</code>.
     */
    @Override
    public double getPrecio() {
        double totalPrecio = 0;

        for (int i = 0 ; i < getAlimentos().size() ; i++){
            totalPrecio += getAlimentos().get(i).getPrecio();
        }

        totalPrecio = totalPrecio - 0.2*totalPrecio;

        return totalPrecio;
    }


    /**
     * Getter del atributo <code>calorias</code>.
     *
     * Para calcular el numero de calorias se suman las de los alimentos que componen el combo.
     *
     * @return totalCalorias Integer con el numero total de calorias de <code>Combo</code>.
     */
    @Override
    public int getCalorias() {
        int totalCalorias = 0;

        for (int i = 0 ; i < getAlimentos().size() ; i++){
            totalCalorias += getAlimentos().get(i).getCalorias();
        }

        return totalCalorias;
    }
}
