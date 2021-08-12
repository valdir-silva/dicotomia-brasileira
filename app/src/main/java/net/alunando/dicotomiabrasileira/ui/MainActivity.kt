package net.alunando.dicotomiabrasileira.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.alunando.dicotomiabrasileira.ui.home.HomeFragment

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        intent.action to HomeFragment
    }
}