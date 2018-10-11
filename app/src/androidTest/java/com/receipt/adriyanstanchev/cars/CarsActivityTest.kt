package com.receipt.adriyanstanchev.cars

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import junit.framework.TestCase.assertTrue
import org.junit.Rule
import org.junit.Test

internal class CarsActivityTest {

    @Rule
    @JvmField
    val carsActivityTestRule = ActivityTestRule(CarsActivity::class.java)

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()


    // Not needed since the test after it validates the same thing, but left for evidence it was written ;)
//    @Test
//    fun testClickFabAddsItemToList() {
//        onView(withId(R.id.fab)).perform(ViewActions.click())
//        assert(carsActivityTestRule.activity.carAdapter.itemCount == 1) {
//            "Expected adapter to contain 1 element but was ${carsActivityTestRule.activity.carAdapter.itemCount}"
//        }
//    }

    @Test
    fun testClickFabTwentyTimesAddsTwentyItems() {
        val carAdapter = carsActivityTestRule.activity.carAdapter
        for (i in 1..20) {
            onView(withId(R.id.fab)).perform(ViewActions.click())
        }
        assertTrue("Expected 20, but was" + carAdapter.carPark.size(), carAdapter.carPark.size() == 20)
    }

    @Test
    fun testClickItemRemovesIt() {
        val carAdapter = carsActivityTestRule.activity.carAdapter
        onView(withId(R.id.fab)).perform(ViewActions.click())
        onView(withId(R.id.fab)).perform(ViewActions.click())
        onView(withId(R.id.fab)).perform(ViewActions.click())
        onView(withId(R.id.carsRecyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition<CarParkAdapter.CarViewHolder>(0, click()))
        assertTrue("Expected 0, but was ${carAdapter.carPark.size()}", carAdapter.carPark.size() == 0)
        assertTrue("Expected 0, but was ${carAdapter.carPark.size()}", carAdapter.carPark.size() == 0)
        onView(withId(R.id.fab)).perform(ViewActions.click())

    }
}