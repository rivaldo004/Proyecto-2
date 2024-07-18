public class Ropa extends Producto {
    private String talla;
    private String color;

    // Constructor
    public Ropa(String codigo, String descripcion, String talla, String color) {
        super(codigo, descripcion);
        this.talla = talla;
        this.color = color;
    }

    // Getters (heredados de la clase padre y nuevos)
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    // Método propio (aparte del toString heredado)
    public double aplicarDescuento(double porcentaje) {
        return super.calcularDescuento(porcentaje);
    }

    public String toString() {
        return super.toString() + ", Talla: " + talla + ", Color: " + color;
    }
}
