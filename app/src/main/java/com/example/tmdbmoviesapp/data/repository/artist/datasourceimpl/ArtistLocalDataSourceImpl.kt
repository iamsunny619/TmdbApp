package com.example.tmdbmoviesapp.data.repository.artist.datasourceimpl

import com.example.tmdbmoviesapp.data.db.dao.ArtistDao
import com.example.tmdbmoviesapp.data.model.artist.Artist
import com.example.tmdbmoviesapp.data.repository.artist.datasource.ArtistLocalDataSource

class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao) : ArtistLocalDataSource {
    override suspend fun getArtistFromDB(): List<Artist> {
        return artistDao.getArtist()
    }

    override suspend fun saveArtistToDB(movie: List<Artist>) {
        return artistDao.saveArtist(movie)
    }

    override suspend fun clearAll() {
        return artistDao.deleteAllArtist()
    }
}