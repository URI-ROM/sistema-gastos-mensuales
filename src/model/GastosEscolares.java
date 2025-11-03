package model;

public class GastosEscolares extends GastoBase {
    private final String material;
    private final int cantidad;

    public GastosEscolares(String id, String descripcion, double monto,
                           boolean recurrente, String material, int cantidad) {
        super(id, descripcion, monto, "Gastos Escolares", recurrente);
        this.material = material;
        this.cantidad = cantidad;
    }

    @Override
    public boolean esEsencial() {
        return true; // Los gastos escolares son esenciales
    }

    @Override
    public String obtenerDetalles() {
        return String.format("%s - Material: %s, Cantidad: %d",
                super.obtenerDetalles(), material, cantidad);
    }

}