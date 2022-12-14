package com.lich.currencyrate.data.repos

import com.lich.currencyrate.data.api.Instance
import com.lich.currencyrate.model.BrB.Belarus_bank
import com.lich.currencyrate.model.BrB.Belarus_bankItem
import com.lich.currencyrate.model.NB.National_bank
import com.lich.currencyrate.model.NB.National_bankItem
import retrofit2.Response

class Repository {
    suspend fun getNB(): Response<National_bank>{
        return Instance.apiNB.getNBCourse()
    }
    suspend fun getBB(): Response<Belarus_bank>{
        return Instance.apiBB.getBBCourse()
    }
}