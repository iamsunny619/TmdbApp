package com.example.tmdbmoviesapp.data.api

import com.example.tmdbmoviesapp.data.model.artist.ArtisList
import com.example.tmdbmoviesapp.data.model.movie.MovieList
import com.example.tmdbmoviesapp.data.model.tvShow.TVShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbService {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShow(@Query("api_key") apiKey: String): Response<TVShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(@Query("api_key") apiKey: String): Response<ArtisList>
}