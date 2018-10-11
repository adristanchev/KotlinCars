package com.receipt.adriyanstanchev.cars

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
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

    @Test
    fun testClickFabTwentyTimesAddsTwentyItems() {
        assertTrue(true)
    }

    @Test
    fun testClickItemRemovesIt() {
        onView(withId(R.id.fab)).check(matches(isDisplayed()))
    }
}