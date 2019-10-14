package br.com.bk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.bk.entity.Score;

public interface ScoreRepository extends MongoRepository<Score, String> {

}
