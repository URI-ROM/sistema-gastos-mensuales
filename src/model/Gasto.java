package model;

import java.time.LocalDate;

public abstract class Gasto {
    protected String id;
    protected String descripcion;
    protected double monto;
    protected LocalDate fecha;
    protected String categoria;

    public Gasto(String id, String descripcion, double monto, String categoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
        this.categoria = categoria;
        this.fecha = LocalDate.now();
    }

    // Métodos abstractos
    public abstract boolean esEsencial();
    public abstract String obtenerDetalles();

    public String getDescripcion() { return descripcion; }
    public double getMonto() { return monto; }

    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return String.format("Gasto[ID: %s, Desc: %s, Monto: $%.2f, Categoría: %s, Fecha: %s]",
                id, descripcion, monto, categoria, fecha);
    }
}