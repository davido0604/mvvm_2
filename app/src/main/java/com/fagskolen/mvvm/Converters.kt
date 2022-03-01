package com.fagskolen.mvvm

object Converters {
    fun filmModelToViewModel(filmModel: FilmModel, filmViewModel: FilmViewModel) {
        filmViewModel.title = filmModel.title
        filmViewModel.releaseYear = (filmModel.releaseDate.year+1900).toString()
        filmViewModel.ageRating = filmModel.ageRating
        filmViewModel.duration = "${filmModel.durationMinute / 60}h ${filmModel.durationMinute % 60}m"
        filmViewModel.genres = filmModel.genres
        filmViewModel.rating = filmModel.rating
        filmViewModel.reviews = String.format("%,d", filmModel.reviews)
    }
}