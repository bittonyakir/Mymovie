package com.example.mymovie

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

import com.example.mymovie.databinding.ActivityChooseMovieBinding
import java.time.Instant

class Choose_movie : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityChooseMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val intent = Intent(this, date_time::class.java)
            startActivity(intent)
        }

            //val order = findViewById<Button>(R.id.button)
            //order.setOnClickListener {
                //val intent = Intent(this, date_time::class.java)
                //startActivity(intent)
            //}
        }
    }


