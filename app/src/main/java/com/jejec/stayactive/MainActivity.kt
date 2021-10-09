package com.jejec.stayactive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jejec.stayactive.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("run_dao", "runDao hashCode = ${runDAO.hashCode()}")

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