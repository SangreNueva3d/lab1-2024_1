package org.tp24.excepcion;

public class cupomaximoexcepcion extends RuntimeException {
    public cupomaximoexcepcion(Integer CupoMaximo) {
        super("Cliente con el cupo maximo"+CupoMaximo+" por favor revisar :c");
    }

}
