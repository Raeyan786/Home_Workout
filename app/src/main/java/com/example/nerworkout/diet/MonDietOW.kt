package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.nerworkout.R

class MonDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mondiet_ow)

        val actionBar=supportActionBar

        actionBar!!.title="Monday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}