package Model.Shop;

public class Productos {

    private String descripcion;
    private Double precio;


    public Productos(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return getDescripcion();
    }
}
