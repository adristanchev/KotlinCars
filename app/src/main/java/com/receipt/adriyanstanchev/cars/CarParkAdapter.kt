package com.receipt.adriyanstanchev.cars

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CarParkAdapter(val carPark: CarPark, private val context: Context, val onItemDeleted: (Int) -> Unit) : RecyclerView.Adapter<CarParkAdapter.CarViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CarViewHolder {
        val result: View
        if(p1 == 0) {
            result = LayoutInflater.from(context).inflate(R.layout.item_car, p0, false)
        } else {
            result = LayoutInflater.from(context).inflate(R.layout.item_two, p0, false)
        }
        return CarViewHolder(result)
    }

    override fun getItemCount(): Int = carPark.size()

    override fun onBindViewHolder(p0: CarViewHolder, p1: Int) {
//        p0.bind(carPark.getCar(p1), p1)
    }

    override fun getItemViewType(position: Int): Int {
        return if(position%2 == 0)
            1
        else
            0
    }

    fun addCar(s: String) {
        carPark.addCar(s)

        notifyDataSetChanged()
    }

    fun deleteItem(it: Int) {
        carPark.removeCar(carPark.getCar(it))

        notifyDataSetChanged()
    }


    inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bind(car: String, position: Int) {
        }
    }


}
