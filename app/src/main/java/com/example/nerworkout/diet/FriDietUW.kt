package com.example.nerworkout.diet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.nerworkout.R

class FriDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fridiet_uw)

        val actionBar=supportActionBar

        actionBar!!.title="Friday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}