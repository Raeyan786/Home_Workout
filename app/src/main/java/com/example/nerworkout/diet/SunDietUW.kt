package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nerworkout.R


class SunDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sundiet_uw)

        val actionBar=supportActionBar

        actionBar!!.title="Sunday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}