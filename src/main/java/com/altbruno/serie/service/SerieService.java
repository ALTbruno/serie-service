package com.altbruno.serie.service;

import com.altbruno.serie.model.Serie;
import com.altbruno.serie.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

	@Autowired
	private SerieRepository serieRepository;

	public Serie cadastrarSerie(Serie serie) {
		return serieRepository.save(serie);
	}

	public List<Serie> listarSeriesPorGenero(String genre) {
		return serieRepository.findByGenreIgnoreCase(genre);
	}
}
