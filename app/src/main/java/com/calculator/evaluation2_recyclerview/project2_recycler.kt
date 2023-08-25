package com.calculator.evaluation2_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.calculator.evaluation2_recyclerview.adopter.CustomAdopter
import com.calculator.evaluation2_recyclerview.dataModel.DataModel
import com.calculator.evaluation2_recyclerview.dataView.DataView

class project2_recycler : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adaptor: CustomAdopter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project2_recycler)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this, 2,GridLayoutManager.VERTICAL,false);
        adaptor = CustomAdopter(this,DataView().loadOffers())
        recyclerView.adapter = adaptor
        val dropDown = findViewById<Spinner>(R.id.dropdown_menu)
        val items = listOf(
            getString(R.string.location_mangalore),
            getString(R.string.location_bangalore),
            getString(R.string.location_delhi)
        )


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        dropDown.adapter = adapter





    }
}