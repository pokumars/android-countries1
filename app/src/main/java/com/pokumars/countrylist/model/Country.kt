package com.pokumars.countrylist.model

data class Country(
    val name: String?,
    val topLevelDomain: List<String?>?,
    val callingCodes: List<String?>?,
    val capital: String?,
    val population: String?,
    val demonym: String?,
    val borders: List<String?>?,
    val numericCode: String?,
    val flag: String?
){
    override fun toString(): String {
        return "$name, capital- $capital, $population people are $demonym. The call code is +${callingCodes?.joinToString()}"
    }
}