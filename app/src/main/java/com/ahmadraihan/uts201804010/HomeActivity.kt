package com.ahmadraihan.uts201804010

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val t_user: TextView = findViewById(R.id.tampil_user)

        val bundle = intent.extras
        t_user.setText(bundle?.getString("user"))

        val makanan: Button = findViewById(R.id.btn_makanan)
        makanan.setOnClickListener{
            val intent = Intent(this, MakananActivity::class.java)
            startActivity(intent)
        }

        val minuman: Button = findViewById(R.id.btn_minuman)
        minuman.setOnClickListener{
            val intent = Intent(this, MinumanActivity::class.java)
            startActivity(intent)
        }

        val about: Button = findViewById(R.id.btn_about)
        about.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}