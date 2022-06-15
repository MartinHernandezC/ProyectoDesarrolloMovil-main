package com.example.carrental

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class ActivityHome : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val barAction = supportActionBar
        barAction?.setDisplayShowHomeEnabled(true)
        barAction?.setIcon(R.drawable.coche)

        val spinner = findViewById<Spinner>(R.id.spn1);
        val spinner2 = findViewById<Spinner>(R.id.spn2);
        val lista = listOf("Zapopan", "Guadalajara", "Tlajomulco");
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);
        val adaptador2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);
        spinner.adapter = adaptador;
        spinner2.adapter = adaptador2;
        val editText: EditText = findViewById(R.id.etDate1);
        val et2 = findViewById<EditText>(R.id.etDate2);
        val horaRecepcion = findViewById<EditText>(R.id.HoraRecepcion)
        val HoraEntrega = findViewById<EditText>(R.id.HoraEntrega)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val timePickerDialog = TimePickerDialog(this,
            { timePicker, hourOfDay, minutes -> horaRecepcion.setText("Recepcion: $hourOfDay $minutes") },
            0,
            0,
            false
        )

        horaRecepcion.setOnClickListener{
            timePickerDialog.show();
        }

        val timePickerDialog2 = TimePickerDialog(this,
            { timePicker, hourOfDay, minutes -> HoraEntrega.setText("Entrega: $hourOfDay $minutes") },
            0,
            0,
            false
        )

        HoraEntrega.setOnClickListener{
            timePickerDialog2.show();
        }

        editText.setOnClickListener {
            val dpd = DatePickerDialog(
                this@ActivityHome,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->


                    editText.setText("" + dayOfMonth + "/" + monthOfYear + "/" + year)

                },
                year,
                month,
                day
            )

            dpd.show()

        }
        et2.setOnClickListener{
            val dpd2 = DatePickerDialog(
                this@ActivityHome,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->


                    et2.setText("" + dayOfMonth + "/" + monthOfYear + "/" + year)

                },
                year,
                month,
                day
            )

            dpd2.show()

        }
        val btn = findViewById<Button>(R.id.button4);
        btn.setOnClickListener(){
            Toast.makeText( this, "Se han guardado los datos", Toast.LENGTH_SHORT).show()
        }
    }
}