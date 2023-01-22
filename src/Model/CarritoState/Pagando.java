package Model.CarritoState;


import Model.Shop.Productos;

import java.sql.SQLOutput;

public class Pagando implements Estado{
    @Override
    public Estado addProducto(Productos producto) {
        System.out.println("No se puede agregar "+ producto + " No se aceptan mas productos");
        return this;
    }

    @Override
    public Estado cancelar() {
        System.out.println("Cancelando compra, aguarde unos instantes..");
        return new Vacio();
    }

    @Override
    public Estado volver() {
        System.out.println("Volviendo..");
        return new Cargando();
    }

    @Override
    public Estado siguienteEstado() {
        System.out.println("Pasando al siguiente estado, cerrando el carrito de compras...");
        System.out.println("*****PAGO REALIZADO CORRECTAMENTE*****");
        System.out.println("Cerrando pedido, Muchas gracias por comprar aca MASTERRRR!!");
        return new Cerrado();
    }
}
