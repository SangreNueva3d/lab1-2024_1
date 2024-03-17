package org.tp24.repository;
import org.tp24.data.Cliente;
import java.math.BigInteger;
import java.util.List;

public interface ClientesRepository{
    List<Cliente> buscar(String nombre, String apellido);
    List<Cliente> buscar(BigInteger cupomaximo);
    Cliente buscar(String cedula);
    List<Cliente> getAll();
}
