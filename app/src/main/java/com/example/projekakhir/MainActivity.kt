package com.example.projekakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlistanime : Button = findViewById(R.id.btn_list_anime)
        btnlistanime.setOnClickListener(this)
        val btngalerianime : Button = findViewById(R.id.btn_galeri_anime)
        btngalerianime.setOnClickListener(this)
        val btnCardview : Button = findViewById(R.id.btn_cardview)
        btnCardview.setOnClickListener(this)
        val btn_karakter : Button = findViewById(R.id.btn_karakter)
        btn_karakter.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_list_anime -> {
                val listanime = Intent(this@MainActivity, DaftarAnime::class.java)
                startActivity(listanime)
            }
            R.id.btn_galeri_anime -> {
                val galerianime = Intent(this@MainActivity,Galeri_Activity::class.java)
                startActivity(galerianime)
            }
            R.id.btn_cardview -> {
                val cardview = Intent(this@MainActivity,CardViewActivity::class.java)
                startActivity(cardview)
            }
            R.id.btn_karakter -> {
                val karakter = Intent(this@MainActivity,KarakterActivity::class.java)
                startActivity(karakter)
            }
        }
    }
}