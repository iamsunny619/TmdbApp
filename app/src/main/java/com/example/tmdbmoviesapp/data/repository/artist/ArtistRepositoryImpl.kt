package com.example.tmdbmoviesapp.data.repository.artist

import android.util.Log
import com.example.tmdbmoviesapp.data.model.artist.Artist
import com.example.tmdbmoviesapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.tmdbmoviesapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.tmdbmoviesapp.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.tmdbmoviesapp.domain.Artist.repository.ArtistRepository

class ArtistRepositoryImpl(
    private val artistLocalDataSource: ArtistLocalDataSource,
    private val artistCacheDataSource: ArtistCacheDataSource,
    private val artistRemoteDataSource: ArtistRemoteDataSource
) : ArtistRepository {
    override suspend fun getArtist(): List<Artist>? {
        return getArtistCache()
    }

    override suspend fun updateArtist(): List<Artist>? {
        val newArtistList = getArtistFromApi()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistToDB(newArtistList!!)
        artistCacheDataSource.saveArtistToCache(newArtistList)
        return newArtistList
    }

    suspend fun getArtistFromApi(): List<Artist>? {
        var artist: List<Artist>? = null

        try {
            val response = artistRemoteDataSource.getArtist()
            val body = response.body()
            if (body != null) {
                artist = body.artists
            }
        } catch (exception: Exception) {
            Log.i("ArtistRepoImpl", exception.toString())
        }
        return artist
    }

    suspend fun getArtistFromDB(): List<Artist>? {
        var artist: List<Artist>? = null
        try {
            artist = artistLocalDataSource.getArtistFromDB()
        } catch (e: java.lang.Exception) {
            Log.i("ArtistRepoImpl", e.toString())
        }
        if (artist?.size!! > 0) {
            return artist
        } else {
            artist = getArtistFromApi()
            artistLocalDataSource.saveArtistToDB(artist!!)
        }
        return artist
    }

    suspend fun getArtistCache(): List<Artist> {
        var artist: List<Artist>? = null
        try {
            artist = artistCacheDataSource.getArtistFromCache()
        } catch (e: java.lang.Exception) {
            Log.i("ArtistRepoImpl", e.toString())
        }
        if (artist?.size!! > 0) {
            return artist
        } else {
            artist = getArtistFromDB()
            artistCacheDataSource.saveArtistToCache(artist!!)
        }
        return artist
    }
}