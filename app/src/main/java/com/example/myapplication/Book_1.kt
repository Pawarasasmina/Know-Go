package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Book_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book1)
        val button=findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val Intent= Intent( this,Book_2::class.java)
            startActivity(Intent)
        }
        val btn=findViewById<ImageView>(R.id.imageView4)
        btn.setOnClickListener{
            val Intent= Intent( this,home::class.java)
            startActivity(Intent)
        }

        val img=findViewById<ImageView>(R.id.imageView7)
        img.setOnClickListener{
            val Intent= Intent( this,Profile::class.java)
            startActivity(Intent)
        }

        val btn2=findViewById<Button>(R.id.button)
        btn2.setOnClickListener{
            val Intent= Intent( this,home::class.java)
            startActivity(Intent)
        }
    }
}