package service;

import model.Gasto;

import java.util.ArrayList;
import java.util.List;

public class AdministradorGastos implements Gestionable, Presupuestable {
    private final List<Gasto> gastos;
    private final double presupuestoMensual;

    public AdministradorGastos(double presupuestoMensual) {
        this.gastos = new ArrayList<>();
        this.presupuestoMensual = presupuestoMensual;
    }

    // Implementación de Gestionable
    @Override
    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
        System.out.println("Gasto agregado: " + gasto.getDescripcion());
    }

    @Override
    public double calcularTotalGastos() {
        return gastos.stream().mapToDouble(Gasto::getMonto).sum();
    }

    @Override
    public void mostrarGastos() {
        System.out.println("\n=== LISTA DE GASTOS ===");
        if (gastos.isEmpty()) {
            System.out.println("No hay gastos registrados.");
        } else {
            gastos.forEach(gasto -> System.out.println(gasto.obtenerDetalles() + " - $" + gasto.getMonto()));
        }
        System.out.println("Total gastado: $" + calcularTotalGastos());
    }

    @Override
    public double obtenerPresupuesto() {
        return presupuestoMensual;
    }

    @Override
    public double calcularSaldoRestante() {
        return presupuestoMensual - calcularTotalGastos();
    }

    @Override
    public boolean estaDentroDelPresupuesto() {
        return calcularSaldoRestante() >= 0;
    }

    // Métodos adicionales
    public void mostrarResumen() {
        System.out.println("\n=== RESUMEN MENSUAL ===");
        System.out.println("Presupuesto: $" + presupuestoMensual);
        System.out.println("Total gastado: $" + calcularTotalGastos());
        System.out.println("Saldo restante: $" + calcularSaldoRestante());
        System.out.println("Dentro del presupuesto: " + (estaDentroDelPresupuesto() ? "Sí" : "No"));

        // Mostrar gastos por categoría
        System.out.println("\nGastos por categoría:");
        gastos.stream()
                .collect(java.util.stream.Collectors.groupingBy(
                        Gasto::getCategoria,
                        java.util.stream.Collectors.summingDouble(Gasto::getMonto)))
                .forEach((categoria, total) ->
                        System.out.println("  " + categoria + ": $" + total));
    }

    public List<Gasto> getGastosEsenciales() {
        return gastos.stream()
                .filter(Gasto::esEsencial)
                .toList();
    }
}