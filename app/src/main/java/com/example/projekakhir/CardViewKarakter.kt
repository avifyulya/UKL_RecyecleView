package com.example.projekakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewKarakter (private val listkarakter: ArrayList<karakter>) : RecyclerView.Adapter<CardViewKarakter.CardViewViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardview_karakter, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val (nama_karakter, from_karakter, photo_karakter) = listkarakter[position]


        Glide.with(holder.itemView.context)
            .load(photo_karakter)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)


        holder.tvName.text = nama_karakter
        holder.tvFrom.text = from_karakter
        holder.btnFavorite.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Favorite " + listkarakter[position].nama_karakter, Toast.LENGTH_SHORT).show()
        }
        holder.btnShare.setOnClickListener{
            Toast.makeText(holder.itemView.context,"Share " + listkarakter[position].nama_karakter, Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listkarakter[position].nama_karakter, Toast.LENGTH_SHORT).show()
        }


        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listkarakter[holder.adapterPosition].nama_karakter, Toast.LENGTH_SHORT).show() }


        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listkarakter[holder.adapterPosition].nama_karakter, Toast.LENGTH_SHORT).show() }


        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listkarakter[holder.adapterPosition].nama_karakter, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listkarakter.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.potocvkarakter)
        var tvName: TextView = itemView.findViewById(R.id.tvnama_cvkarakter)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_deskripsi_cvkarakter)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_favorite_cvkarakter)
        var btnShare: Button = itemView.findViewById(R.id.btn_download_cvkarakter)
    }
}