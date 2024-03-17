package org.tp24.service;
import java.math.BigInteger;
import java.util.List;

import org.tp24.data.Cliente;
import org.tp24.excepcion.CedulaExcepcion;
import org.tp24.excepcion.CupomaximoExcepcion;
import org.tp24.excepcion.NombreYapellidoExcepcion;
import org.tp24.repository.ClientesRepository;

public class ClienteServiceImpl {
    private ClientesRepository interfaceclient;

    public ClienteServiceImpl(ClientesRepository interfaceclient){
        this.interfaceclient = interfaceclient;
    }
    public List<Cliente> buscarPorNombre(String nombre, String apellido){
        var clients = interfaceclient.buscar(nombre, apellido);
        if(clients.isEmpty()){
            throw new NombreYapellidoExcepcion(nombre,apellido);
        }
        return clients;
    }

    public List<Cliente> buscarPorCupoMaximo(BigInteger cupoMaximo){
        var clients = interfaceclient.buscar(cupoMaximo);
        if(clients.isEmpty()){
            throw new CupomaximoExcepcion(cupoMaximo);
        }
        return clients;
    }

    public Cliente buscarPorCedula(String cedula){
        var client = interfaceclient.buscar(cedula);
        if(client == null){
            throw new CedulaExcepcion(cedula);
        }
        return client;
    }

    public List<Cliente> getAll(){
        return interfaceclient.getAll();
    }

}