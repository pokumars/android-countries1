package com.pokumars.countrylist.view


import android.app.Activity
import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.content.getSystemService
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager

import com.pokumars.countrylist.R
import com.pokumars.countrylist.viewModel.ListViewModel
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {
    private lateinit var viewModel: ListViewModel
    private val countryListAdapter = CountryListAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        viewModel= ViewModelProviders.of(this).get(ListViewModel::class.java)

        countriesList.apply {
            layoutManager= LinearLayoutManager(context)
            adapter = countryListAdapter
        }

        observeViewModel()

        //observe viewmodel; if error show list error
        viewModel.countriesLoadError.observe(this, Observer {isError->
            isError?.let {
                listError.visibility = if(it) View.VISIBLE else View.GONE
            }
        })

        //observe viewmodel; if loading, dont show list error or list
        viewModel.loading.observe(this, Observer {isLoading->
            isLoading?.let {
                loadingView.visibility= if(it) View.VISIBLE else View.GONE
                if(it){
                    listError.visibility= View.GONE
                    countriesList.visibility = View.GONE
                }
            }
        })
        fetching()
    }

    fun fetching(){
        countriesList.visibility = View.GONE
        listError.visibility = View.GONE
        loadingView.visibility = View.VISIBLE

        viewModel.fetchFromRemote()
    }
    fun observeViewModel(){
        viewModel.countries.observe(this, Observer { countries ->
            countries?.let{
                countriesList.visibility = View.VISIBLE
                countryListAdapter.updateCountryList(countries)
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.main_menu,menu)
        val manager = this.activity?.getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchItem = menu.findItem(R.id.toolbar_search)
        val searchView = searchItem?.actionView as SearchView

        searchView.setSearchableInfo(manager.getSearchableInfo(activity?.componentName))

        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                searchView.setQuery("",false)
                searchItem.collapseActionView()

                Toast.makeText(activity, "Looking for $query", Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                Toast.makeText(activity, "Looking for $newText", Toast.LENGTH_SHORT).show()
                return false
            }
        })

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item!!.itemId

        if(id == R.id.toolbar_search){
            Toast.makeText(activity, "Search", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }




}
