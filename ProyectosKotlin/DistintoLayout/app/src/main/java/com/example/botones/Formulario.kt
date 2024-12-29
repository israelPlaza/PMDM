package com.example.botones

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        // Referencias a los campos del formulario
        val etNombre: EditText = findViewById(R.id.etNombre)
        val etEdad: EditText = findViewById(R.id.etEdad)
        val rgSexo: RadioGroup = findViewById(R.id.rgSexo)
        val etProfesion: EditText = findViewById(R.id.etProfesion)
        val cbHobby1: CheckBox = findViewById(R.id.cbHobby1)
        val cbHobby2: CheckBox = findViewById(R.id.cbHobby2)
        val cbHobby3: CheckBox = findViewById(R.id.cbHobby3)
        val btnEnviar: Button = findViewById(R.id.btnEnviar)
        val btnLimpiar: Button = findViewById(R.id.btnLimpiar)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        // Botón Enviar
        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val edad = etEdad.text.toString()
            val profesion = etProfesion.text.toString()

            // Obtener el sexo seleccionado
            val sexo = when (rgSexo.checkedRadioButtonId) {
                R.id.rbFemenino -> "Femenino"
                R.id.rbMasculino -> "Masculino"
                else -> "No especificado"
            }

            // Obtener los hobbies seleccionados
            val hobbies = mutableListOf<String>()
            if (cbHobby1.isChecked) hobbies.add(cbHobby1.text.toString())
            if (cbHobby2.isChecked) hobbies.add(cbHobby2.text.toString())
            if (cbHobby3.isChecked) hobbies.add(cbHobby3.text.toString())

            // Validar campos
            if (nombre.isEmpty() || edad.isEmpty() || profesion.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos obligatorios.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Pasar los datos a ResultadoActivity
            val intent = Intent(this, Resultado::class.java).apply {
                putExtra("NOMBRE", nombre)
                putExtra("EDAD", edad)
                putExtra("SEXO", sexo)
                putExtra("PROFESION", profesion)
                putExtra("HOBBIES", hobbies.joinToString(", "))
            }
            startActivity(intent)
        }

        // Botón Limpiar
        btnLimpiar.setOnClickListener {
            etNombre.text.clear()
            etEdad.text.clear()
            rgSexo.clearCheck()
            etProfesion.text.clear()
            cbHobby1.isChecked = false
            cbHobby2.isChecked = false
            cbHobby3.isChecked = false
            tvResultado.text = ""
        }
    }
}
