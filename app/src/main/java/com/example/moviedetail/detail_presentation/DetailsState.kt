package com.example.moviedetail.detail_presentation

import com.example.moviedetail.movieList.domain.model.Movie


data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
