package com.jejec.stayactive.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.maps.GoogleMap
import com.jejec.stayactive.R
import com.jejec.stayactive.databinding.FragmentTrackingBinding
import com.jejec.stayactive.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private var _bind: FragmentTrackingBinding? = null
    private val bind get() = _bind!!

    private val viewModel: MainViewModel by viewModels()

    private var map: GoogleMap? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _bind = FragmentTrackingBinding.bind(view)
        bind.mvRun.onCreate(savedInstanceState)

        // Load map
        bind.mvRun.getMapAsync{
            map = it
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Cached map
        bind.mvRun.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        bind.mvRun.onStart()
    }

    override fun onResume() {
        super.onResume()
        bind.mvRun.onResume()
    }

    override fun onPause() {
        super.onPause()
        bind.mvRun.onPause()
    }

    override fun onStop() {
        super.onStop()
        bind.mvRun.onStart()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        bind.mvRun.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        bind.mvRun.onDestroy()
    }

}