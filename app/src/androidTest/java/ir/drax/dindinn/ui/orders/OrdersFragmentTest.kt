package ir.drax.dindinn.ui.orders

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import ir.drax.dindinn.R
import ir.drax.dindinn.ui.MainActivity
import ir.drax.dindinn.ui.MyFragmentFactory
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class OrdersFragmentTest{


    @Before
    fun beforeEvery(){
        val factory = MyFragmentFactory()
        val args = Bundle()

        val scenario = launchFragmentInContainer<OrdersFragment>(
            fragmentArgs = args,
            themeResId= R.style.Theme_DinDinn,
            factory = factory
        )
    }

    @Test
    fun ordersFragment_is_visible(){

        onView(withId(R.id.ordersFragmentRoot))
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

}