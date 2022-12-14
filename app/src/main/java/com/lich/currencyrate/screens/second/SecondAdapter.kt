package com.lich.currencyrate.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lich.currencyrate.R
import com.lich.currencyrate.model.BrB.Belarus_bankItem
import kotlinx.android.synthetic.main.item_br_b.view.*

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    var listSecond= emptyList<Belarus_bankItem>()
    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_br_b, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.brb_name_usd.text= "USD"
        holder.itemView.brb_buy_usd.text= listSecond[position].USD_in
        holder.itemView.brb_sale_usd.text= listSecond[position].USD_out

        holder.itemView.brb_name_eur.text= "EUR"
        holder.itemView.brb_buy_eur.text= listSecond[position].EUR_in
        holder.itemView.brb_sale_eur.text= listSecond[position].EUR_out

        holder.itemView.brb_name_rub.text= "RUB"
        holder.itemView.brb_buy_rub.text= listSecond[position].RUB_in
        holder.itemView.brb_sale_rub.text= listSecond[position].RUB_out

        holder.itemView.brb_name_pln.text= "PLN"
        holder.itemView.brb_buy_pln.text= listSecond[position].PLN_in
        holder.itemView.brb_sale_pln.text= listSecond[position].PLN_out
    }

    override fun getItemCount(): Int {
        return  listSecond.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<Belarus_bankItem>){
        listSecond=list
        notifyDataSetChanged()
    }
}