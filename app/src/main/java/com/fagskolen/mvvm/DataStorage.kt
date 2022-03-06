package com.fagskolen.mvvm

import kotlinx.coroutines.delay
import java.util.*


object DataStorage {
    /**
     * @param filmId : 1 for Spider-Man, 2 for Hawkeye
     */
     fun loadFilm(filmId: Int): FilmModel {
        return when (filmId) {
            1 -> FilmModel(
                title = "Spider-Man: No Way Home",
                ageRating = "12A",
                releaseDate = Date(121, 11, 13),
                durationMinute = 148,
                //description = "With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.",
                //posterResource = R.drawable.spiderman
                genres = mutableListOf("Action", "Drama", "Comedy"),
                rating = 6.9f,
                reviews = 633234)

            2 -> FilmModel(
                title = "Hawkeye",
                ageRating = "TV-14",
                releaseDate = Date(121, 10, 11),
                durationMinute = 60,
                //description = "Series based on the Marvel Comics superhero Hawkeye, centering on the adventures of Young Avenger, Kate Bishop, who took on the role after the original Avenger, Clint Barton.",
                //posterResource = R.drawable.hawkeye
                genres = mutableListOf("Action", "Drama", "Comedy"),
                rating = 6.9f,
                reviews = 633234)

            else -> throw IllegalArgumentException("Ingen film med id $filmId")
        }
    }
}