package Model.CarritoState;


import Model.Shop.Productos;

public interface Estado {


    Estado addProducto(Productos producto);
    Estado cancelar();
    Estado volver();
    Estado siguienteEstado();


}
