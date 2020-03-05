package com.pokumars.countrylist.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation

import com.pokumars.countrylist.R
import com.pokumars.countrylist.viewModel.DetailViewModel
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {
    private var cName=""

    private var cNeighbors = ""
    private var cPopulation =""
    private var cDomain =""
    private var cCallCode = ""
    private var cCapital =""
    private var cDemonym =""

    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{
            cName=DetailFragmentArgs.fromBundle(it).name
            cNeighbors=DetailFragmentArgs.fromBundle(it).neighbors
            cPopulation=DetailFragmentArgs.fromBundle(it).population
            cDomain=DetailFragmentArgs.fromBundle(it).domain
            cCallCode=DetailFragmentArgs.fromBundle(it).callCode
            cCapital=DetailFragmentArgs.fromBundle(it).capital
            cDemonym=DetailFragmentArgs.fromBundle(it).demonym

        }
        viewModel = ViewModelProviders.of(this).get(DetailViewModel::class.java)
        viewModel.setCountryInViewmodel()
        observeViewModel()

    }

    fun observeViewModel(){
        viewModel.country.observe(this, Observer {country ->
            country?.let {
                countryName.text = cName
                domain.text = cDomain
                callCode.text= cCallCode
                capitalInDetail.text= cCapital
                populationDetail.text = cPopulation
                demonym.text=cDemonym
                neighbors.text = cNeighbors

            }
        })
    }
}
