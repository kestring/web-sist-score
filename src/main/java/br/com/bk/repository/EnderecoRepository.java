package br.com.bk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.bk.entity.Endereco;

public interface EnderecoRepository extends MongoRepository<Endereco, String>{

}
