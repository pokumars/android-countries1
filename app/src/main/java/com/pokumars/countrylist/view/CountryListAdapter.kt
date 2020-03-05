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
        val cName=countryList[position].name

        val cNeighbors = "Neighbors: ${countryList[position].borders?.joinToString()}"
        val cPopulation ="Population: ${countryList[position].population}"
        val cDomain ="Web domain: ${countryList[position].topLevelDomain}"
        val callCode = "Call code: +${countryList[position].callingCodes}"
        val cCapital ="Capital: ${countryList[position].capital}"
        val cDemonym ="Demonym: ${countryList[position].demonym}"

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
