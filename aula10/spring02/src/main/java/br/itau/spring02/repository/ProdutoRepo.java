package br.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;
import br.itau.spring02.model.Produto;

// CRUD = CREATE, READ, UPDATE, DELETE
public interface ProdutoRepo extends CrudRepository<Produto, Long>{
    
}
