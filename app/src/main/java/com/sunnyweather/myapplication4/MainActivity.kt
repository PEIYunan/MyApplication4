package com.sunnyweather.myapplication4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




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
        val titleBack3:Button=findViewById(R.id.titleBack3)
        titleBack3.setOnClickListener {
            Toast.makeText(this,"跳转列表",Toast.LENGTH_SHORT).show()
            val intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }

    }

}