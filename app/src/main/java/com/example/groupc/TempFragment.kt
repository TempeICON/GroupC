package com.example.groupc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.groupc.databinding.FragmentTempBinding

class TempFragment: Fragment() {

    private lateinit var binding: FragmentTempBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = FragmentTempBinding.inflate(inflater, container, false)

        binding.navBtn.setOnClickListener {
            goToOtherFragment()
        }
        return binding.root
    }

    private fun goToOtherFragment() {
        findNavController().navigate(TempFragmentDirections.actionTempFragmentToTemp2Fragment())
    }

}