package br.com.tolk.apiPatter.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.tolk.apiPatter.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}