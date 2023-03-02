package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DaftarAnime : AppCompatActivity() {
    private var rvAnime: RecyclerView?=null
    private var list:ArrayList<Anime> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_anime)
        rvAnime = findViewById(R.id.rv_anime)
        rvAnime?.setHasFixedSize(true)

        list.addAll(AnimeData.listData)
        showRecyclerlist()
    }

    private fun showRecyclerlist() {
        rvAnime?.layoutManager= LinearLayoutManager(this)
        val listAnimeAdapter = ListAnimeAdapter(list)
        rvAnime?.adapter=listAnimeAdapter

        listAnimeAdapter.setOnItemClickCallback(object : ListAnimeAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Anime){
                showSelectedAnime(data)
            }
        })
    }

    private fun showSelectedAnime(anime: Anime) {
        Toast.makeText(this,"Kamu memilih " + anime.nama, Toast.LENGTH_SHORT).show()
    }
}