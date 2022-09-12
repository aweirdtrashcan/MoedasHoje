package com.aweirdtrashcan.moedashoje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.aweirdtrashcan.moedashoje.databinding.ActivityMainBinding
import com.google.android.material.R.layout.support_simple_spinner_dropdown_item as arrayAdapterLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val customList = arrayOf<String>("BRL", "USD", "EUR")
        val adapter = ArrayAdapter<String>(this, arrayAdapterLayout, customList)

        binding.spinnerCurrencies.adapter = adapter


    }
}