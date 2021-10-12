package ir.drax.dindinn.util

import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import ir.drax.dindinn.R


fun Fragment.openFragment(@NonNull fragmentClass: Class<out Fragment>) {
    requireFragmentManager().commit {
        add(R.id.nav_host, fragmentClass,null)
    }
}

fun Fragment.setFragment(@NonNull fragmentClass: Class<out Fragment>) {
    requireFragmentManager().commit {
        replace(R.id.nav_host, fragmentClass,null)
    }
}

fun AppCompatActivity.openFragment(@NonNull fragmentClass: Class<out Fragment>) {
    supportFragmentManager.commit {
        replace(R.id.nav_host, fragmentClass,null)
    }
}
