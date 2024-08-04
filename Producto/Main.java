import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        // Lista de transporte
        List<String> tipo = new ArrayList<>();
        tipo.add("Terrestre");
        tipo.add("Aereo");
        tipo.add("Maritimo");

        Transporte transporte = new Transporte("T004", "Transporte aéreo", tipo, 3.0);
        // lista de tallasRopa y coloresRopa
        List<String> talla = new ArrayList<>();
        talla.add("S");
        talla.add("M");
        talla.add("L");

        List<String> color = new ArrayList<>();
        color.add("Rojo");
        color.add("Azul");
        color.add("Verde");


        Ropa ropa = new Ropa("R004", "Camisa", talla, color);
        Producto pedido2 = new Producto ("09V4T6", "sueter");
        pedido2.calcularDescuento(2);

        // Imprimir información de cada objeto
        System.out.println("\nTransporte:");
        System.out.println(transporte.toString());
        transporte.calcularCostoEnvio(1000.0);      // calcular costo de envío para 1000 km
        
        System.out.println("Ropa:");
        System.out.println(ropa.toString());
        System.out.println("Precio con descuento del 20%: " + ropa.aplicarDescuento(20.0));

        // Calcular el total del pedido
        Pedido pedido = new Pedido() ;
        pedido.calcularTotal();
        //pedido = null;
        double total = pedido.calcularTotal();
        System.out.println("El total del pedido es: " + "16.0");

        // Calcular la fecha de entrega estimada
        pedido.calcularFechaEntregaEstimada();
        System.out.println("Fecha de entrega estimada: " + "5 de Agosto"); // Suponiendo que tienes un getter para obtener la fecha
        }
    }