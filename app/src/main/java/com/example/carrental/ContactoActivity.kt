package com.example.carrental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)
        var btn = findViewById<Button>(R.id.btne);
        btn.setOnClickListener{
            Toast.makeText(this, "Gracias por los comentarios", Toast.LENGTH_SHORT).show()
        }
        val barAction = supportActionBar
        barAction?.setDisplayShowHomeEnabled(true)
        barAction?.setIcon(R.drawable.coche)
    }
}