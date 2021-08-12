package net.alunando.dicotomiabrasileira.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import net.alunando.dicotomiabrasileira.R
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModel()

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

}