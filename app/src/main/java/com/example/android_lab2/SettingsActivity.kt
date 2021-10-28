package com.example.android_lab2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab2.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("msa", "OnCreate in SettingsActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("msa", "onStart in SettingsActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msa", "onResume in SettingsActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("msa", "onPause in SettingsActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msa", "onStop in SettingsActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("msa", "onRestart in SettingsActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msa", "onDestroy in SettingsActivity")
    }
}