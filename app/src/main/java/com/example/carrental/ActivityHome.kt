package com.example.carrental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class ActivityHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val spinner = findViewById<Spinner>(R.id.spn1,);
        val spinner2 = findViewById<Spinner>(R.id.spn2,);
        val lista = listOf("Zapopan", "Guadalajara", "Tlajomulco");
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);
        val adaptador2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);
        spinner.adapter = adaptador;
        spinner2.adapter = adaptador2;
    }
}