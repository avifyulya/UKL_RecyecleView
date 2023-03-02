package com.example.projekakhir

object GaleriData {
    private val data = arrayOf(
        arrayOf(
            "https://m.media-amazon.com/images/M/MV5BOTcyOGZiMzctNTQyOS00OTYzLTk0M2EtMTI5MTU0NmU5ZGU2XkEyXkFqcGdeQXVyMTI2NTY3NDg5._V1_FMjpg_UX1000_.jpg"
        ),
        arrayOf(
            "https://cdn.myanimelist.net/images/anime/1773/132313.jpg"
        ),
        arrayOf(
            "https://www.crunchyroll.com/imgsrv/display/thumbnail/480x720/catalog/crunchyroll/b333f764127c1e06d49aa7ca7c262ff8.jpe"
        ),
        arrayOf(
            "https://cdn.myanimelist.net/images/anime/1310/117188.jpg"
        ),
        arrayOf(
        "https://cdn.animeschedule.net/production/assets/public/img/anime/jpg/default/bungou-stray-dogs-4th-season-895632e191.jpg"
        ),
        arrayOf(
         "https://upload.wikimedia.org/wikipedia/id/f/f7/The_Way_of_the_Househusband.jpg"
        ),
        arrayOf(
            "https://www.gwigwi.com/wp-content/uploads/2022/12/New-Sorcerous-Stabber-Orphen-Animes-Season-3-Unveils-More-Cast.jpg"
        ),
        arrayOf(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8kntYBgt9JRZLN_I_aOZ0zGUFkwGwqhIMoqhOJzm87W5Rw83p0_9w97kSgfZHDNlCXwU&usqp=CAU"
        ),
        arrayOf(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpou5cjsmf_d6qR_iRcJB1aHg1l7sDVLigXReF0XkelPtsQ1MzfeweRqDE0VXBx4srjBQ&usqp=CAU"
        ),
        arrayOf(
            "https://pbs.twimg.com/media/FYcN6LWXoAAP3II.jpg"
        )
    )
    val listData: ArrayList<Galeri>
        get() {
            val list = arrayListOf<Galeri>()
            for (aData in data){
                val galeri = Galeri()
                galeri.photo= aData[0]

                list.add(galeri)
            }
            return list
        }
}