package ir.drax.dindinn.ui

import android.app.Activity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import ir.drax.dindinn.R
import ir.drax.dindinn.network.model.Order
import ir.drax.dindinn.ui.ingredients.IngredientsFragment
import ir.drax.dindinn.ui.orders.OrdersFragment
import ir.drax.dindinn.util.openFragment


class MainActivity : AppCompatActivity() {
    private val fFactory  = MyFragmentFactory()

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = fFactory

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            openOrdersFragment()
    }

    private fun openOrdersFragment() = openFragment(OrdersFragment::class.java)
}