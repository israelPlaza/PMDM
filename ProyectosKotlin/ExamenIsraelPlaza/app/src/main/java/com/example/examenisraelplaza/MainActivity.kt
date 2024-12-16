package com.example.examenisraelplaza

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.cajaNombre)
        val sportsCheckBox = findViewById<CheckBox>(R.id.deporte)
        val readingCheckBox = findViewById<CheckBox>(R.id.cajaLectura)
        val moviesCheckBox = findViewById<CheckBox>(R.id.cajaPeliculas)
        val othersCheckBox = findViewById<CheckBox>(R.id.cajaOtros)
        val othersEditText = findViewById<EditText>(R.id.escrbirhobbies)
        val submitButton = findViewById<Button>(R.id.botonEnviar)
        val clearButton = findViewById<Button>(R.id.botonLimpiar)
        val resultTextView = findViewById<TextView>(R.id.textoResultado)

        othersCheckBox.setOnCheckedChangeListener { _, isChecked ->
            othersEditText.visibility = if (isChecked) View.VISIBLE else View.GONE
        }

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            if (name.isEmpty()) {
                resultTextView.text = getString(R.string.error_name_required)
                return@setOnClickListener
            }

            val hobbies = mutableListOf<String>()
            if (sportsCheckBox.isChecked) hobbies.add(getString(R.string.checkbox_sports))
            if (readingCheckBox.isChecked) hobbies.add(getString(R.string.checkbox_reading))
            if (moviesCheckBox.isChecked) hobbies.add(getString(R.string.checkbox_movies))
            if (othersCheckBox.isChecked) {
                val otherHobby = othersEditText.text.toString().trim()
                if (otherHobby.isNotEmpty()) hobbies.add(otherHobby)
            }

            val hobbiesCount = hobbies.size
            resultTextView.text = if (hobbiesCount == 0) {
                getString(R.string.result_no_hobbies, name)
            } else {
                getString(R.string.result_with_hobbies, name, hobbiesCount, hobbies.joinToString(", "))
            }
        }

        clearButton.setOnClickListener {
            nameEditText.text.clear()
            sportsCheckBox.isChecked = false
            readingCheckBox.isChecked = false
            moviesCheckBox.isChecked = false
            othersCheckBox.isChecked = false
            othersEditText.text.clear()
            resultTextView.text = ""
        }
    }
}
