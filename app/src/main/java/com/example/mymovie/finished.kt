package com.example.mymovie

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.mymovie.databinding.ActivityDateTimeBinding
import com.example.mymovie.databinding.ActivityFinishedBinding
import java.text.SimpleDateFormat
import java.util.Calendar

class finished : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityFinishedBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val name =intent.getStringExtra("name")
        val nameTextView = findViewById<TextView>(R.id.nameUser)
        nameTextView.text = name

        setContentView(binding.root)
        val tickets =intent.getStringExtra("total")
        val nameTickets = findViewById<TextView>(R.id.ticket)
        nameTickets.text = tickets

        val selectedTicketTextView = findViewById<TextView>(R.id.ticket)
        selectedTicketTextView.text = "you order: $tickets ticket/s"

        val myImage = findViewById<ImageView>(R.id.imageView2)
        val animation = AnimationUtils.loadAnimation(this, R.anim.pop_scale)
        myImage.visibility = View.VISIBLE
        myImage.startAnimation(animation)

        val mytext = findViewById<TextView>(R.id.enjoy)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.pop_scale2)
        mytext.visibility = View.VISIBLE
        mytext.startAnimation(animation2)

        val selectedDate = intent.getLongExtra("selectedDate", 0)
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = selectedDate
        val formattedDate = SimpleDateFormat.getDateInstance().format(calendar.time)

        val selectedDateTextView = findViewById<TextView>(R.id.selectedDateTextView)
        selectedDateTextView.text = "your order will be at: $formattedDate"

    }
}