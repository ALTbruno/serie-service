package com.altbruno.serie.repository;

import com.altbruno.serie.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends MongoRepository<Serie, Integer> {
	List<Serie> findByGenreIgnoreCase (String genre);
}
