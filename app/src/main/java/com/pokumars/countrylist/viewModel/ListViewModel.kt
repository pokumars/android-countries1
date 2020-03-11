package com.pokumars.countrylist.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pokumars.countrylist.model.Country
import com.pokumars.countrylist.model.CountriesApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers


class ListViewModel :ViewModel(){
    //the data is fetched in this class
    private val countryService = CountriesApiService()
    //allows to get rid of data we no longer need; helps avoid memory leaks
    private val disposable = CompositeDisposable()

    val countries = MutableLiveData<List<Country>>()
    val countriesLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun fetchFromRemote() {
        loading.value= true

        disposable.add(
            countryService.getAfricanCountries()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object: DisposableSingleObserver<List<Country>>(){

                    override fun onSuccess(countryList: List<Country>) {
                        countries.value=countryList
                        countriesLoadError.value = false
                        loading.value= false
                    }

                    override fun onError(e: Throwable) {
                        countriesLoadError.value = true
                        loading.value = false
                        println("---------------------Error-------------------Error-----------------Error")
                        e.printStackTrace()
                    }

                })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }

    fun refresh() {

        countriesLoadError.value = false
        loading.value= false
        fetchFromRemote()

    }

    fun search (theText:String){
        fetchFromRemote()
        val countryList = arrayListOf<Country>()

        countries.value= countryList
        countriesLoadError.value = false
        loading.value= false

        //val urlRemainder ="?fields=name;topLevelDomain;callingCodes;capital;population;demonym;borders;numericCode;flag"
        //val searchText = theText+urlRemainder
    }

}