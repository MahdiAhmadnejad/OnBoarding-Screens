package com.eye.onboardingscreens.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.eye.onboardingscreens.R
import com.eye.onboardingscreens.databinding.FragmentFirstScreenBinding
import com.eye.onboardingscreens.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {
    private lateinit var binding: FragmentSecondScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondScreenBinding.inflate(layoutInflater)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.next1.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return binding.root    }
}