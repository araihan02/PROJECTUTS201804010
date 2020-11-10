package com.ahmadraihan.uts201804010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MinumanActivity : AppCompatActivity() {
    private  lateinit var rvMinuman: RecyclerView
    private var list: ArrayList<Minuman> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minuman)

        rvMinuman = findViewById(R.id.rv_minuman)
        rvMinuman.setHasFixedSize(true)

        list.addAll(DataMinuman.listData)
        showRecyclerViewCardMode()
    }
    private fun showRecyclerViewCardMode(){
        rvMinuman.layoutManager = LinearLayoutManager(this)
        val cardMinumanAdapter = CardMinumanAdapter(list)
        rvMinuman.adapter = cardMinumanAdapter
    }
}