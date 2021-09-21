package com.jejec.stayactive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * # What is Dagger?
         * Dagger is dependency injection
         *
         * # What is dependency?
         * Kotlin object or variable,
         * if objectA relies on objectB
         * then objectB is a dependency of objectA
         * */
    }
}