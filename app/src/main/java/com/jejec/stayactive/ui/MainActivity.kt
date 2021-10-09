package com.jejec.stayactive.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)

        setSupportActionBar(bind.toolbar)
    }
}