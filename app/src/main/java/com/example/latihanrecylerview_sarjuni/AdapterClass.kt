package com.example.latihanrecylerview_sarjuni

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class AdapterClass(private val dataLIst:ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(itemView)

    }
    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {

        val currentItem=dataLIst[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvTitle.text = currentItem.dataTitle
    }

    override fun getItemCount(): Int {
        return dataLIst.size
    }

    class ViewHolderClass(itemView: View):RecyclerView.ViewHolder(itemView) {
        val rvImage: ImageView = itemView.findViewById(R.id.image)
        val rvTitle: TextView = itemView.findViewById(R.id.title)
    }
}