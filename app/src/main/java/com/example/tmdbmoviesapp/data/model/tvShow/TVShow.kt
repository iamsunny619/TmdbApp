package com.example.tmdbmoviesapp.data.model.tvShow


import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "popular_tvshow_table")
data class TVShow(
 @PrimaryKey(autoGenerate = true)
 @SerializedName("id")
 val id: Int, // 77169
 @SerializedName("name")
 val name: String, // Cobra Kai
 @SerializedName("origin_country")
 val originCountry: List<String>,
 @SerializedName("original_language")
 val originalLanguage: String, // en
 @SerializedName("original_name")
 val originalName: String, // Cobra Kai
 @SerializedName("overview")
 val overview: String, // This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.
 @SerializedName("popularity")
 val popularity: Double, // 662.769
 @SerializedName("poster_path")
 val posterPath: String, // /eTMMU2rKpZRbo9ERytyhwatwAjz.jpg
 @SerializedName("vote_average")
 val voteAverage: Int, // 8
 @SerializedName("vote_count")
 val voteCount: Int // 1010
)