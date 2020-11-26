package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nerworkout.R


class WedDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weddiet_uw)

        val actionBar=supportActionBar

        actionBar!!.title="Wednesday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}