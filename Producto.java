public class Producto {
    private String nombre;
    private String sku;
    private double precioBase;

    public Producto(String nombre, String sku, double precioBase) {
        this.nombre = nombre;
        this.sku = sku;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSku() {
        return sku;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}