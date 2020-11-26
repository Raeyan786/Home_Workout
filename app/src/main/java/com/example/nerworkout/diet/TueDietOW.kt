package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nerworkout.R


class TueDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuediet_ow)

        val actionBar=supportActionBar

        actionBar!!.title="Tuesday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}