package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.nerworkout.R

class FriDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fridiet_ow)

        val actionBar=supportActionBar

        actionBar!!.title="Friday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}