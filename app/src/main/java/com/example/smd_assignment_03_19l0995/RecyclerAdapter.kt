package com.example.smd_assignment_03_19l0995

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.smd_assignment_03_19l0995.model.Restaurants

class RecyclerAdapter(private val dataset: List<Restaurants>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val vieww = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(vieww)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val item : Restaurants = dataset[position]
        holder.itemTitle.text = item.name
        holder.itemRating.text = item.rating.toString()
        holder.itemNumber.text = item.phone
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemTitle: TextView = itemView.findViewById(R.id.name)
        var itemRating: TextView = itemView.findViewById(R.id.rating)
        var itemNumber: TextView = itemView.findViewById(R.id.number)
    }
}