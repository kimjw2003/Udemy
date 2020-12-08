package com.example.recyclerview_study

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf(FruitData("Mango", "Kim"), FruitData("Apple", "Kim"), FruitData("Banana", "Lee"),
        FruitData("Guava", "mike"), FruitData("Lemon", "ko"), FruitData("Pear", "Frank"), FruitData("Orange", "Park"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_RecyclerView.setBackgroundColor(Color.YELLOW)
        my_RecyclerView.layoutManager = LinearLayoutManager(this)
        my_RecyclerView.adapter = MyRecyclerViewAdapter(fruitsList, {selectedFruitItem : FruitData-> listItemClicked(selectedFruitItem)})

    }

    private fun listItemClicked(fruitData: FruitData){
        Toast.makeText(this, "SupplierName is ${fruitData.supplier}", Toast.LENGTH_SHORT).show()
    }
}