package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.DogCardAdapter

class VerticalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertical_list)

        val adapter = DogCardAdapter(this, 0)
        val viewHolder: RecyclerView = findViewById(R.id.vertical_recycler_view)
        viewHolder.adapter = adapter
    }
}