import model.*;
import service.AdministradorGastos;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ADMINISTRACIÓN DE GASTOS MENSUALES ===\n");

        // Crear administrador de gastos con presupuesto de $2000
        AdministradorGastos administrador = new AdministradorGastos(2000.0);

        // Crear diferentes tipos de gastos con los nuevos precios
        DesayunoEscuela desayuno = new DesayunoEscuela(
                "DES001", "Desayuno escolar mensual", 700.0,
                true, "Comida balanceada", 20
        );

        Transporte transporte = new Transporte(
                "TRA001", "Transporte escolar", 520.0,
                true, "Autobús escolar", 10.5
        );

        GastosEscolares materiales = new GastosEscolares(
                "ESC001", "Materiales escolares", 20.0,
                false, "Libros y cuadernos", 5
        );

        Ahorros ahorros = new Ahorros(
                "AHO001", "Ahorro para educación", 0.0,
                true, "Futuros estudios", 0.0
        );

        // Agregar gastos al administrador
        System.out.println("Agregando gastos...");
        administrador.agregarGasto(desayuno);
        administrador.agregarGasto(transporte);
        administrador.agregarGasto(materiales);
        administrador.agregarGasto(ahorros);

        // Mostrar información
        administrador.mostrarGastos();
        administrador.mostrarResumen();

        // LÍNEA MEJORADA - Expression lambda
        System.out.println("\n=== GASTOS ESENCIALES ===");
        administrador.getGastosEsenciales().forEach(gasto ->
                System.out.println("✓ " + gasto.obtenerDetalles())
        );

        // Verificar si estamos dentro del presupuesto
        System.out.println("\n=== ESTADO DEL PRESUPUESTO ===");
        if (administrador.estaDentroDelPresupuesto()) {
            System.out.println("✅ ¡Excelente! Estás dentro del presupuesto.");
        } else {
            System.out.println("❌ ¡ADVERTENCIA: Has excedido el presupuesto!");
        }

        // Calcular porcentaje usado
        double porcentajeUsado = (administrador.calcularTotalGastos() / administrador.obtenerPresupuesto()) * 100;
        System.out.printf("Porcentaje del presupuesto usado: %.1f%%\n", porcentajeUsado);
    }
}