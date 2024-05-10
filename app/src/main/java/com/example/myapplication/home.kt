package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val button=findViewById<View>(R.id.view2)
        button.setOnClickListener{
            val Intent= Intent( this,Book_1::class.java)
            startActivity(Intent)
        }

        val img=findViewById<ImageView>(R.id.imageView7)
        img.setOnClickListener{
            val Intent= Intent( this,Profile::class.java)
            startActivity(Intent)
        }

        val txt=findViewById<TextView>(R.id.textView2)
        txt.setOnClickListener{
            val Intent= Intent( this,home_2::class.java)
            startActivity(Intent)
        }

        val img2=findViewById<ImageView>(R.id.imageView17)
        img2.setOnClickListener{
            val Intent= Intent( this,home_2::class.java)
            startActivity(Intent)
        }
    }
}