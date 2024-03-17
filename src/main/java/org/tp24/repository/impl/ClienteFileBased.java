package org.tp24.repository.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Stream;

import org.tp24.data.Cliente;
import org.tp24.excepcion.ListaClienteException;
import org.tp24.repository.ClientesRepository;



public class ClienteFileBased implements ClientesRepository {
    @Override
    public List<Cliente> getAll() throws ListaClienteException {
        Path path = Paths.get("./src/main/resources/lakasadepepe.txt");

        try {
            Stream<String> stream = Files.lines(path);
            return stream.map(this::build).toList();

        } catch (IOException e) {
            throw new ListaClienteException();

        }

    }

    private Cliente build(String text) {
        String[] ClienteArray = text.split(",");
        LocalDate fecha = buildFecha(ClienteArray[3]);
        BigInteger cupoMax = new BigInteger(ClienteArray[5]);
        return new Cliente(ClienteArray[0], ClienteArray[1], ClienteArray[2], fecha, ClienteArray[4], cupoMax);
    }

    private LocalDate buildFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        return LocalDate.parse(fecha.replace("/", ""), formatter);

    }

    @Override
    public List<Cliente> buscar(String nombre, String apellido) {

        return null;
    }

    @Override
    public List<Cliente> buscar(BigInteger cupomaximo) {
        return null;
    }

    @Override
    public Cliente buscar(String cedula) {

        return null;
    }

}
