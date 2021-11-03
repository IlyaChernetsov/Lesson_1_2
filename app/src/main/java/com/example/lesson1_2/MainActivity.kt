package com.example.lesson1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showText(view: View){
        Toast.makeText(this, "Text Created", Toast.LENGTH_SHORT).show()
    }

    fun creatingRandomNumbers(view: View){
        var counter:Int = (0..1000).random()
        val setter:TextView = findViewById(R.id.text_Number)
        setter.text = counter.toString()
    }
}