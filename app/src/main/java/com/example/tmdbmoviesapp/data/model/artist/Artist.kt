package com.example.tmdbmoviesapp.data.model.artist


import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "popular_artists_table")
data class Artist(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    val id: Int, // 1245
    @SerializedName("name")
    val name: String, // Scarlett Johansson
    @SerializedName("popularity")
    val popularity: Double, // 44.572
    @SerializedName("profile_path")
    val profilePath: String // /6NsMbJXRlDZuDzatN2akFdGuTvx.jpg
)