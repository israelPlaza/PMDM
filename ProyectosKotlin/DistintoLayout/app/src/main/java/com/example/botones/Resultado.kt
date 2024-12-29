package com.example.botones

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val tvResultados: TextView = findViewById(R.id.tvResultados)

        // Recuperar los datos pasados desde FormularioActivity
        val nombre = intent.getStringExtra("NOMBRE")
        val edad = intent.getStringExtra("EDAD")
        val sexo = intent.getStringExtra("SEXO")
        val profesion = intent.getStringExtra("PROFESION")
        val hobbies = intent.getStringExtra("HOBBIES")

        // Mostrar los datos en la pantalla
        tvResultados.text = """
            Nombre: $nombre
            Edad: $edad
            Sexo: $sexo
            Profesión: $profesion
            Hobbies: $hobbies
        """.trimIndent()
    }
}