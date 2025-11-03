package model;

public class DesayunoEscuela extends GastoBase {
    private final String tipoComida;
    private final int diasPorSemana;

    public DesayunoEscuela(String id, String descripcion, double monto,
                           boolean recurrente, String tipoComida, int diasPorSemana) {
        super(id, descripcion, monto, "Desayuno Escuela", recurrente);
        this.tipoComida = tipoComida;
        this.diasPorSemana = diasPorSemana;
    }

    @Override
    public boolean esEsencial() {
        return true; // El desayuno escolar es esencial
    }

    @Override
    public String obtenerDetalles() {
        return String.format("%s - Tipo: %s, Días/semana: %d, Recurrente: %s",
                super.obtenerDetalles(), tipoComida, diasPorSemana, isRecurrente() ? "Sí" : "No");
    }

}