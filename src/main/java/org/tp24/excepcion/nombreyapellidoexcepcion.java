package org.tp24.excepcion;

public class NombreYapellidoExcepcion extends RuntimeException {

    public NombreYapellidoExcepcion(String nombre, String apellido) {
        super("Cliente con el nombre y apellido"+nombre + apellido+ "no encontrado");
    }
}
