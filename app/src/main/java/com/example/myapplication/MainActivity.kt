package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button4=findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val Intent= Intent( this,Login::class.java)
            startActivity(Intent)
        }
        val button=findViewById<Button>(R.id.button5)
        button.setOnClickListener{
            val Intent= Intent( this,Register::class.java)
            startActivity(Intent)
        }
        val button1=findViewById<Button>(R.id.button6)
        button1.setOnClickListener{
            val Intent= Intent( this,home::class.java)
            startActivity(Intent)
        }
    }
}