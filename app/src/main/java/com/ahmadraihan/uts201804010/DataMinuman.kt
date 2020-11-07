package com.ahmadraihan.uts201804010

object DataMinuman {
    private val kodeMinuman = arrayOf(
        "N001",
        "N002",
        "N003",
        "N004",
        "N005",
        "N006",
        "N007",
        "N008",
        "N009",
        "N0010",
        "N0011",
        "N0012",
        "N0013",
        "N0014",
        "N0015",
        "N0016",
        "N0017",
        "N0018",
        "N0019",
        "N0020"
    )

    private val namaMinuman = arrayOf(
        "Dalgona Coffee",
        "Thai Tea",
        "Cheese Tea",
        "Bubble Tea",
        "Es Kopi Susu",
        "Aperitivo",
        "Negroni Cocktail",
        "Campari",
        "Aperol Spritz",
        "Bellini",
        "Limoncello",
        "Grappa",
        "Sambuca",
        "Eggnog",
        "Mango lassi",
        "Pina colada",
        "Cendol",
        "Mojito",
        "Martini",
        "Yerba Mate"
    )

    private val hargaMinuman = arrayOf(
        "Rp. 30000",
        "Rp. 25000",
        "Rp. 39000",
        "Rp. 27000",
        "Rp. 42000",
        "Rp. 35000",
        "Rp. 50000",
        "Rp. 31000",
        "Rp. 58000",
        "Rp. 59000",
        "Rp. 28000",
        "Rp. 60000",
        "Rp. 92000",
        "Rp. 12000",
        "Rp. 15000",
        "Rp. 43000",
        "Rp. 22000",
        "Rp. 29000",
        "Rp. 25000",
        "Rp. 21000"
    )

    private val logoMinuman = intArrayOf(
        R.drawable.a1,
        R.drawable.b1,
        R.drawable.c1,
        R.drawable.d1,
        R.drawable.e1,
        R.drawable.f1,
        R.drawable.g1,
        R.drawable.h1,
        R.drawable.i1,
        R.drawable.j1,
        R.drawable.k1,
        R.drawable.l1,
        R.drawable.m1,
        R.drawable.n1,
        R.drawable.o1,
        R.drawable.p1,
        R.drawable.q1,
        R.drawable.r1,
        R.drawable.s1,
        R.drawable.t1
    )

    val listData: ArrayList<Minuman>
        get() {
            val listMinuman = arrayListOf<Minuman>()
            for (position in namaMinuman.indices){
                val minuman = Minuman()
                minuman.kode = kodeMinuman[position]
                minuman.nama = namaMinuman[position]
                minuman.harga = hargaMinuman[position]
                minuman.logo = logoMinuman[position]
                listMinuman.add(minuman)
            }
            return listMinuman
        }
}