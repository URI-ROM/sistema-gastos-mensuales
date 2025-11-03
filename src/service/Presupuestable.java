package service;

public interface Presupuestable {
    double obtenerPresupuesto();
    double calcularSaldoRestante();
    boolean estaDentroDelPresupuesto();
}