package com.jejec.stayactive.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jejec.stayactive.R
import com.jejec.stayactive.databinding.FragmentSetupBinding
import dagger.hilt.android.AndroidEntryPoint

class SetupFragment : Fragment(R.layout.fragment_setup) {


    private var _bind: FragmentSetupBinding? = null
    private val bind get() = _bind!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _bind = FragmentSetupBinding.bind(view)

        bind.tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_runFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _bind = null
    }
}