package com.example.tmdbmoviesapp.data.repository.movie.datasourceimpl

import android.util.Log
import com.example.tmdbmoviesapp.data.model.movie.Movie
import com.example.tmdbmoviesapp.data.repository.movie.datasource.MovieCacheDataSource
import com.example.tmdbmoviesapp.data.repository.movie.datasource.MovieLocalDataSource
import com.example.tmdbmoviesapp.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.tmdbmoviesapp.domain.movie.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovies = getMoviesFromApi()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(newListOfMovies!!)
        movieCacheDataSource.saveMoviesToCache(newListOfMovies)
        return newListOfMovies
    }

    suspend fun getMoviesFromApi(): List<Movie>? {
        var movieList: List<Movie>? = null

        try {
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()
            if (body != null) {
                movieList = body.movies
            }
        } catch (execption: Exception) {
            Log.i("MYTAG", execption.toString())
        }
        return movieList
    }

    suspend fun getMoviesFromDB(): List<Movie>? {
        var movieList: List<Movie>? = null
        try {
            val response = movieLocalDataSource.getMoviesFromDB()
        } catch (execption: Exception) {
            Log.i("MYTAG", execption.toString())
        }
        if (movieList?.size!! > 0) {
            return movieList
        } else {
            movieList = getMoviesFromApi()
            movieLocalDataSource.saveMoviesToDB(movieList!!)
        }
        return movieList
    }

    suspend fun getMoviesFromCache(): List<Movie> {
        var movieList: List<Movie>? = null
        try {
            val response = movieCacheDataSource.getMoviesFromCache()
        } catch (execption: Exception) {
            Log.i("MYTAG", execption.toString())
        }
        if (movieList?.size!! > 0) {
            return movieList
        } else {
            movieList = getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList!!)
        }
        return movieList
    }
}