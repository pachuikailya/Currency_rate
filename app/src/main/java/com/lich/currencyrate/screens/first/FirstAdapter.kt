package com.lich.currencyrate.screens.first

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lich.currencyrate.R
import com.lich.currencyrate.model.NB.National_bankItem
import kotlinx.android.synthetic.main.item_nb.view.*

class FirstAdapter:RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    var listFirst= emptyList<National_bankItem>()
    class FirstViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_nb, parent, false)
        return FirstViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.itemView.nb_name.text=listFirst[position].Cur_Abbreviation
        holder.itemView.nb_buy.text= listFirst[position].Cur_OfficialRate.toString()
    }

    override fun getItemCount(): Int {
        return listFirst.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<National_bankItem>){
        listFirst=list
        notifyDataSetChanged()
    }
}