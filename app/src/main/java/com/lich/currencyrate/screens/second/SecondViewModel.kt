package com.lich.currencyrate.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lich.currencyrate.data.repos.Repository
import com.lich.currencyrate.model.BrB.Belarus_bank
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {
    var repo = Repository()
    val moneyList: MutableLiveData<Response<Belarus_bank>> = MutableLiveData()

    fun getBBMoney() {
        viewModelScope.launch {
            moneyList.value = repo.getBB()

        }
    }
}