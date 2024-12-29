package com.example.botones

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Primero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primero)

        val btnIrFormulario: Button = findViewById(R.id.btnIrFormulario)

        btnIrFormulario.setOnClickListener {
            val intent = Intent(this, Formulario::class.java)
            startActivity(intent)
        }
    }
}