package com.example.writecode.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.writecode.R

class IntroActivity : AppCompatActivity() {
    private lateinit var editTextDecimal: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro) // Use o layout correto aqui

        editTextDecimal = findViewById(R.id.editTextNumberDecimal)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            if (editTextDecimal.text.toString().isEmpty()) {
                Toast.makeText(this, "Preencha o campo antes de continuar", Toast.LENGTH_SHORT).show() // Chame .show()
            } else {
                // Ação a ser realizada se o EditText não estiver vazio
            }
        }
    }
}
