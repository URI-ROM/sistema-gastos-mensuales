package model;

public class Transporte extends GastoBase {
    private String medioTransporte;
    private double distanciaKm;

    public Transporte(String id, String descripcion, double monto,
                      boolean recurrente, String medioTransporte, double distanciaKm) {
        super(id, descripcion, monto, "Transporte", recurrente);
        this.medioTransporte = medioTransporte;
        this.distanciaKm = distanciaKm;
    }

    @Override
    public boolean esEsencial() {
        return true; // El transporte es esencial
    }

    @Override
    public String obtenerDetalles() {
        return String.format("%s - Medio: %s, Distancia: %.1f km",
                super.obtenerDetalles(), medioTransporte, distanciaKm);
    }

    public String getMedioTransporte() { return medioTransporte; }
    public double getDistanciaKm() { return distanciaKm; }
}