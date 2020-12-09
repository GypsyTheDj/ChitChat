package com.normannuthu.chitchat.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.normannuthu.chitchat.R

/**
 * A simple [Fragment] subclass.
 * Developed with love by Norman Nuthu.
 */

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment2)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment2)
            }
        }, 3000)

        return inflater.inflate(R.layout.fragment_splash,container,false)

    }

    private fun onBoardingFinished(): Boolean{
        val sharedPref = requireActivity().getSharedPreferences("", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

}