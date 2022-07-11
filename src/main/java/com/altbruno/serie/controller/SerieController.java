package com.altbruno.serie.controller;

import com.altbruno.serie.model.Serie;
import com.altbruno.serie.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

	@Autowired
	private SerieService serieService;

	@PostMapping
	public ResponseEntity<Serie> cadastrarSerie(@RequestBody Serie serie) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serieService.cadastrarSerie(serie));
	}

	@GetMapping("/{genre}")
	public ResponseEntity<List<Serie>> listarPorGenero(@PathVariable String genre) {
		return ResponseEntity.status(HttpStatus.OK).body(serieService.listarSeriesPorGenero(genre));
	}
}
