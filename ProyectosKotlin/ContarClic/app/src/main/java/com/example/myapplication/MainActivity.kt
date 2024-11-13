package com.example.myapplication

import android.R.integer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val txtContador = findViewById<TextView>(R.id.txtContador)
            val btnContador = findViewById<Button>(R.id.btnContador)

            btnContador.setOnClickListener {
                contador++
                txtContador.text = contador.toString()
            }

        }
    }

