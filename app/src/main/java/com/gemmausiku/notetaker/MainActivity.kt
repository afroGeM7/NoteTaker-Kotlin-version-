package com.gemmausiku.notetaker


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration

import com.gemmausiku.notetaker.databinding.ActivityMainBinding
import com.gemmausiku.notetaker.databinding.ContentMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainBinding: ContentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainBinding = ContentMainBinding.inflate(layoutInflater)
        setSupportActionBar(binding.toolbar)


        val dm = DataManager()
        val adapterChapters = ArrayAdapter<ChapterInfo>(
            this,
            android.R.layout.simple_spinner_item,
            dm.chapters.values.toList()
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        }

        val spinner: Spinner  = findViewById(R.id.spinnerChapters)

        spinner.adapter = adapterChapters




    }

}




