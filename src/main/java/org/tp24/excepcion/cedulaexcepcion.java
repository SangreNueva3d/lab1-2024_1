package org.tp24.excepcion;

public class cedulaexcepcion extends RuntimeException {
    public cedulaexcepcion(String Cedula) {
        super("Cliente con la cédula"+Cedula+"no encontrado");

    }

}
