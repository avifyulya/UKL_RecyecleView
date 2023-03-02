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

class CardViewAdapter(private val listanimecv: ArrayList<Anime>) : RecyclerView.Adapter<CardViewAdapter.CardViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardviewkarakter, parent, false)
        return CardViewHolder(view)
    }
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val (nama, genre, studio, photo) = listanimecv[position]


        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)


        holder.tvName.text = nama
        holder.tvGenre.text = genre
        holder.tvStudio.text = studio
        holder.btnFavorite.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Favorite " + listanimecv[position].nama, Toast.LENGTH_SHORT).show()
        }
        holder.btnDownload.setOnClickListener{
            Toast.makeText(holder.itemView.context,"Download " + listanimecv[position].nama, Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listanimecv[position].nama, Toast.LENGTH_SHORT).show()
        }


        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listanimecv[holder.adapterPosition].nama, Toast.LENGTH_SHORT).show() }


        holder.btnDownload.setOnClickListener { Toast.makeText(holder.itemView.context, "Download " + listanimecv[holder.adapterPosition].nama, Toast.LENGTH_SHORT).show() }


        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listanimecv[holder.adapterPosition].nama, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listanimecv.size
    }


    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.potocv1)
        var tvName: TextView = itemView.findViewById(R.id.tvnama_cv)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_deskripsi_cv)
        var tvStudio: TextView = itemView.findViewById(R.id.tv_studiocv)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_favorite_cv)
        var btnDownload: Button = itemView.findViewById(R.id.btn_download_cv)
    }

}