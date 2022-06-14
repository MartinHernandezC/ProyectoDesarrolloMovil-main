package com.example.carrental

import android.app.Activity
import android.app.AlertDialog
import android.view.animation.Animation
import android.widget.TextView
import java.util.logging.Handler

class ProgressBar(val myActivity: Activity){
    private lateinit var dialog: AlertDialog

    fun startLoading(){
        val inflater = myActivity.layoutInflater
        val dialogView = inflater.inflate(R.layout.progress_bar_item,null)

        val builder = AlertDialog.Builder(myActivity)
        builder.setView(dialogView)
        builder.setCancelable(false)
        dialog = builder.create()
        dialog.show()
    }

    fun dismiss(){
        dialog.dismiss()
    }
}