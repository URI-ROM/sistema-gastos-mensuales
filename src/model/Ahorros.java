package model;

public class Ahorros extends GastoBase {
    private final String objetivo;
    private final double porcentajeMensual;

    public Ahorros(String id, String descripcion, double monto,
                   boolean recurrente, String objetivo, double porcentajeMensual) {
        super(id, descripcion, monto, "Ahorros", recurrente);
        this.objetivo = objetivo;
        this.porcentajeMensual = porcentajeMensual;
    }

    @Override
    public boolean esEsencial() {
        return false; // Los ahorros no son esenciales pero son importantes
    }

    @Override
    public String obtenerDetalles() {
        return String.format("%s - Objetivo: %s, Porcentaje mensual: %.1f%%",
                super.obtenerDetalles(), objetivo, porcentajeMensual);
    }

}