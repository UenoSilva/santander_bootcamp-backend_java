package com.dio.ueno.service;

import java.util.List;

import com.dio.ueno.domain.model.Anime;

public interface AnimeService {

	List<Anime> listaAnimes();
	
	Anime create(Anime anime);
	
	Anime findById(Long id);
	
	Anime update(Long id, Anime anime);
	
	void delete(Long id);
}
