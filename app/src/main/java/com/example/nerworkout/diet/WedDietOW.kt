package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nerworkout.R


class WedDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weddiet_ow)

        val actionBar=supportActionBar

        actionBar!!.title="Wednessday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}