package com.lich.currencyrate.model.BrB

data class Belarus_bankItem(
    val EUR_in: String,
    val EUR_out: String,
    val PLN_in: String,
    val PLN_out: String,
    val RUB_EUR_in: String,
    val RUB_EUR_out: String,
    val RUB_in: String,
    val RUB_out: String,
    val USD_EUR_in: String,
    val USD_EUR_out: String,
    val USD_RUB_in: String,
    val USD_RUB_out: String,
    val USD_in: String,
    val USD_out: String,
    val filial_id: String,
    val filials_text: String,
    val home_number: String,
    val name: String,
    val name_type: String,
    val sap_id: String,
    val street: String,
    val street_type: String
)