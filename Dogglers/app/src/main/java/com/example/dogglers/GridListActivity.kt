package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.DogCardAdapter

class GridListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_list)

        val adapter = DogCardAdapter(this, 1)
        val viewHolder: RecyclerView = findViewById(R.id.grid_recycler_view)
        viewHolder.adapter = adapter
    }
}