package com.jejec.stayactive.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jejec.stayactive.R
import com.jejec.stayactive.databinding.FragmentSettingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingFragment : Fragment(R.layout.fragment_setting) {

    private var _bind: FragmentSettingBinding? = null
    private val bind get() = _bind!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _bind = FragmentSettingBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _bind = null
    }
}