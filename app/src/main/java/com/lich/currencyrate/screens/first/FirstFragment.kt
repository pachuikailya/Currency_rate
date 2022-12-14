package com.lich.currencyrate.screens.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.lich.currencyrate.R
import com.lich.currencyrate.VpAdapter
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {
lateinit var recyclerView:RecyclerView
lateinit var adapter: FirstAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v=inflater.inflate(R.layout.fragment_first, container, false)
        val viewModel=ViewModelProvider(this).get(FirstViewModel::class.java)

        recyclerView=v.rc_first
        adapter= FirstAdapter()
        recyclerView.adapter=adapter
        viewModel.getNBMoney()
        viewModel.moneyList.observe(viewLifecycleOwner,{ list->
            list.body()?.let { adapter.setList(it) }
        })
        return v
    }


}