package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAnimeAdapter (private  val listAnime: ArrayList<Anime>): RecyclerView.Adapter<ListAnimeAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama_anime)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_genre_anime)
        var tvStudio: TextView = itemView.findViewById(R.id.tv_produksi_studio)
        var imgPhoto: ImageView = itemView.findViewById(R.id.poto)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
       val view: View= LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_list_anime_adapter, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (nama, genre, studio, poto) = listAnime[position]

        Glide.with(holder.itemView.context)
            .load(poto)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)
        holder.tvNama.text = nama
        holder.tvGenre.text = genre
        holder.tvStudio.text = studio
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listAnime[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listAnime.size
    }
    interface OnItemClickCallback{
        fun onItemClicked(data: Anime)
    }
}