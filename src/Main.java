import Model.Shop.Carrito;
import Model.Shop.Productos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Productos leche = new Productos("Leche", 500.0);
        Productos chocolate = new Productos("Chocolate", 500.0);
        Productos cafe = new Productos("cafe", 500.0);

        Carrito carro1 = new Carrito();
        carro1.agregarProductos(leche);
        carro1.agregarProductos(chocolate);
        carro1.siguienteEstado();
        carro1.volver();
        carro1.showState();
        carro1.siguienteEstado();
        carro1.showState();
        carro1.agregarProductos(leche);







    }
}
