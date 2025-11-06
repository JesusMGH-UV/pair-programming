public class LineaDePedido {
    private Producto producto;
    private int cantidad;

    public LineaDePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularTotalLinea() {
        return producto.getPrecioBase() * cantidad;
    }
}