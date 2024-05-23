package br.com.dev.lanche.teste.service;

import br.com.dev.lanche.teste.model.Cargo;
import br.com.dev.lanche.teste.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CargoService
{
    final CargoRepository cargoRepository;
    @Autowired
    public CargoService(CargoRepository cargoRepository)
    {
        this.cargoRepository = cargoRepository;
    }

    public Cargo getCargoById(UUID id)
    {
        return cargoRepository.findById(id).orElse(null);
    }

    public List<Cargo> getAllCargos()
    {
        return cargoRepository.findAll();
    }

    public Cargo addCargo(Cargo newCargo)
    {
        Optional<Cargo> cargo = cargoRepository.findByDescricao(newCargo.getDescricao());

        if (! cargo.isPresent())
            cargoRepository.save(newCargo);

        return cargo.get();
    }
    public Cargo ModifyCargo(Cargo modifiedCargo)
    {
        Optional<Cargo> cargo = cargoRepository.findByDescricao(modifiedCargo.getDescricao());

        if ( cargo.isPresent())
        {
            cargo.get().setDescricao(modifiedCargo.getDescricao());
            cargoRepository.save(cargo.get());
        }

        return cargo.get();
    }
    public Cargo deleteCargoById(UUID id)
    {
        Optional<Cargo> cargo = cargoRepository.findById(id);

        if ( cargo.isPresent() )
            cargoRepository.deleteById(cargo.get().getId());

        return cargo.get();
    }
}
