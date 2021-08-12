package net.alunando.dicotomiabrasileira.di

import net.alunando.dicotomiabrasileira.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { HomeViewModel() }
}
