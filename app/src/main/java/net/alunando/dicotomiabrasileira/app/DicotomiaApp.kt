package net.alunando.dicotomiabrasileira.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import net.alunando.dicotomiabrasileira.di.viewModelModule

class DicotomiaApp: Application() {

    override fun onCreate() {
        super.onCreate()

        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@DicotomiaApp)
            // declare modules
            modules(
                listOf(
                    viewModelModule
                )
            )
        }
    }
}
