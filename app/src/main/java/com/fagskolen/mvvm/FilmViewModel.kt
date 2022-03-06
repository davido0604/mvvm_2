package com.fagskolen.mvvm

import androidx.lifecycle.ViewModel

class FilmViewModel() : ViewModel() {
    var title: String = ""
    var releaseYear: String = ""
    var ageRating: String = ""
    var duration: String = ""
    var genres: MutableList<String> = mutableListOf()
    var rating: String = ""
    var reviews: String = ""
}