package com.example.projekakhir

object AnimeData {
    private val data = arrayOf(
        arrayOf(
            "One Piece",
            "Petualangan, fantasi",
            "Toei Animation",
            "https://www.greenscene.co.id/wp-content/uploads/2021/01/wano-min.jpg"
        ),
        arrayOf(
            "Naruto",
            "Aksi, Petualangan, Fantasi",
            "Studio Pierrot",
            "https://flxt.tmsimg.com/assets/p9162074_b_h10_aa.jpg"
        ),
        arrayOf(
            "Bleach",
            "Petualangan, supernatural",
            "Studio Pierrot",
            "https://cdn.myanimelist.net/images/anime/3/40451.jpg"
        ),
        arrayOf(
            "進撃の巨人 (Shingeki no Kyojin)",
            "Laga Fantasi gelap Pascaapokaliptik",
            "MAPPA Studio",
            "https://bacaterus.com/wp-content/uploads/2022/05/attack-on-titan-s2-5_.webp"
        ),
        arrayOf(
            "Hunter × Hunter",
            "Petualangan, fantasi, seni bela diri",
            "Nippon Animation",
            "https://wowdunia.com/content/uploads/hunter-x-hunter-series.jpg"
        ),
        arrayOf(
            "Jujutsu Kaisen",
            "Petualangan, fantasi gelap, supernatural",
            "",
            "https://gamek.mediacdn.vn/133514250583805952/2021/12/17/tc2-1639725141535644461544.jpg"
        ),
        arrayOf(
            "Demon Slayer: Kimetsu no Yaiba",
            "dark fantasi dan petualangan",
            "MAPPA Studio",
            "https://upload.wikimedia.org/wikipedia/id/2/21/Kimetsu_no_Yaiba_Mugen_Ressha_Hen_Poster.jpg"
        ),
        arrayOf(
            "チェンソーマン (Chainsaw Man)",
            "Action Comedy horror Dark fantasy",
            "studio MAPPA",
            "https://www.gamespot.com/a/uploads/screen_kubrick/1562/15626911/4045709-chainsawman_16x9.jpg"
        ),
        arrayOf(
            "境界の彼方 (Kyōkai no Kanata)",
            "Fiksi, Supernatural, Fantasi",
            "Kyoto Animation",
            "https://cdn.myanimelist.net/images/anime/6/73298.jpg"
        ),
        arrayOf(
            "Death Note",
            "Misteri, Cerita seru psikologis, Cerita seru",
            "Studio: Madhouse",
            "https://cdn.myanimelist.net/images/anime/9/9453.jpg"
        )
    )
    val listData: ArrayList<Anime>
        get() {
            val list = arrayListOf<Anime>()
            for (aData in data){
                val anime = Anime()
                anime.nama= aData[0]
                anime.genre= aData[1]
                anime.studio= aData[2]
                anime.photo= aData[3]

                list.add(anime)
            }
            return list
        }
}