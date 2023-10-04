package com.example.ejercicio9

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editTextText2)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener( {
            val textoEscrito = editText.text.toString()
            textView.text = "El texto que has escrito es: $textoEscrito"
        })
    }
}