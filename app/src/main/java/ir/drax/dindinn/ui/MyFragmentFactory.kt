package ir.drax.dindinn.ui

import android.app.Activity
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.commit
import ir.drax.dindinn.R
import ir.drax.dindinn.network.model.Order
import ir.drax.dindinn.ui.ingredients.IngredientsFragment
import ir.drax.dindinn.ui.orders.OrdersFragment

class MyFragmentFactory(

):FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {

        return when(loadFragmentClass(classLoader,className)) {

            OrdersFragment::class.java -> OrdersFragment()
            IngredientsFragment::class.java -> IngredientsFragment()

            else -> super.instantiate(classLoader, className)
        }
    }
}