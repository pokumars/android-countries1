package com.pokumars.countrylist.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pokumars.countrylist.model.Country

class DetailViewModel: ViewModel() {
    val country = MutableLiveData<Country>()

    fun setCountryInViewmodel () {
        /*val country1 = Country("Colombia", listOf(".co"), listOf("57")," Bogota",
            "56468435","Colombian",  listOf("Bra","Arg", "Chi"),"123","")*/
        val country1 = Country("", listOf(""), listOf(""),"",
            "","",  listOf(),"","")

        //just a trial to put a value in the detail frag to see how it looks and works
        //empty start value to prevent crashing
        country.value= country1
    }

}