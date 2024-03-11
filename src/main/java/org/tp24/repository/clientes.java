package org.tp24.repository;

import java.time.LocalDate;

public record clientes(String cedula, String nombre, String apellido, LocalDate fecha, String direccion,
        Integer cupomaximo) {
            


}
