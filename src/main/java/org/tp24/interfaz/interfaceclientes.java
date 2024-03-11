package org.tp24.interfaz;

import org.tp24.repository.clientes;

public interface interfaceclientes {
    clientes buscarClientesporNombre_y_Apellido(String nombre, String apellido);
    clientes buscarClientesConCupoMaximo_o_Igual(Integer cupomaximo);
    clientes buscarClientesporCedula(String cedula);
}
