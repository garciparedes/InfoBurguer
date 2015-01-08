package test;
import java.util.ArrayList;

import restaurante.Alimento;
import restaurante.Bebida;
import restaurante.Combo;
import restaurante.Complemento;
import restaurante.Hamburguesa;
import restaurante.Producto;

/**
 * Clase de pruebas.
 *
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * @author Oscar Fernandez Angulo
 */
public class UsaProductosInfoBurguer {

    public static final String CREA_BEBIDA = "Creando Bebida...";
    public static final String CREA_HAMBURGUESA = "Creando Hamburguesa...";
    public static final String CREA_COMPLEMENTO = "Creando Complemento...";
    public static final String CREA_COMBO = "Creando Combo...";
    public static final String CAMBIA_PRECIO = "Cambiando precio...";

    public static final String CAMBIA_PRECIO_EXITO = "Precio cambiado correctamente";
    public static final String CAMBIA_PRECIO_FRACASO = "Ha ocurrido un error cambiando el precio";


    public static final String CREADO_EXITO = "Su producto se ha creado correctamente.";
    public static final String CREADO_FRACASO = "Su producto no se ha podido crear.";


    /**
     * Metodo para imprimir la carta.
     */
    public static void imprimeCarta(ArrayList<Producto> carta){

        System.out.println("Menu: ");

        for (Producto aCarta : carta) {
            System.out.println(aCarta.toString());
        }

        System.out.println();
    }


    /**
     * Metodo para introducir productos en la carta.
     */
    public static void introduceEnCarta(ArrayList<Producto> carta, Producto producto){
        carta.add(producto);
    }


    /**
     * Metodo para crear Bebidas.
     */
    public static void creaBebida(ArrayList<Producto> carta,
                                  String nombre, String descripcion,
                                  double precio, int calorias, boolean azucar, boolean cafeina){

        System.out.println(CREA_BEBIDA);

        try {
            Bebida cocaCola = new Bebida(nombre, descripcion, precio, calorias, azucar, cafeina);
            introduceEnCarta(carta, cocaCola);
            System.out.println(CREADO_EXITO);

        } catch (IllegalArgumentException e){
            System.out.println(e.toString());
            System.out.println(CREADO_FRACASO);

        } finally {
            System.out.println();
        }
    }


    /**
     * Metodo para crear Hamburguesas.
     */
    public static void creaHamburguesa(ArrayList<Producto> carta,
                                       String nombre, String descripcion,
                                       double precio, int calorias, String ingredientes){

        System.out.println(CREA_HAMBURGUESA);

        try {
            Hamburguesa hamburguesa = new Hamburguesa(nombre,descripcion,precio, calorias,ingredientes);
            introduceEnCarta(carta, hamburguesa);
            System.out.println(CREADO_EXITO);

        } catch (IllegalArgumentException e){
            System.out.println(e.toString());
            System.out.println(CREADO_FRACASO);

        } finally {
            System.out.println();
        }
    }


    /**
     * Metodo para crear combos.
     */
    public static void creaCombo(ArrayList<Producto> carta,
                                 String nombre, String descripcion, Producto... productos){

        System.out.println(CREA_COMBO);

        ArrayList<Alimento> listaAlimentos = new ArrayList<>();

        try{

            for ( Producto producto : productos ){
                listaAlimentos.add((Alimento) producto);
            }

            Combo combo = new Combo(nombre, descripcion, listaAlimentos);
            introduceEnCarta(carta, combo);
            System.out.println(CREADO_EXITO);

        } catch (ClassCastException|IllegalArgumentException e){

            System.out.println(e);
            System.out.println(CREADO_FRACASO);
        } finally {
            System.out.println();
        }

    }

    /**
     * Metodo para crear complementos.
     */
    public static void creaComplemento(ArrayList<Producto> carta,
                                       String nombre, String descripcion,
                                       double precio, int calorias, int comensales) {

        System.out.println(CREA_COMPLEMENTO);

        try {
            Complemento complemento = new Complemento(nombre, descripcion, precio, calorias, comensales);
            introduceEnCarta(carta, complemento);
            System.out.println(CREADO_EXITO);

        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println(CREADO_FRACASO);

        } finally {
            System.out.println();

        }
    }


    /**
     * Metodo para cambiar el precio de los productos.
     */
    public static void cambiaPrecio(Producto producto, double precio){

        System.out.println(CAMBIA_PRECIO);

        try{

            ((Alimento) producto).setPrecio(precio);
            System.out.println(CAMBIA_PRECIO_EXITO);

        } catch (ClassCastException|IllegalArgumentException e){

            System.out.println(e);
            System.out.println(CAMBIA_PRECIO_FRACASO);

        } finally {

            System.out.println();

        }
    }
    /**
     * Clase inicializadora.
     */
    public static void main(String Args[]){

        ArrayList<Producto> carta1 = new ArrayList<>();
        ArrayList<Producto> carta2 = new ArrayList<>();


        creaComplemento(carta1, "Alitas", "hola", 3.9, 2000, -3);
        creaComplemento(carta1, "Alitas", "hola", 3.9, 2000, 3);

        creaComplemento(carta1, "Patatas Chip", "", 3, 2000,1);


        creaHamburguesa(carta1, "Hamburguesa de pollo","hola",3.9, -2000,"pollo, lechuga, tomate");
        creaHamburguesa(carta1, "Hamburguesa de pollo","hola",3.9, 2000,"pollo, lechuga, tomate");

        creaHamburguesa(carta1, "Hamburguesa de queso","sabrosa hamburguesa",2, 1500,"queso, carne ternera, pepinillo");


        creaBebida(carta1, "Coca-Cola", "hola", -3.9, 2000, true, false);
        creaBebida(carta1, "Coca-Cola", "hola", 3.9, 2000, true, false);


        creaCombo(carta2, "Placa Madre", "Dos Hamburguesas", carta1.get(2) , carta1.get(3));
        creaCombo(carta2, "Combo en combo", "Combo en combo", carta2.get(0));

        creaCombo(carta2, "Patatas Chip", "Tres Raciones patatas", carta1.get(1), carta1.get(1), carta1.get(1));


        imprimeCarta(carta1);
        imprimeCarta(carta2);


        cambiaPrecio(carta2.get(0), 10);
        cambiaPrecio(carta1.get(3), -10);
        cambiaPrecio(carta1.get(3), 10);


        imprimeCarta(carta1);
        imprimeCarta(carta2);

    }
}
