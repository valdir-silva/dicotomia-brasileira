package net.alunando.dicotomiabrasileira.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
    }
}