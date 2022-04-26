package com.coder.androidbackgroundprocess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.androidbackgroundprocess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHandler.setOnClickListener {
            val intent = Intent(this, ClassHandler::class.java)
            startActivity(intent)
        }

        binding.btnAsynctask.setOnClickListener {
            val intent = Intent(this, ClassAsynctask::class.java)
            startActivity(intent)
        }

        binding.btnCoroutines.setOnClickListener {
            val intent = Intent(this, ClassCoroutines::class.java)
            startActivity(intent)
        }
    }

}