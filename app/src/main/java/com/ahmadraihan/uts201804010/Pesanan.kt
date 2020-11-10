package com.ahmadraihan.uts201804010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesanan)
        var tvTampil: TextView = findViewById(R.id.tv_tampil)
        val bundle = intent.extras
        if (bundle != null) {
            tvTampil.setText(bundle.getString("data1"))
        }


    }
}