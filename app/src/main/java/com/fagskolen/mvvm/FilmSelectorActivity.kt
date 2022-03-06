package com.fagskolen.mvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class FilmSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_selector)

        bindbuttons()
    }
    private fun bindbuttons() {
        findViewById<Button>(R.id.button_spiderman).setOnClickListener{
            val intent = Intent(this, FilmActivity::class.java).apply {
                putExtra("film", 1)
            }
            startActivity(intent)
        }
        findViewById<Button>(R.id.button_hawkeye).setOnClickListener{
            val intent = Intent(this, FilmActivity::class.java).apply {
                putExtra("film", 2)
            }
            startActivity(intent)
        }
    }
}

