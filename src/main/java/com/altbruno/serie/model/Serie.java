package com.altbruno.serie.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "SERIES")
public class Serie {

	@Id
	@NotNull
	private Integer id;

	private String name;

	private String genre;

	private List<Season> seasons;

	public Serie() {
	}

	@JsonCreator
	public Serie(@JsonProperty("id") Integer id, @JsonProperty("name") String name, @JsonProperty("genre") String genre, @JsonProperty("seasons") List<Season> seasons) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.seasons = seasons;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
}
