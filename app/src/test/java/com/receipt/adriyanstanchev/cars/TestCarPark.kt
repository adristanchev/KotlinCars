package com.receipt.adriyanstanchev.cars

import org.amshove.kluent.shouldEqual
import org.junit.Test

class TestCarPark {

    private val carOne = "carOne"
    private val carTwo = "carTwo"


    @Test
    fun `test add item to list`() {
        val carPark = CarPark()
        carPark.addCar(carOne)
        carPark.addCar(carTwo)
        assert(carPark.size() == 2)
    }

    @Test fun `test get item from list`() {
        val carPark = CarPark()
        carPark.addCar(carOne)
        carPark.addCar(carTwo)
        val newCar = carPark.getCar(1)
        carTwo shouldEqual newCar

        val newCarTwo = carPark.getCar(0)
        carOne shouldEqual newCarTwo
    }

    @Test fun `test remove item from list`() {
        val carPark = CarPark()
        carPark.addCar(carOne)
        carPark.removeCar(carOne)
        assert(carPark.size() == 0) { "car park size not as expected"}
        assert(!carPark.containsCar(carOne)) { "car park should not cointain $carOne"}
    }

    @Test fun `test contains car`() {
        val carPark = CarPark()
        carPark.addCar(carOne)
        assert(carPark.containsCar(carOne)) { "carPark should contain $carOne"}
    }

    @Test fun `test is empty`() {
        val carPark = CarPark()
        assert(carPark.isEmpty())
    }

    @Test fun `test is not empty`() {
        val carPark = CarPark()
        carPark.addCar(carOne)
        assert(!carPark.isEmpty()) { "expected car park to not be empty but was"}
    }

    @Test fun `test clear`() {
        val carPark = CarPark()
        carPark.addCar(carOne)
        carPark.addCar(carTwo)
        carPark.clear()
        assert(carPark.isEmpty()) { "Expected empty car park"}
    }

}