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


    private ArrayList<Alimento> alimentos;


    /**
     * Constructor de la clase Combo.
     *
     * @param nombre String con el nombre del Combo.
     * @param descripcion String con la descripcion del Combo.
     */
    public Combo(String nombre, String descripcion, ArrayList<Alimento> alimentos){
        super(nombre, descripcion);
        this.alimentos = alimentos;
    }


    /**
     * Setter del atributo alimentos.
     *
     * @param alimentos Arraylist de alimentos  que componen el Combo.
     */
    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }


    /**
     * Getter del atributo alimentos.
     *
     * @return alimentos ArrayLis de alimentos que componen el Combo.
     */
    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }


    /**
     * Getter del atributo calorias.
     *
     * Para calcular el numero de calorias se suman las de los alimentos que componen el combo.
     *
     * @return totalCalorias Integer con el numero total de calorias del combo.
     */
    public int getCalorias() {
        int totalCalorias = 0;

        for (int i = 0 ; i < getAlimentos().size() ; i++){
            totalCalorias += getAlimentos().get(i).getCalorias();
        }

        return totalCalorias;
    }


    /**
     * Getter del atributo precio.
     *
     * Para calcular el precio se realiza la suma del de sus alimentos y a este se le resta el 20%.
     *
     * @return totalPrecio Double con el precio total del combo.
     */
    public double getPrecio() {
        double totalPrecio = 0;

        for (int i = 0 ; i < getAlimentos().size() ; i++){
            totalPrecio += getAlimentos().get(i).getPrecio();
        }

        totalPrecio = totalPrecio - 0.2*totalPrecio;

        return totalPrecio;
    }
}
