package br.com.bk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.bk.entity.FonteRenda;

public interface FonteRendaRepository extends MongoRepository<FonteRenda, String> {

}
