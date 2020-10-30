package com.example.tmdbmoviesapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tmdbmoviesapp.data.db.dao.ArtistDao
import com.example.tmdbmoviesapp.data.db.dao.MovieDao
import com.example.tmdbmoviesapp.data.db.dao.TvShowDao
import com.example.tmdbmoviesapp.data.model.artist.Artist
import com.example.tmdbmoviesapp.data.model.movie.Movie
import com.example.tmdbmoviesapp.data.model.tvShow.TVShow

@Database(
    entities = [Movie::class, TVShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}