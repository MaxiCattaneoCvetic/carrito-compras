package Model.CarritoState;

import Model.Shop.Productos;

public class Cargando implements Estado{
    @Override
    public Estado addProducto(Productos producto) {
        System.out.println("<Agregando productos al carrito>");
        System.out.println("Se agrego " +producto + " satisfactoriamente al carrito de compras ");
        return new Cargando();
    }

    @Override
    public Estado cancelar() {
        System.out.println("Cacelando compra, aguarde unos minutos");
        return new Vacio();
    }

    @Override
    public Estado volver() {
        System.out.println("Vaciando el carrito de compras...");
        return new Vacio();
    }

    @Override
    public Estado siguienteEstado() {
        System.out.println("Ingresando al modulo de pagos");
        return new Pagando();
    }
}
