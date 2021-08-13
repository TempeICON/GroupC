package com.example.groupc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.groupc.databinding.FragmentTemp2Binding

class Temp2Fragment: Fragment() {

    private lateinit var binding: FragmentTemp2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = FragmentTemp2Binding.inflate(inflater, container, false)

        binding.navBtn.setOnClickListener {
            goToOtherFragment()
        }

        return binding.root
    }

    private fun goToOtherFragment() {
        findNavController().navigate(Temp2FragmentDirections.actionTemp2FragmentToTempFragment())
    }
}