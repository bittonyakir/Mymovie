package com.example.mymovie

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.mymovie.databinding.ActivityMainBinding

private fun Button.setOnClickListener(
    onClickListener: View.OnClickListener,
    function: () -> Nothing
) {

}
private fun intent(mainActivity: MainActivity, java: Class<Choose_movie>): Intent? {
    TODO("Not yet implemented")
}


class MainActivity : AppCompatActivity() {

    companion object {
        const val movie_name = "movie_name"
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.chooseBtn.setOnClickListener {
            val name = binding.MovieName.text.toString()
            val intent = intent(this, Choose_movie::class.java)?.apply {
                putExtra(movie_name, name)
            }
            startActivity(intent)
        }
        val movie = findViewById<ImageButton>(R.id.choose_btn)
        movie.setImageResource(R.drawable.returnoftheking)
        movie.setOnClickListener {
            val intent = Intent(this, Choose_movie::class.java)
            startActivity(intent)
        }

    }
}








