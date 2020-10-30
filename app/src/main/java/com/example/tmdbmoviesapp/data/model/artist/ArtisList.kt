package com.example.tmdbmoviesapp.data.model.artist


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class ArtisList(
    /*  @SerializedName("page")
    val page: Int, // 1*/
    @SerializedName("results")
    val artists: List<Artist>,
    /* @SerializedName("total_pages")
     val totalPages: Int, // 500
     @SerializedName("total_results")
     val totalResults: Int // 10000*/
)