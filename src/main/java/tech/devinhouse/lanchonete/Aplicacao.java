package tech.devinhouse.lanchonete;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import tech.devinhouse.lanchonete.repository.ClienteRepository;

@Component
public class Aplicacao {

    @Autowired
    private ClienteRepository clienteRepo;

    public void iniciar() {

        var clientes = clienteRepo.findAll(); // SELECT * FROM clientes
        clientes.forEach(c -> System.out.println(c));

    }

}
