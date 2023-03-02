package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Galeri_Activity : AppCompatActivity() {

    private var rvGaleri: RecyclerView? = null
    private var grid: ArrayList<Galeri> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)
        rvGaleri = findViewById(R.id.rv_galerianime)
        rvGaleri?.setHasFixedSize(true)

        grid.addAll(GaleriData.listData)
        showRecyclerGrid()
    }

    private fun showRecyclerGrid() {
        rvGaleri?.layoutManager = GridLayoutManager(this, 2)
        val gridAnime = GridAnime(grid!!)
        rvGaleri?.adapter = gridAnime

//        gridAnime.setOnItemClickCallBack(object : GridAnime.OnItemClickCallback{
//            override fun onItemClicked(data: Galeri) {
//                showSelectedAnime(data)
//            }
//        })
    }

//    private fun showSelectedAnime(galeri: Galeri) {
//        Toast.makeText(this, "Kamu memilih " + galeri.photo, Toast.LENGTH_SHORT).show()
//    }

}