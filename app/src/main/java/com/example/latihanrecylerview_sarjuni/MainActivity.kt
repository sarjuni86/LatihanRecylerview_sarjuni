package com.example.latihanrecylerview_sarjuni

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:  ArrayList<DataClass>
    lateinit var imageList : Array<Int>
    lateinit var titleList :Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        imageList= arrayOf(
            R.drawable.indonesia,
            R.drawable.brunai ,
            R.drawable.filipina ,
            R.drawable.kamboja,
            R.drawable.laos,
            R.drawable.malaysia,
            R.drawable.myanmar,
            R.drawable.singapura,
            R.drawable.thailand,
            R.drawable.vietnam)

            titleList= arrayOf(
                "INDONESIA",
                "BRUNAI DARRUSALAM",
                "FILIPINA",
                "KAMBOJA",
                "LAOS",
                "MALAYSIA",
                "MYANMAR",
                "SINGAPURA",
                "THAILAND",
                "VIETNAM")

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


        dataList= arrayListOf<DataClass>()
        getData()
    }
    private fun getData(){
        for (i in imageList.indices){
            val dataClass= DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter= AdapterClass(dataList)


    }
}