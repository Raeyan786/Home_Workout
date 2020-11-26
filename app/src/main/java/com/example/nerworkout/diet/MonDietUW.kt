package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.nerworkout.R

class MonDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mondiet_uw)

        val actionBar=supportActionBar

        actionBar!!.title="Monday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}