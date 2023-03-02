package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KarakterActivity : AppCompatActivity() {

    private var rv_karakter1: RecyclerView? = null
    private var listKarakterData1: ArrayList<karakter> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karakter)

        rv_karakter1 = findViewById(R.id.rv_karakter)
        rv_karakter1?.setHasFixedSize(true)

        listKarakterData1.addAll(karakterData.listKarakterData)
        showRecyclerList()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_grid -> {
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                showRecyclerCardView()
            }
        }
    }

    private fun showRecyclerCardView() {
        rv_karakter1?.layoutManager = LinearLayoutManager(this)
        val CardViewHeroAdapter = CardViewKarakter(listKarakterData1!!)
        rv_karakter1?.adapter = CardViewHeroAdapter
    }
    private fun showRecyclerGrid() {
        rv_karakter1?.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridKarakterAdapter(listKarakterData1)
        rv_karakter1?.adapter = gridHeroAdapter

        gridHeroAdapter.setOnItemClickCallback(object  : GridKarakterAdapter.OnItemClickCallback{
            override fun onItemClicked(data: karakter){
                showSelectedKarakter(data)
            }
        })
    }

    private fun showSelectedKarakter(data: karakter) {
        Toast.makeText(this, "Kamu memlilih " + data.nama_karakter, Toast.LENGTH_SHORT).show()

    }

    private fun showRecyclerList() {
        rv_karakter1?.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListKarakterAdapter(listKarakterData1)
        rv_karakter1?.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListKarakterAdapter.OnItemClickCallback {
            override fun onItemClicked(data: karakter) {
                showSelectedKarakter(data)
            }
        })
    }
}