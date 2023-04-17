package com.sunnyweather.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        supportActionBar?.hide()
        val titleBack: Button =findViewById(R.id.titleBack1)
        titleBack.setOnClickListener {
            Toast.makeText(this,"返回主界面", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}