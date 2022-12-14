package com.lich.currencyrate.screens.root

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.lich.currencyrate.R
import com.lich.currencyrate.VpAdapter
import kotlinx.android.synthetic.main.fragment_root.*
import kotlinx.android.synthetic.main.fragment_root.view.*


class RootFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_root, container, false)
        view.tabLayout.tabIconTint=null
        view.view_pager.adapter=VpAdapter(requireContext() as FragmentActivity)
        TabLayoutMediator(view.tabLayout,view.view_pager){
            tab,pos ->
            when(pos){
                0 -> tab.setIcon(R.drawable.nbank)
                1-> tab.setIcon(R.drawable.bbank)
            }
        }.attach()

        return view
    }


}