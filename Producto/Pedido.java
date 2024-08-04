import java.util.Date;

public class Pedido implements  InterfacePedido{
    private Producto productos;
    private double total;
    private Date fechaEntregaEstimada;

    //constructor
    public Pedido() {
        this.productos = null;
        this.total = 0;
        this.fechaEntregaEstimada = null;
    }

    @Override
    public void agregarProducto() {
        System.out.println("Agregar un producto al pedido");
    }

    @Override
    public void eliminarProducto() {
        System.out.println("Eliminar un producto del pedido");
    }

    @Override
    public double calcularTotal() {
        // Calcular el total del pedido
        return 0;
    }

    @Override
    public void calcularFechaEntregaEstimada() {
        // Calcular la fecha de entrega estimada
    }

    @Override
    public String getFechaEntregaEstimada() {
        return fechaEntregaEstimada + "";
    }
}
