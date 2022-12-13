package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val adapter = DogCardAdapter(this, 0)
//        val mainRecyclerView = findViewById<RecyclerView>(R.id.main_recycler_view)
//        mainRecyclerView.adapter = adapter
        val vertical_button: Button = findViewById(R.id.vertical_button)
        vertical_button.setOnClickListener() {
            val intent = Intent(this, VerticalListActivity::class.java)
            startActivity(intent)
        }
        val horizontal_button: Button = findViewById(R.id.horizontal_button)
        horizontal_button.setOnClickListener() {
            val intent = Intent(this, HorizontalListActivity::class.java)
            startActivity(intent)
        }
        val grid_button: Button = findViewById(R.id.grid_button)
        grid_button.setOnClickListener() {
            val intent = Intent(this, GridListActivity::class.java)
            startActivity(intent)
        }
    }
}