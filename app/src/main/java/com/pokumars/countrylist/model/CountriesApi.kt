package com.pokumars.countrylist.model

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface CountriesApi {

    @GET("rest/v2/name/${"gh"}?fields=name;topLevelDomain;callingCodes;capital;population;demonym;borders;numericCode;flag")
    fun getCountries(): Single<List<Country>>

    @GET("rest/v2/region/Africa?fields=name;topLevelDomain;callingCodes;capital;population;demonym;borders;numericCode;flag")
    fun getAfricanCountries(): Single<List<Country>>

}