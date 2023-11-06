package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavMain.menu.findItem(R.id.fragmentHome).isChecked=true
    }
}