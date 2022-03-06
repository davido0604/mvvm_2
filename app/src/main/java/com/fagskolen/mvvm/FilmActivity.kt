package com.fagskolen.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider

class FilmActivity : AppCompatActivity() {
    val filmViewModel: FilmViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film)
        supportActionBar?.hide()

        //filmViewModel = ViewModelProvider(this).get(FilmViewModel::class.java)
        val filmID = intent.getIntExtra("film",0)
        val filmModel = DataStorage.loadFilm(filmID)
        Converters.filmModelToViewModel(filmModel, filmViewModel)
        show(filmViewModel)
    }

    private fun show(filmViewModel: FilmViewModel) {
        findViewById<TextView>(R.id.title).text = filmViewModel.title
        findViewById<TextView>(R.id.ageRating).text = filmViewModel.ageRating
        findViewById<TextView>(R.id.year).text = filmViewModel.releaseYear
        findViewById<TextView>(R.id.duration).text = filmViewModel.duration
        //findViewById<TextView>(R.id.genre).text = filmViewModel.genres
        findViewById<Button>(R.id.genre1).text = filmViewModel.genres[0]
        findViewById<Button>(R.id.genre2).text = filmViewModel.genres[1]
        findViewById<Button>(R.id.genre3).text = filmViewModel.genres[2]
        findViewById<TextView>(R.id.rating).text = filmViewModel.rating
        findViewById<TextView>(R.id.reviews).text = filmViewModel.reviews
    }
}