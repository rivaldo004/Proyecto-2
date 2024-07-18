public class Transporte extends Producto {
    private String tipo;                // Tipo de transporte (terrestre, aéreo, marítimo)
    private double tiempoEntrega;      // Tiempo estimado de entrega

    // Constructor
    public Transporte(String codigo, String descripcion, String tipo, double tiempoEntrega) {
        super(codigo, descripcion);
        this.tipo = tipo;
        this.tiempoEntrega = tiempoEntrega;
    }

    // getters y setters
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(double tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    // Método propio
    public void calcularCostoEnvio(double distancia) {
        // Implementar la lógica para calcular el costo de envío según el tipo de transporte y la distancia
    }
    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo + ", Tiempo de entrega: " + tiempoEntrega;
    }
}