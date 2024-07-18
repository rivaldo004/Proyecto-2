public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Transporte transporte = new Transporte("T004", "Transporte aéreo", "Aéreo", 3.0);
        Ropa ropa = new Ropa("R004", "Camisa blanca", "L", "Blanco");

        // Imprimir información de cada objeto
        System.out.println("\nTransporte:");
        System.out.println(transporte.toString());
        transporte.calcularCostoEnvio(1000.0); // calcular costo de envío para 1000 km

        System.out.println("Ropa:");
        System.out.println(ropa.toString());
        System.out.println("Precio con descuento del 20%: " + ropa.aplicarDescuento(20.0));
    }
}