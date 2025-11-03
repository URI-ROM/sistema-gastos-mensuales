package model;

public abstract class GastoBase extends Gasto {
    private final boolean recurrente;

    public GastoBase(String id, String descripcion, double monto, String categoria, boolean recurrente) {
        super(id, descripcion, monto, categoria);
        this.recurrente = recurrente;
    }

    public boolean isRecurrente() { return recurrente; }

    @Override
    public String obtenerDetalles() {
        return String.format("%s - %s (Recurrente: %s)", descripcion, categoria, recurrente ? "Sí" : "No");
    }
}