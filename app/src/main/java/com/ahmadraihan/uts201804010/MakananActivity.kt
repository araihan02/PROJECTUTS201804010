package com.ahmadraihan.uts201804010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MakananActivity : AppCompatActivity() {
    private  lateinit var rvMakanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        rvMakanan = findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)

        list.addAll(DataMakanan.listData)
        showRecyclerViewCardMode()
    }

    private fun showRecyclerViewCardMode(){
        rvMakanan.layoutManager = LinearLayoutManager(this)
        val cardMakananAdapter = CardMakananAdapter(list)
        rvMakanan.adapter = cardMakananAdapter
    }
}