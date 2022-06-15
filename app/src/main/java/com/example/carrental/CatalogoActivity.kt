package com.example.carrental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CatalogoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)
        val barAction = supportActionBar
        barAction?.setDisplayShowHomeEnabled(true)
        barAction?.setIcon(R.drawable.coche)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val CatalogEntityList = ArrayList<CatalogEntity>()
        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.suv,
                "Suburban",
                "2022",
                "Chevrolet",
                "Blanco",
                "Nuevo camioneta Suburban!"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.sedan,
                "Sedan",
                "2022",
                "Audi",
                "Negro",
                "Gran carro sedan, semi-nuevo"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.coupe,
                "Coupe",
                "2022",
                "BMW",
                "Negro",
                "Clasico carro de BWM, como nuevo!"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.barbie,
                "Beatle",
                "1998",
                "Matel",
                "Rosa",
                "I'm a Barbie girl, in the Barbie world\n" +
                        "Life in plastic, it's fantastic\n" +
                        "You can brush my hair, undress me everywhere\n" +
                        "Imagination, life is your creation\n" +
                        "Come on, Barbie, let's go party"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.batimovil,
                "Batimovil",
                "2008",
                "Batimarca",
                "Dark knight ",
                "You Either Die A Hero Or You Live Long Enough To See Yourself Become The Villain."
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.delorian,
                "Delorean",
                "1982",
                "DeLorean",
                "Gris",
                "Soy tu dencidad, quiero decir, tu destino <3"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.ghostgusters,
                "Ecto-1",
                "1959",
                "Cadillac ",
                "Blanco ",
                "Who you gonna call ?"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.papamovil,
                "Papamovil ",
                "2022 DC",
                "Vaticano city",
                "Blanco",
                "Amen"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.mcqueen,
                "Corvette C6",
                "2006",
                "Chevrolet ",
                "Rojo",
                "Mate eso nunca paso"
            )
        )

        CatalogEntityList.add(
            CatalogEntity(
                R.drawable.hamburguesa,
                "Cangremovil",
                "2008",
                "krusty krab",
                "Amarillo",
                "Acabado de semillas de sesamo, ruedas de pepinillos, interior de cuero asado y debajo un freidor de papas con inyeccion disel y doble filtro para la grasa"
            )
        )
        val adapter = CatalogAdapter(CatalogEntityList)
        recyclerview.adapter = adapter
    }
}