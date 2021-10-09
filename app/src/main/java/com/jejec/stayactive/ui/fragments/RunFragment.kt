package com.jejec.stayactive.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jejec.stayactive.R
import com.jejec.stayactive.databinding.FragmentRunBinding
import dagger.hilt.android.AndroidEntryPoint

class RunFragment : Fragment(R.layout.fragment_run) {

    private var _bind: FragmentRunBinding? = null
    private val bind get() = _bind!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _bind = FragmentRunBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _bind = null
    }
}