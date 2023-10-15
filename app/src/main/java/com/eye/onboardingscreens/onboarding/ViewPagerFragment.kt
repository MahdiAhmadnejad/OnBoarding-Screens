package com.eye.onboardingscreens.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eye.onboardingscreens.R
import com.eye.onboardingscreens.databinding.ActivityMainBinding
import com.eye.onboardingscreens.databinding.FragmentViewPagerBinding
import com.eye.onboardingscreens.screens.FirstScreen
import com.eye.onboardingscreens.screens.SecondScreen
import com.eye.onboardingscreens.screens.ThirdScreen

class ViewPagerFragment : Fragment() {
    private lateinit var binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewPagerBinding.inflate(layoutInflater)
        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )
        val adapter = ViewPagerAdapter(fragmentList , requireActivity().supportFragmentManager, lifecycle)

        binding.viewPager.adapter = adapter

        return binding.root
    }
}