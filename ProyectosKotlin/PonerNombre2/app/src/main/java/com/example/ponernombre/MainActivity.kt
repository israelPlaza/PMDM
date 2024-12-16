package com.example.ponernombre

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etNombre: EditText = findViewById(R.id.et_nombre)
        val btnMostrar: Button = findViewById(R.id.btn_mostrar)
        val tvResultado: TextView = findViewById(R.id.tv_resultado)


        btnMostrar.setOnClickListener {
            val nombre = etNombre.text.toString()
            tvResultado.text = "El nombre es: $nombre"
        }
    }
}