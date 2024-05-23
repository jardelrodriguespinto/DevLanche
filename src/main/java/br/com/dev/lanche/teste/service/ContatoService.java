package br.com.dev.lanche.teste.service;

import br.com.dev.lanche.teste.model.Contato;
import br.com.dev.lanche.teste.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContatoService {

    @Autowired
    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    final ContatoRepository contatoRepository;

    public Contato getContatoById(UUID id) {
        return contatoRepository.findById(id).orElse(null);
    }

    public List<Contato> getAllContatos() {
        return contatoRepository.findAll();
    }

    public Contato addContato(Contato newContato) {
        Optional<Contato> contato = contatoRepository.findByTipoAndNumero(newContato.getTipo(), newContato.getNumero());

        if (!contato.isPresent())
            contatoRepository.save(newContato);

        return contato.get();
    }

    public Contato modifyContato(Contato modifiedContato) {
        Optional<Contato> contato = contatoRepository.findByTipoAndNumero(modifiedContato.getTipo(), modifiedContato.getNumero());

        if (contato.isPresent()) {
            contato.get().setNumero(modifiedContato.getNumero());
            contato.get().setTipo(modifiedContato.getTipo());
            contatoRepository.save(contato.get());
        }

        return contato.get();
    }

    public Contato deleteContatoById(UUID id) {
        Optional<Contato> contato = contatoRepository.findById(id);

        if (contato.isPresent())
            contatoRepository.deleteById(contato.get().getId());

        return contato.get();
    }
}