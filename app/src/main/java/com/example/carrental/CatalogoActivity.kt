package com.example.carrental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CatalogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)
        val barAction = supportActionBar
        barAction?.setDisplayShowHomeEnabled(true)
        barAction?.setIcon(R.drawable.coche)
    }
}