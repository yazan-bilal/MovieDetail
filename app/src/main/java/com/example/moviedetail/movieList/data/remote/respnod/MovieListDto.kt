package com.example.moviedetail.movieList.data.remote.respnod

import com.example.moviedetail.movieList.data.remote.respnod.MovieDto

data class MovieListDto(
    val page: Int,
    val results: List<MovieDto>,
    val total_pages: Int,
    val total_results: Int
)