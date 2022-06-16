package com.example.carrental

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.ViewFlipper
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    var v_flipper: ViewFlipper? = null
    //var btn: Button = findViewById(R.id.btnh)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        /*btn.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java);
            startActivity(intent);
        }*/

        val barAction = supportActionBar
        val loader = ProgressBar(this)
        val navView: BottomNavigationView = findViewById(R.id.main_bottom_navigation)

        barAction?.setDisplayShowHomeEnabled(true)
        barAction?.setIcon(R.drawable.coche)


        loader.startLoading()


        Handler(Looper.getMainLooper()).postDelayed({
            loader.dismiss()
            supportActionBar?.show()
        }, 3000)

        val images = intArrayOf(R.drawable.coupe, R.drawable.sedan, R.drawable.suv)
        v_flipper = findViewById(R.id.v_flipper)
        for (image in images) {
            FlipperImagenes(image)
    }

        navView.setOnItemReselectedListener { item ->
            when(item.itemId){
                R.id.home -> {
                    startActivity(Intent(this,ActivityHome::class.java))
                    true
                }
                R.id.contacto ->{
                    startActivity(Intent(this, ContactoActivity::class.java))
                    true
                }
                R.id.catalogo -> {
                    startActivity(Intent(this, CatalogoActivity::class.java))
                    true
                }
                else -> false
            }

        }

    }
    fun FlipperImagenes(image: Int) {
        val imageView = ImageView(this)
        imageView.setBackgroundResource(image)
        v_flipper!!.addView(imageView)
        v_flipper!!.flipInterval = 3000
        v_flipper!!.isAutoStart = true
        v_flipper!!.setInAnimation(this, android.R.anim.slide_in_left)
        v_flipper!!.setOutAnimation(this, android.R.anim.slide_out_right)
    }


}


