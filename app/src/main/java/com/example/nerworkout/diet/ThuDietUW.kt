package com.example.nerworkout.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nerworkout.R


class ThuDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thudiet_uw)

        val actionBar=supportActionBar

        actionBar!!.title="Thusday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}