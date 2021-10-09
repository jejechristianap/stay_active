package com.jejec.stayactive.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jejec.stayactive.R
import com.jejec.stayactive.databinding.FragmentStatisticBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticFragment : Fragment(R.layout.fragment_statistic) {

    private var _bind: FragmentStatisticBinding? = null
    private val bind get() = _bind!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _bind = FragmentStatisticBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _bind = null
    }
}