package com.example.botones

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var etProfesion: EditText
    private lateinit var rgSexo: RadioGroup
    private lateinit var cbHobby1: CheckBox
    private lateinit var cbHobby2: CheckBox
    private lateinit var cbHobby3: CheckBox
    private lateinit var tvResultado: TextView
    private lateinit var btnEnviar: Button
    private lateinit var btnLimpiar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar vistas usando findViewById
        etNombre = findViewById(R.id.etNombre)
        etEdad = findViewById(R.id.etEdad)
        etProfesion = findViewById(R.id.etProfesion)
        rgSexo = findViewById(R.id.rgSexo)
        cbHobby1 = findViewById(R.id.cbHobby1)
        cbHobby2 = findViewById(R.id.cbHobby2)
        cbHobby3 = findViewById(R.id.cbHobby3)
        tvResultado = findViewById(R.id.tvResultado)
        btnEnviar = findViewById(R.id.btnEnviar)
        btnLimpiar = findViewById(R.id.btnLimpiar)

        // Configurar el botón Enviar
        btnEnviar.setOnClickListener {
            mostrarResultado()
        }

        // Configurar el botón Limpiar
        btnLimpiar.setOnClickListener {
            limpiarFormulario()
        }
    }

    // Método para mostrar el resultado en el TextView
    private fun mostrarResultado() {
        val nombre = etNombre.text.toString()
        val edad = etEdad.text.toString()
        val profesion = etProfesion.text.toString()

        // Obtener el sexo seleccionado
        val selectedSexoId = rgSexo.checkedRadioButtonId
        val sexo = if (selectedSexoId != -1) {
            findViewById<RadioButton>(selectedSexoId).text.toString()
        } else {
            "N/A"
        }

        // Obtener los hobbies seleccionados
        val hobbies = StringBuilder()
        if (cbHobby1.isChecked) hobbies.append("H1 ")
        if (cbHobby2.isChecked) hobbies.append("H2 ")
        if (cbHobby3.isChecked) hobbies.append("H3 ")

        // Mostrar los resultados en el TextView
        tvResultado.text = """
            Eres $nombre con edad $edad, tu sexo es $sexo
            Profesión: $profesion
            Y hobbies: $hobbies
        """.trimIndent()
    }

    // Método para limpiar el formulario y el resultado
    private fun limpiarFormulario() {
        etNombre.text.clear()
        etEdad.text.clear()
        etProfesion.text.clear()
        rgSexo.clearCheck()
        cbHobby1.isChecked = false
        cbHobby2.isChecked = false
        cbHobby3.isChecked = false
        tvResultado.text = ""
    }
}
