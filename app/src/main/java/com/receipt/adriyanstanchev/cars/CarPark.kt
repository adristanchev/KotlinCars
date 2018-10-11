package com.receipt.adriyanstanchev.cars

class CarPark {

    private val carParkList = mutableListOf<String>()

    fun addCar(car: String) {
        carParkList.add(car)
    }

    fun size(): Int = carParkList.size

    fun containsCar(car: String): Boolean {
        for(item in carParkList) {
            if (car == item) {
                return true
            }
        }
        return false
    }

    fun removeCar(car1: String) {
        carParkList.remove(car1)
    }

    fun isEmpty(): Boolean = carParkList.size == 0

    fun clear() {
        carParkList.clear()
    }

    fun getCar(i: Int): String = carParkList[i]

}