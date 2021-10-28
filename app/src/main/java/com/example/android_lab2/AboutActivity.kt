package com.example.android_lab2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab2.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("msa", "OnCreate in AboutActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("msa", "onStart in AboutActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msa", "onResume in AboutActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("msa", "onPause in AboutActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msa", "onStop in AboutActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("msa", "onRestart in AboutActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msa", "onDestroy in AboutActivity")
    }

}