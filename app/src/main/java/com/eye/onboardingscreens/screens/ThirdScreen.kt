package com.eye.onboardingscreens.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.eye.onboardingscreens.R
import com.eye.onboardingscreens.databinding.FragmentThirdScreenBinding


class ThirdScreen : Fragment() {
    private lateinit var binding: FragmentThirdScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdScreenBinding.inflate(layoutInflater)

        binding.finish.setOnClickListener {
        findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingFinished()
        }

        return binding.root
    }
    private fun onBoardingFinished(){
        val sharePref = requireActivity().getSharedPreferences("sharePref", Context.MODE_PRIVATE)
        val editor = sharePref.edit()
        editor.putBoolean("finished", true)
        editor.apply()
    }
}