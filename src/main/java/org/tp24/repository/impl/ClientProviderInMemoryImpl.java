package org.tp24.repository.impl;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.tp24.data.Cliente;
import org.tp24.repository.ClientesRepository;

public class ClientProviderInMemoryImpl implements ClientesRepository {

    private List<Cliente> listaclientes;

    public ClientProviderInMemoryImpl() {
        listaclientes = new ArrayList<Cliente>();
    }

    @Override
    public List<Cliente> buscar(BigInteger cupomaximo) {
  

        
        return listaclientes.stream().filter(p -> p.cupomaximo().compareTo(cupomaximo) <= 0).toList();
    }

    @Override
    public Cliente buscar(String cedula) {

        return listaclientes.stream().filter(p -> p.cedula().equals(cedula)).findFirst().orElse(null);
    }

    @Override
    public List<Cliente> buscar(String nombre, String apellido) {

        return listaclientes.stream().filter(p -> equalName(p, nombre, apellido)).toList();
    }

    private boolean equalName(Cliente p, String nombre, String apellido) {

        if (p.nombre().equals(nombre) && p.apellido().equals(apellido)) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public List<Cliente> getAll() {
        return listaclientes;
    }

}
