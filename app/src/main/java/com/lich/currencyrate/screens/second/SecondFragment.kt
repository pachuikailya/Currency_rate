package com.lich.currencyrate.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.lich.currencyrate.R
import com.lich.currencyrate.screens.first.FirstAdapter
import com.lich.currencyrate.screens.first.FirstViewModel
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_second, container, false)
        val viewModel= ViewModelProvider(this).get(SecondViewModel::class.java)

        recyclerView=view.rc_sec
        adapter= SecondAdapter()
        recyclerView.adapter=adapter
        viewModel.getBBMoney()
        viewModel.moneyList.observe(viewLifecycleOwner,{ list->
            list.body()?.let { adapter.setList(it) }
        })


        return view
    }



}