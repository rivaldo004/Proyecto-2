import java.util.List;

public class Ropa extends Producto {
    private List<String> talla;
    private List<String> color;

    // Constructor
    public Ropa(String codigo, String descripcion, List<String> talla, List<String> color) {
        super(codigo, descripcion);
        this.talla = talla;
        this.color = color;
    }

    // Método propio (aparte del toString heredado)
    public double aplicarDescuento(double porcentaje) {
        return super.calcularDescuento(porcentaje);
    }
    @Override
    public String toString() {
        return super.toString() + ", Talla: " + talla + ", Color: " + color;
    }
}
