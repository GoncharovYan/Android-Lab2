package com.example.android_lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.android_lab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SettingsBtn.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        binding.AboutBtn.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        Log.d("msa", "OnCreate in MainActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("msa", "onStart in MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msa", "onResume in MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("msa", "onPause in MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msa", "onStop in MainActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("msa", "onRestart in MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msa", "onDestroy in MainActivity")
    }
}