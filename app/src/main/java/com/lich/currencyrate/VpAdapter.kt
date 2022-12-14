package com.lich.currencyrate

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lich.currencyrate.screens.first.FirstFragment
import com.lich.currencyrate.screens.second.SecondFragment

class VpAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){

            0->FirstFragment()
            else ->SecondFragment()
        }
    }
}