package com.example.carrental

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

public class CatalogAdapter(private val mList: List<CatalogEntity>) : RecyclerView.Adapter<CatalogAdapter.ViewHolder>() {


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val Modelo: TextView = itemView.findViewById(R.id.Modelo)
        val Anio: TextView = itemView.findViewById(R.id.anio)
        val Marca: TextView = itemView.findViewById(R.id.Marca)
        val Color: TextView = itemView.findViewById(R.id.Color)
        val Descripcion: TextView = itemView.findViewById(R.id.Descripcion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.carditem_catalog, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        holder.imageView.setImageResource(ItemsViewModel.image)
        holder.Modelo.text = ItemsViewModel.Modelo
        holder.Anio.text = ItemsViewModel.Anio
        holder.Marca.text = ItemsViewModel.Marca
        holder.Color.text = ItemsViewModel.Color
        holder.Descripcion.text = ItemsViewModel.Descripcion
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}