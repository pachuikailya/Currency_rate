package com.lich.currencyrate.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Instance {
    private val retrofitNB by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.nbrb.by/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiNB:ApiService by lazy {
        retrofitNB.create(ApiService::class.java)
    }

    private val retrofitBB by lazy {
        Retrofit.Builder()
            .baseUrl("https://belarusbank.by/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiBB:ApiService by lazy {
        retrofitBB.create(ApiService::class.java)
    }


}