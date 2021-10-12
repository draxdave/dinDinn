package ir.drax.dindinn.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import ir.drax.dindinn.R
import org.junit.Rule
import org.junit.Test

class NavigationTest {

    @get: Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun ordersFragment_to_IngredientsFragment_And_Back(){
        // Go
        onView(withText("Ingredients")).perform(click())

        onView(withId(R.id.ingredientsFragmentRoot))
            .check(matches(isDisplayed()))


        // Back
        pressBack()

        // recheck
        onView(withId(R.id.ordersFragmentRoot)).check(matches(isDisplayed()))
    }
}