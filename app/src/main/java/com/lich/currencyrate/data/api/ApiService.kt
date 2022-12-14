package com.lich.currencyrate.data.api

import com.lich.currencyrate.model.BrB.Belarus_bank
import com.lich.currencyrate.model.BrB.Belarus_bankItem
import com.lich.currencyrate.model.NB.National_bank
import com.lich.currencyrate.model.NB.National_bankItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("api/exrates/rates?periodicity=0")
    suspend fun getNBCourse():Response<National_bank>

    @GET("api/kursExchange?city=Столин")
    suspend fun getBBCourse():Response<Belarus_bank>
}