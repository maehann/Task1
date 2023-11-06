package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.ui.setupWithNavController
import com.example.task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavMain.menu.findItem(R.id.fragmentHome).isChecked = true

        //nav component
        val navHost = supportFragmentManager.findFragmentById(R.id.main_nav_host) as NavHost
        navController=navHost.navController
        binding.bottomNavMain.setupWithNavController(navController)
    }
}