package com.altbruno.serie.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Id;
import java.util.List;

public class Season {

	@Id
	@NotNull
	private Integer id;

	private Integer seasonNumber;

	private List<Chapter> chapters;

	public Season() {
	}

	@JsonCreator
	public Season(@JsonProperty("id") Integer id, @JsonProperty("seasonNumber") Integer seasonNumber, @JsonProperty("chapters") List<Chapter> chapters) {
		this.id = id;
		this.seasonNumber = seasonNumber;
		this.chapters = chapters;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
}
