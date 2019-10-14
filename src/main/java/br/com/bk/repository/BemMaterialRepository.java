package br.com.bk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.bk.entity.BemMaterial;

public interface BemMaterialRepository extends MongoRepository<BemMaterial, String> {

}
