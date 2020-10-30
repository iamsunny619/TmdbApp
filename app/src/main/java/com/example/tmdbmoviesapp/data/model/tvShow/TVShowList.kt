package com.example.tmdbmoviesapp.data.model.tvShow


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class TVShowList(
   /* @SerializedName("page")
    val page: Int, // 1*/
    @SerializedName("results")
    val TVShows: List<TVShow>,
  /*  @SerializedName("total_pages")
    val totalPages: Int, // 500
    @SerializedName("total_results")
    val totalResults: Int // 10000*/
)