package net.alunando.dicotomiabrasileira.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import net.alunando.dicotomiabrasileira.ui.home.HomeFragment

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        intent.action to HomeFragment
    }
}