package com.altbruno.serie.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Id;

public class Chapter {

	@Id
	@NotNull
	private Integer id;

	private String name;

	private Integer number;

	private String urlStream;

	public Chapter() {
	}

	@JsonCreator
	public Chapter(@JsonProperty("id") Integer id, @JsonProperty("name") String name, @JsonProperty("number") Integer number, @JsonProperty("urlStream") String urlStream) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.urlStream = urlStream;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getUrlStream() {
		return urlStream;
	}

	public void setUrlStream(String urlStream) {
		this.urlStream = urlStream;
	}
}
