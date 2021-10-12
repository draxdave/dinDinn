package ir.drax.dindinn.ui.orders

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import ir.drax.dindinn.R
import ir.drax.dindinn.ui.MainActivity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class OrdersFragmentTest{

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivity_is_visible(){
        onView(withId(R.id.mainActivityRoot))
            .check(matches(isDisplayed()))
    }


}