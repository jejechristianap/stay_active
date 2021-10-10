package com.jejec.stayactive.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jejec.stayactive.R
import com.jejec.stayactive.databinding.FragmentRunBinding
import com.jejec.stayactive.databinding.FragmentTrackingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private var _bind: FragmentTrackingBinding? = null
    private val bind get() = _bind!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _bind = FragmentTrackingBinding.bind(view)

    }
}