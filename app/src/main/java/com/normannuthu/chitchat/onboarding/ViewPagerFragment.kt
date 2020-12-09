package com.normannuthu.chitchat.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.normannuthu.chitchat.R
import com.normannuthu.chitchat.onboarding.screens.FirstScreen
import com.normannuthu.chitchat.onboarding.screens.SecondScreen
import com.normannuthu.chitchat.onboarding.screens.ThirdScreen


/**
 * A simple [Fragment] subclass.
 * Developed with Love by Norman Nuthu.
 */

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )



        return view


    }

}