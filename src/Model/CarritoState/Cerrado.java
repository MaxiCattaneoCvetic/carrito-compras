package Model.CarritoState;

import Model.Shop.Productos;

public class Cerrado implements Estado{
    @Override
    public Estado addProducto(Productos producto) {
        System.out.println("Carrito cerrado, si quiere añadir productos abra un nuevo carrito");
        return this;
    }

    @Override
    public Estado cancelar() {
        System.out.println("El proceso no puede cancelarse..");
        return this;
    }

    @Override
    public Estado volver() {
        return this;
    }

    @Override
    public Estado siguienteEstado() {
        return this;
    }
}
