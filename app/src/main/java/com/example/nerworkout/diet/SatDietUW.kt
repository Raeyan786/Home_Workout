package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nerworkout.R


class SatDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satdiet_uw)

        val actionBar=supportActionBar

        actionBar!!.title="Saturday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}