package org.tp24.data;

import java.math.BigInteger;
import java.time.LocalDate;

public record Cliente(String cedula, String nombre, String apellido, LocalDate fecha, String direccion,
        BigInteger cupomaximo) {
            


}
