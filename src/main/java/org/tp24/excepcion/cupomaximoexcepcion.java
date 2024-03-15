package org.tp24.excepcion;

import java.math.BigInteger;

public class CupomaximoExcepcion extends ClientesExeptions {
    public CupomaximoExcepcion(BigInteger CupoMaximo) {
        super("Cliente con el cupo maximo"+CupoMaximo+" por favor revisar :c");
    }

}
