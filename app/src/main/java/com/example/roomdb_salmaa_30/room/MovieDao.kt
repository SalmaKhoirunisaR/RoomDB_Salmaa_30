package com.example.roomdb_salmaa_30.room

import androidx.room.*

@Dao
interface MovieDao {

    @Insert
    suspend fun addMovie(movie: com.example.roomdb_salmaa_30.room.Movie)

    @Update
    suspend fun updateMovie(movie: Movie)

    @Delete
    suspend fun deleteMovie(movie: Movie)

    @Query("SELECT * FROM movie")
    suspend fun getMovies():List<Movie>
}