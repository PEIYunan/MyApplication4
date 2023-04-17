package com.sunnyweather.myapplication4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val titleBack:Button=findViewById(R.id.titleBack)
        titleBack.setOnClickListener {
            Toast.makeText(this,"搜索",Toast.LENGTH_SHORT).show()
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }

}