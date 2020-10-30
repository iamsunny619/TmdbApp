package com.example.tmdbmoviesapp.domain.Artist.useCase

import com.example.tmdbmoviesapp.data.model.artist.Artist
import com.example.tmdbmoviesapp.domain.Artist.repository.ArtistRepository

class GetArtistUseCase(val artistRepository: ArtistRepository) {

    suspend fun excecute(): List<Artist>? = artistRepository.getArtist()
}