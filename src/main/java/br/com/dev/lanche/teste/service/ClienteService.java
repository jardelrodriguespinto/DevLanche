package br.com.dev.lanche.teste.service;

import br.com.dev.lanche.teste.model.Cliente;
import br.com.dev.lanche.teste.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteService
{
    final ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository)
    {
        this.clienteRepository = clienteRepository;
    }
    public List<Cliente> getAllClientes()
    {
        return clienteRepository.findAll();
    }
    public Cliente getClienteById(UUID id)
    {
        return clienteRepository.findById(id).orElse(null);
    }
    public Cliente addCliente(Cliente newCliente)
    {
        Optional<Cliente> cliente = clienteRepository.findByNomeCompleto(newCliente.getNome(),
                                                                         newCliente.getSobrenome());
        if (! cliente.isPresent())
            clienteRepository.save(newCliente);

        return cliente.get();
    }
    public Cliente modifyCliente(Cliente modifiedCliente)
    {
        Optional<Cliente> cliente = clienteRepository.findByNomeCompleto(modifiedCliente.getNome(),
                                                                         modifiedCliente.getSobrenome());
        if ( cliente.isPresent())
        {
            cliente.get().setNome(modifiedCliente.getNome());
            cliente.get().setSobrenome(modifiedCliente.getSobrenome());
            cliente.get().setEmail(modifiedCliente.getEmail());

            cliente.get().getContatos().clear();
            cliente.get().setContatos(modifiedCliente.getContatos());

            clienteRepository.save(cliente.get());
        }

        return cliente.get();
    }

    public Cliente deleteClienteById(UUID id)
    {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        if (cliente.isPresent())
            clienteRepository.deleteById(cliente.get().getId());

        return cliente.get();
    }
}