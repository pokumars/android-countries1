package com.pokumars.countrylist.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CountriesApiService {
    private val BASE_URL ="https://restcountries.eu"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(CountriesApi::class.java)

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
    fun getAfricanCountries(): Single<List<Country>> {
        return api.getAfricanCountries()
    }
}