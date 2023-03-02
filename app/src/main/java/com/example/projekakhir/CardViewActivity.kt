package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CardViewActivity : AppCompatActivity() {

    private var rvCardView: RecyclerView? = null
    private var cvanime: ArrayList<Anime> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        rvCardView = findViewById(R.id.rv_cv)
        rvCardView?.setHasFixedSize(true)

        cvanime.addAll(AnimeData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvCardView?.layoutManager = LinearLayoutManager(this)
        val cardanime = CardViewAdapter(cvanime)
        rvCardView?.adapter = cardanime
    }
}