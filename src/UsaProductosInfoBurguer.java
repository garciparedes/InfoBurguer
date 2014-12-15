import java.util.ArrayList;

/**
 * Clase de pruebas.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class UsaProductosInfoBurguer {


    public static void imprimeCarta(ArrayList<Producto> carta){

        for (Producto aCarta : carta) {
            System.out.println(aCarta.toString());
        }

    }


    /**
     * Clase inicializadora.
     *
     * @param Args
     */
    public static void main(String Args[]){

        ArrayList<Producto> carta1 = new ArrayList<Producto>();

        carta1.add(new Bebida("Coca-Cola","hola",3.9, 2000,true, false));

        carta1.add(new Complemento("Alitas","hola",3.9, 2000,3));

        carta1.add(new Hamburguesa("Hamburguesa de pollo","hola",3.9, 2000,"pollo, lechuga, tomate"));
        carta1.add(new Hamburguesa("Hamburguesa de queso","hola",2, 1500,"queso, carne ternera, pepinillo"));

        carta1.add(new Combo("Placa Madre","Dos hamburguesas"));




        imprimeCarta(carta1);

    }
}
