package br.com.alura.ScreenMatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadoSerie (@JsonAlias("Title") String nome, @JsonAlias ("totalSeasons") int totalTemporadas,@JsonAlias ("imdbRating") String nota ) {
}
