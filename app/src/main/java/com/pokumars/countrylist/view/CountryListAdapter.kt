package com.pokumars.countrylist.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.pokumars.countrylist.R
import com.pokumars.countrylist.model.Country
import com.pokumars.countrylist.util.getProgressDrawable
import com.pokumars.countrylist.util.loadImage
import kotlinx.android.synthetic.main.item_country.view.*

class CountryListAdapter (val countryList: ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {
    fun updateCountryList(newCountryList: List<Country>){
        countryList.clear()
        countryList.addAll(newCountryList)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_country,parent, false)

        return CountryViewHolder(view)
    }

    override fun getItemCount()=countryList.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val theCountry = countryList[position]

        val cName=theCountry.name
        val cNeighbors = "Neighbors: ${theCountry.borders?.joinToString()}"
        val cPopulation ="Population: ${theCountry.population}"
        val cDomain ="Web domain: \"${(theCountry.topLevelDomain)?.joinToString()}\""
        val callCode = "Call code: +${theCountry.callingCodes?.joinToString()}"
        val cCapital ="Capital: ${theCountry.capital}"
        val cDemonym ="Demonym: ${theCountry.demonym}"

        holder.view.itemName.text = cName
        holder.view.itemCapitalCity.text = cCapital
        holder.view.itemPopulation.text = cPopulation

        holder.view.setOnClickListener {
            Navigation.findNavController(it).navigate(ListFragmentDirections.actionDetailFragment
                (cName!! ,cCapital,callCode,cPopulation,cNeighbors,cDomain, cDemonym))
        }

        //loadImage is our own extension function that we made to load images seamlessly w/ spinner
        holder.view.itemFlag.loadImage(countryList[position].flag!!, getProgressDrawable(holder.view.itemFlag.context))

    }

    class CountryViewHolder(var view: View) :RecyclerView.ViewHolder(view)
}
