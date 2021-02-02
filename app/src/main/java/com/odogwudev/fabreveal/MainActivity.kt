package com.odogwudev.fabreveal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odogwudev.fabreveal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener {
            binding.motionLayout.transitionToState(R.id.transitionEnd)
        }
        binding.ivClose.setOnClickListener {
            binding.motionLayout.transitionToState(R.id.transitionStart)

        }
    }
}