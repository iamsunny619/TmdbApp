package com.example.tmdbmoviesapp.data.model.movie


import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "popular_movies_table")
data class Movie(
 @PrimaryKey(autoGenerate = true)
 val id: Int, // 724989
 @SerializedName("original_language")
 val originalLanguage: String, // en
 @SerializedName("original_title")
 val originalTitle: String, // Hard Kill
 @SerializedName("overview")
 val overview: String, // The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.
 @SerializedName("popularity")
 val popularity: Double, // 2367.963
 @SerializedName("poster_path")
 val posterPath: String, // /ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg
 @SerializedName("release_date")
 val releaseDate: String, // 2020-10-23
 @SerializedName("title")
 val title: String, // Hard Kill
 @SerializedName("video")
 val video: Boolean, // false
 @SerializedName("vote_average")
 val voteAverage: Double, // 4.2
 @SerializedName("vote_count")
 val voteCount: Int // 28
)