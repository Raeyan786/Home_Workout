package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nerworkout.R


class SunDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sundiet_ow)

        val actionBar=supportActionBar

        actionBar!!.title="Sunday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}