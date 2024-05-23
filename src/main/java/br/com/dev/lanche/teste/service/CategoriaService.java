package br.com.dev.lanche.teste.service;

import br.com.dev.lanche.teste.model.Cargo;
import br.com.dev.lanche.teste.model.Categoria;
import br.com.dev.lanche.teste.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoriaService {

    final CategoriaRepository categoriaRepository;
    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository)
    {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria getCategoriaById(UUID id)
    {
        return categoriaRepository.findById(id).orElse(null);
    }

    public List<Categoria> getAllCargos()
    {
        return categoriaRepository.findAll();
    }

    public Categoria addCategoria(Categoria newCategoria)
    {
        Optional<Categoria> categoria = categoriaRepository.findByDescricao(newCategoria.getDescricao());

        if (! categoria.isPresent())
            categoriaRepository.save(newCategoria);

        return categoria.get();
    }
    public Categoria modifyCategoria(Cargo modifiedCategoria)
    {
        Optional<Categoria> categoria = categoriaRepository.findByDescricao(modifiedCategoria.getDescricao());

        if ( categoria.isPresent())
        {
            categoria.get().setDescricao(modifiedCategoria.getDescricao());
            categoriaRepository.save(categoria.get());
        }

        return categoria.get();
    }
    public Categoria deleteCategoriaById(UUID id)
    {
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        if ( categoria.isPresent() )
            categoriaRepository.deleteById(categoria.get().getId());

        return categoria.get();
    }
}