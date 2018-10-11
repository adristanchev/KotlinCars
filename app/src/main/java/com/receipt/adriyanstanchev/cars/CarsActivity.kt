package com.receipt.adriyanstanchev.cars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.bottomappbar.BottomAppBar
import android.support.design.button.MaterialButton
import android.support.design.card.MaterialCardView
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_cars.*
import java.util.*

class CarsActivity : AppCompatActivity() {

    private val carPark = CarPark()
    lateinit var carAdapter: CarParkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)
//        Chip
//        BottomSheetDialogFragment
//        BottomAppBar
//        MaterialButton
//        MaterialCardView

        Log.d("asd", "travis test build?")
        setupRecyclerView()
        setupOnFabClick()
    }

    private fun setupOnFabClick() {
        fab.setOnClickListener {
            carAdapter.addCar("Car" + Random().nextInt(20))
        }
    }

    private fun setupRecyclerView() {
        with(carsRecyclerView) {
            carAdapter = CarParkAdapter(carPark, context) { Log.d("asd", "bss") }
            adapter = carAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }
}
