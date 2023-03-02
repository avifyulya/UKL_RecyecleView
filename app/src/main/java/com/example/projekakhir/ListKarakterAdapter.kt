package com.example.projekakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListKarakterAdapter (private val listKarakter: ArrayList<karakter>) : RecyclerView.Adapter<ListKarakterAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.nama_karakter)
        var tvFrom: TextView = itemView.findViewById(R.id.from_karakter)
        var imgPhoto: ImageView = itemView.findViewById(R.id.poto_karakter)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.karakter_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, from, photo) = listKarakter[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvFrom.text = from
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listKarakter[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listKarakter.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: karakter)
    }
}