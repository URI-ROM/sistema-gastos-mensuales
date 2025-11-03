package service;

import model.Gasto;

public interface Gestionable {
    void agregarGasto(Gasto gasto);

    double calcularTotalGastos();
    void mostrarGastos();
}