package org.tp24;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tp24.data.Cliente;

import org.tp24.repository.impl.ClienteFileBased;
import org.tp24.service.ClienteServiceImpl;

public class ApplicationRunner {
    
        private static final Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);

        public static void main(String[] args) {
            ClienteServiceImpl clienteService = new ClienteServiceImpl(new ClienteFileBased());
            List<Cliente> clientes = clienteService.getAll();
            System.out.println(clientes);




        }


}
