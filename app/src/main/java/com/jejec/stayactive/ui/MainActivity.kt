package com.jejec.stayactive.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.jejec.stayactive.R
import com.jejec.stayactive.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    /**
     * # What is Dagger?
     * Dagger is dependency injection
     *
     * # What is dependency?
     * Kotlin object or variable,
     * if objectA relies on objectB
     * then objectB is a dependency of objectA
     * */

    private lateinit var bind: ActivityMainBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        setSupportActionBar(bind.toolbar)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navController = navHostFragment.findNavController()

        bind.bottomNavigationView.setupWithNavController(navController)

        navController
            .addOnDestinationChangedListener { _, destination, _ ->
                when (destination.id) {
                    R.id.settingFragment, R.id.runFragment, R.id.statisticFragment -> {
//                        bind.bottomNavigationView.visibility = View.VISIBLE
                        bind.bottomNavigationView.isVisible = true
                    }
                    else -> {
//                        bind.bottomNavigationView.visibility = View.GONE
                        bind.bottomNavigationView.isVisible = false
                    }
                }
            }
    }
}