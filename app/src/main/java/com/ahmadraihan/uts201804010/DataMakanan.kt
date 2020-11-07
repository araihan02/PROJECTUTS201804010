package com.ahmadraihan.uts201804010

object DataMakanan {
    private val kodeMakanan = arrayOf(
        "M001",
        "M002",
        "M003",
        "M004",
        "M005",
        "M006",
        "M007",
        "M008",
        "M009",
        "M0010",
        "M0011",
        "M0012",
        "M0013",
        "M0014",
        "M0015",
        "M0016",
        "M0017",
        "M0018",
        "M0019",
        "M0020"
    )

    private val namaMakanan = arrayOf(
        "Rendang",
        "Nasi Goreng",
        "Sushi",
        "Tom Yam Goong",
        "Pad Thai",
        "Dim Sum",
        "Ramen",
        "Peking Duck",
        "Lasagna",
        "Kebab",
        "Bebek Peking",
        "Massaman Curry",
        "Kimchi",
        "Chicken Rise",
        "Ayam Goreng",
        "Sate",
        "Sop Iga",
        "Soto",
        "Sosis Bakar",
        "Ikan Bakar"
    )

    private val hargaMakanan = arrayOf(
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

    private val logoMakanan = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p,
        R.drawable.q,
        R.drawable.r,
        R.drawable.s,
        R.drawable.t
    )

    val listData: ArrayList<Makanan>
        get() {
            val listMakanan = arrayListOf<Makanan>()
            for (position in namaMakanan.indices){
                val makanan = Makanan()
                makanan.kode = kodeMakanan[position]
                makanan.nama = namaMakanan[position]
                makanan.harga = hargaMakanan[position]
                makanan.logo = logoMakanan[position]
                listMakanan.add(makanan)
            }
            return listMakanan
        }
}