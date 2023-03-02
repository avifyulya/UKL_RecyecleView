package com.example.projekakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridKarakterAdapter(val listkarakter: ArrayList<karakter>) : RecyclerView.Adapter<GridKarakterAdapter.GridViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: Any){
        this.onItemClickCallback= onItemClickCallback as OnItemClickCallback
    }
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var poto_karakter: ImageView = itemView.findViewById(R.id.galeri_karakter)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int) : GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.grid_karakter, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listkarakter[position].photo_karakter)
            .apply(RequestOptions().override(350, 550))
            .into(holder.poto_karakter)
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listkarakter[holder.adapterPosition])
        }
    }
    override fun getItemCount(): Int {
        return listkarakter.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: karakter)
    }
}