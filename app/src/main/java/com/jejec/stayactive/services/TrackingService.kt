package com.jejec.stayactive.services

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.jejec.stayactive.other.Constant.ACTION_PAUSE_SERVICE
import com.jejec.stayactive.other.Constant.ACTION_START_OR_RESUME_SERVICE
import com.jejec.stayactive.other.Constant.ACTION_STOP_SERVICE
import timber.log.Timber

/**
 * This class inherit from LifecycleService
 * Because you need to Observe from LiveData object that needs LifecycleOwner
 * */
class TrackingService: LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        intent?.let {
            when (it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("Started or resumed service")
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Pause service")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Stop service")
                }
            }
        }

        return super.onStartCommand(intent, flags, startId)
    }
}