package Model.CarritoState;

import Model.Shop.Productos;

public class Vacio implements Estado{


    @Override
    public Estado addProducto(Productos producto) {
        System.out.println("<Agregando productos al carrito>");
        System.out.println("Se agrego " +producto.toString() + " satisfactoriamente al carrito de compras ");
        return new Cargando();
    }

    @Override
    public Estado cancelar() {
        return new Vacio();

    }

    @Override
    public Estado volver() {
        return this;
    }

    @Override
    public Estado siguienteEstado() {
        System.out.println("Pasando al siguiente estado de la operacion");
        return new Pagando();
    }
}
