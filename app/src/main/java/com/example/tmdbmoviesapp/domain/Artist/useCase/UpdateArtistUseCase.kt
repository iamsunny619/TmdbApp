package com.example.tmdbmoviesapp.domain.Artist.useCase

import com.example.tmdbmoviesapp.data.model.artist.Artist
import com.example.tmdbmoviesapp.domain.Artist.repository.ArtistRepository

class UpdateArtistUseCase(val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtist()
}