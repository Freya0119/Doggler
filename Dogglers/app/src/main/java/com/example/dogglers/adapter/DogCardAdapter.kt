package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.data.DataSource
import com.example.dogglers.modle.Dog

class DogCardAdapter(private val context: Context, private val layout: Int) :
    RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    class DogCardViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
        val imageView: ImageView = viewItem.findViewById(R.id.item_image_view)
        val nameText: TextView = viewItem.findViewById(R.id.item_name_text_view)
        val ageText: TextView = viewItem.findViewById(R.id.item_age_text_view)
        val hobbiesText: TextView = viewItem.findViewById(R.id.item_hobbies_text_view)
    }

    private val dogsResource = DataSource.dogs

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        return if (layout == 0) {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.veritical_horizental_list_item, parent, false)
            DogCardViewHolder(adapterLayout)
        } else {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_list_item, parent, false)
            DogCardViewHolder(adapterLayout)
        }
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        holder.imageView.setImageResource(dogsResource[position].imageResourceId)
//        val resource = context?.resources
        holder.nameText.text = "Name: ${dogsResource[position].name}"
        holder.ageText.text = "Age: ${dogsResource[position].age}"
        holder.hobbiesText.text = "Hobbies: ${dogsResource[position].hobbies}"
    }

    override fun getItemCount(): Int {
        return dogsResource.size
    }
}