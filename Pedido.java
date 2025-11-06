import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<LineaDePedido> LineasDePedido;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.LineasDePedido = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<LineaDePedido> getLineasDePedido() {
        return LineasDePedido;
    }

    public void agregarLinea(LineaDePedido linea) {
        this.LineasDePedido.add(linea);
    }

    public double calcularTotal() {
        double total = 0;
        for (LineaDePedido linea : LineasDePedido) {
            total += linea.calcularTotalLinea();
        }
        return total;
    }
    
    public void mostrarResumen() {
        System.out.println("Resumen del Pedido:");
        for (LineaDePedido linea : LineasDePedido) {
            System.out.printf("- %s (SKU: %s): %d x %.2f = %.2f\n", 
                linea.getProducto().getNombre(), 
                linea.getProducto().getSku(), 
                linea.getCantidad(), 
                linea.getProducto().getPrecioBase(), 
                linea.calcularTotalLinea());
        }
        System.out.printf("Total del Pedido: %.2f\n", calcularTotal());
    }
}