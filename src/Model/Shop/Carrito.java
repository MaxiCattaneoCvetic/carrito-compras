package Model.Shop;

import Model.CarritoState.Estado;
import Model.CarritoState.Vacio;

import java.util.ArrayList;


public class Carrito {

    private Estado estadoActual;
    private ArrayList<Productos> producto;


    public Carrito() {
        this.estadoActual = new Vacio();
       ArrayList<Productos> compra = new ArrayList<Productos>();
    }

    public void agregarProductos ( Productos producto){
        estadoActual = estadoActual.addProducto(producto);
    }
    public void cancelar(){
        estadoActual = estadoActual.cancelar();
    }

    public void volver(){
    estadoActual = estadoActual.volver();
    }

    public void  siguienteEstado(){
        estadoActual = estadoActual.siguienteEstado();
    }

    public void showState(){
        System.out.println("ESTADO DEL CARRITO");
        System.out.println(this.estadoActual.getClass().getSimpleName());
    }

}
