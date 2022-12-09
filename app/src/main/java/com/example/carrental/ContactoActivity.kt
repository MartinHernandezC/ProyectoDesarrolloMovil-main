package com.example.carrental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)
        var btn = findViewById<Button>(R.id.btnSubmit);
        var check : CheckBox = findViewById(R.id.checkBox)

        btn.setOnClickListener{
            if(check.isChecked){
                Toast.makeText(this, "Gracias por los comentarios", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "ACEPTE LOS TERMINOS Y CONDICIONES Perro", Toast.LENGTH_SHORT).show()
            }

        }
        val barAction = supportActionBar
        barAction?.setDisplayShowHomeEnabled(true)
        barAction?.setIcon(R.drawable.coche)


    }
}