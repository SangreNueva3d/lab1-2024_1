package org.tp24.excepcion;

public class nombreyapellidoexcepcion extends RuntimeException {

    public nombreyapellidoexcepcion(String nombreyapellido) {
        super("Cliente con el nombre y apellido"+nombreyapellido+"no encontrado");
    }
}
