package ir.drax.dindinn.ui

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import ir.drax.dindinn.R
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivity_is_visible(){
        Espresso.onView(ViewMatchers.withId(R.id.mainActivityRoot))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }


}