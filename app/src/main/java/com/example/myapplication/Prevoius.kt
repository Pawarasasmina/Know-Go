package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Prevoius : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_previous)

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
        val btn2=findViewById<Button>(R.id.button8)
        btn2.setOnClickListener{
            val Intent= Intent( this,Edit::class.java)
            startActivity(Intent)
        }
        val btn3=findViewById<Button>(R.id.button9)
        btn3.setOnClickListener{
            val Intent= Intent( this,home::class.java)
            startActivity(Intent)
        }
        val view=findViewById<View>(R.id.view4)
        view.setOnClickListener{
            val Intent= Intent( this,home::class.java)
            startActivity(Intent)
        }
    }
}