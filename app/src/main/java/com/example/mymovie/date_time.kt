package com.example.mymovie

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.widget.Button
import android.widget.CalendarView
import android.widget.CheckBox
import com.example.mymovie.databinding.ActivityChooseMovieBinding
import com.example.mymovie.databinding.ActivityDateTimeBinding
import java.util.*

class date_time : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityDateTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4)

        val button = findViewById<Button>(R.id.button2)
        button.isEnabled = false
        checkBox1.setOnCheckedChangeListener { _, isChecked ->
            button.isEnabled =
                isChecked || checkBox2.isChecked || checkBox3.isChecked || checkBox4.isChecked
        }
        checkBox2.setOnCheckedChangeListener { _, isChecked ->
            button.isEnabled =
                isChecked || checkBox1.isChecked || checkBox3.isChecked || checkBox4.isChecked
        }
        checkBox3.setOnCheckedChangeListener { _, isChecked ->
            button.isEnabled =
                isChecked || checkBox1.isChecked || checkBox2.isChecked || checkBox4.isChecked
        }
        checkBox4.setOnCheckedChangeListener { _, isChecked ->
            button.isEnabled =
                isChecked || checkBox1.isChecked || checkBox2.isChecked || checkBox3.isChecked
        }
        binding.button2.setOnClickListener {
            val intent = Intent(this, finished::class.java)
            startActivity(intent)

        val username = findViewById<TextInputEditText>(R.id.inputuser)
        val name = username.text.toString()
        //val intent = Intent(this, finished::class.java)
        intent.putExtra("name", name)
        startActivity(intent)

        val tickets = findViewById<TextInputEditText>(R.id.ticket)
        val total = tickets.text.toString()
         //val intent = Intent(this, finished::class.java)
        intent.putExtra("total", total)
        startActivity(intent)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        val selectedDate = Calendar.getInstance()

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            selectedDate.set(year, month, dayOfMonth)
        }

        val date = Intent(this, finished::class.java)
        intent.putExtra("selectedDate", selectedDate.timeInMillis)
        startActivity(intent)

        }
    }
}