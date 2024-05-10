package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home2)

        val img=findViewById<ImageView>(R.id.imageView7)
        img.setOnClickListener{
            val Intent= Intent( this,Profile::class.java)
            startActivity(Intent)
        }
        val btn=findViewById<ImageView>(R.id.imageView4)
        btn.setOnClickListener{
            val Intent= Intent( this,home::class.java)
            startActivity(Intent)
        }

        val img3=findViewById<ImageView>(R.id.imageView36)
        img3.setOnClickListener{
            val Intent= Intent( this,Book_1::class.java)
            startActivity(Intent)
        }
        val view=findViewById<View>(R.id.view4)
        view.setOnClickListener{
            val Intent= Intent( this,home::class.java)
            startActivity(Intent)
        }
    }
}