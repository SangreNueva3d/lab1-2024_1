package org.tp24.excepcion;

public class CedulaExcepcion extends ClientesExeptions {
    
    public CedulaExcepcion(String Cedula) {
        super("Cliente con la cédula"+Cedula+"no encontrado");

    }

}
