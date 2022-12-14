package com.lich.currencyrate.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lich.currencyrate.data.repos.Repository
import com.lich.currencyrate.model.NB.National_bank
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel:ViewModel() {
    var repo=Repository()
    val moneyList:MutableLiveData<Response<National_bank>> = MutableLiveData()

    fun getNBMoney(){
        viewModelScope.launch {
            moneyList.value=repo.getNB()

        }
    }
}