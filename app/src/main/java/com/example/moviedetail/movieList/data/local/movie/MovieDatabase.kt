package com.ahmedapps.moviesinfo.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.moviedetail.movieList.data.local.movie.MovieDao
import com.example.moviedetail.movieList.data.local.movie.MovieEntity

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}