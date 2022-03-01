package com.fagskolen.mvvm

import androidx.lifecycle.ViewModel

class FilmViewModel() : ViewModel() {
    var title: String = ""
    var releaseYear: String = ""
    var ageRating: String = ""
    var duration: String = ""
    var genres: MutableList<String> = mutableListOf()
    var rating: Float = 0.0f
    var reviews: String = ""
}