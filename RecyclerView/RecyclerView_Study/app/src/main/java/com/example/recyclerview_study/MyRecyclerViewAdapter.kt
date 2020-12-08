package com.example.recyclerview_study

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MyRecyclerViewAdapter(private val fruitsList:List<FruitData>, private val clickListener: (FruitData)->Unit) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(fruitsList[position], clickListener)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}

class MyViewHolder(val view : View) : RecyclerView.ViewHolder(view){

    fun bind(fruitData: FruitData, clickListener: (FruitData)->Unit){
        view.name_Tv.text = fruitData.name
        view.setOnClickListener {
            clickListener(fruitData)
        }
    }
}