import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String identificador;
    private List<Pedido> historialPedidos;

    public Cliente(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.historialPedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public List<Pedido> getHistorialPedidos() {
        return historialPedidos;
    }

    public void agregarPedido(Pedido pedido) {
        historialPedidos.add(pedido);
    }
    
    public double getTotalAcumuladoGastado() {
        double total = 0;
        for (Pedido pedido : historialPedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }
}