package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridAnime (val Galeri:ArrayList<Galeri>) : RecyclerView.Adapter<GridAnime.GridViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallBack(onItemClickCallback: Any){
        this.onItemClickCallback = onItemClickCallback as OnItemClickCallback
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var photo: ImageView = itemView.findViewById(R.id.poto1)
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int) : GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_grid_anime, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(Galeri[position].photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.photo)
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(Galeri[holder.absoluteAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return Galeri.size
    }
    interface OnItemClickCallback{
        fun onItemClicked(data: Galeri)
    }
}